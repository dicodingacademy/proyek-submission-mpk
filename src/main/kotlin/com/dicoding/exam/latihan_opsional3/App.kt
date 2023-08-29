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

package com.dicoding.exam.latihan_opsional3

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dan integer dengan rentang 1-100.
 *  - Fungsi harus mengembalikan string dengan ketentuan:
 *      - Jika string mengandung angka, maka kalikan angka pada string dengan angka yang diinput. Kemudian gabungkan dengan string yang diinput.
 *      - Jika string tidak mengandung angka, maka gabungkan angka yang dinput ke string yang diinput.
 *
 *  Contoh:
 *  Input = str=dicoding123, int=10 -> Output = dicoding1230
 *  Input = str=Dicoding000010, int=100 -> Output = Dicoding1000
 *  Input = str=dicoding, int=100  -> Output = dicoding100
 */

fun manipulateString(str: String, int: Int): String {
    return ""
}

fun main() {
    println(manipulateString("Dicoding000010", 100) == "Dicoding1000")
    println(manipulateString("dicoding", 99) == "dicoding99")
}
