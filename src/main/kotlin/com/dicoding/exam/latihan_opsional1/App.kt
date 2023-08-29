/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan_opsional1

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string berupa kode warna dalam format 6 digit hexadesimal. Contoh: #FFFFFF atau #OOOOOO.
 *  - Fungsi mengembalikan class RBG dengan parameter r untuk merah, g untuk hijau dan b untuk biru.
 *    Dimana masing-masing paramter tersebut bertipe Interger dengan rentang nilai 0-255.
 *
 *  Contoh:
 *  Input = #FF2231 -> Output = RGB(r=255, g=34, b=49)
 *  Input = #123456 -> Output = RGB(r=18, g=52, b=86)
 */

data class RGB(val r: Int, val g: Int, val b: Int)

fun hexColorToRGB(color: String): RGB {
    return RGB(0, 0, 0)
}

fun main() {
    println("${hexColorToRGB("#123456") == RGB(18, 52, 86)}")
}
