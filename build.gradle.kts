import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1"
}

group = "org.example"
version = "2.0"

repositories {
    mavenCentral()
    google()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.18")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.18")
    testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.6.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
    finalizedBy("testReportExam")
}

tasks.register<TestReportExam>("testReportExam")


ktlint {
    ignoreFailures.set(true)
    enableExperimentalRules.set(false)
    outputToConsole.set(true)
    outputColorName.set("RED")
    reporters {
        reporter(ReporterType.JSON)
    }
}

tasks.withType<org.jlleitschuh.gradle.ktlint.tasks.GenerateReportsTask> {
    reportsOutputDirectory.set(
        project.layout.buildDirectory.dir("ktlint-result")
    )
}
