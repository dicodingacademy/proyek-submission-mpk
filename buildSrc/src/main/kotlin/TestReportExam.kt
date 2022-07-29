import com.google.gson.GsonBuilder
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

data class Result (val isPassed: Boolean, val testcaseName: String, val errorMessage: String?)

abstract class TestReportExam : DefaultTask() {
    @TaskAction
    fun run() {
        println('\u000C')

        val file = "${project.buildDir}/test-results/test/TEST-ExamTest.xml"
        if (!File(file).isFile) {
            return println("Test report no found")
        }

        val factory = DocumentBuilderFactory.newInstance()
        val builder = factory.newDocumentBuilder()
        val doc = builder.parse(File(file))

        doc.normalizeDocument()

        val results = mutableListOf<Result>()
        val testcaseNodes = doc.getElementsByTagName("testcase")
        repeat(testcaseNodes.length) {
            val testsuite = testcaseNodes.item(it) as Element
            val failure = testsuite.getElementsByTagName("failure").item(0) as? Element
            if (failure !== null) {
                val testcaseName = testsuite.getAttribute("name")
                val errorMessage = failure.getAttribute("message").split("AssertionFailedError: ").last()
                colored(enabled = true) {
                    println( " ERROR ".red.bold + " " + errorMessage.bold.reverse + " " + testcaseName + " " + testsuite.getAttribute("name"))
                }
                results.add(Result(false, testcaseName, errorMessage))
            } else {
                colored(enabled = true) {
                    println(" SUCCESS ".green.bold + testsuite.getAttribute("name"))
                }
                results.add(Result(true, testsuite.getAttribute("name"), null))
            }
        }

        val result = GsonBuilder().setPrettyPrinting().create()
        File(project.projectDir.toString() +  "/result.json").writeText(result.toJson(results))

    }
} 