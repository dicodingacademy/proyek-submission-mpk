# Exam 4 - Object-Oriented Programming (OOP)

## Ketentuan

**Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:**

1. Mengubah kode fungsi `main()` yang berada di dalam file `Exam4Main.kt`
2. Menghapus atau mengubah nama fungsi dan variable yang sudah ada di dalam file `Exam4.kt`
3. Membuat fungsi baru yang bukan merupakan tugas latihan
4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)

## Instruksi

Untuk mengerjakan soal latihan ini, silakan buka file `Exam4.kt`.

### TODO

Lengkapi class `Car` dan `ElectricCar` agar dapat berjalan sesuai ketentuan berikut:

1. **Class `Car`**
    - Tambahkan **property** `brand` (String) dan `year` (Int)
    - Tambahkan **method** `getCarInfo()` yang mengembalikan informasi dalam format:
      ```
      $brand keluaran tahun $year
      ```

2. **Class `ElectricCar`** (subclass dari `Car`)
    - Tambahkan **property** `batteryCapacity` (Int)
    - Override method `getCarInfo()` agar mengembalikan informasi dalam format:
      ```
      $brand keluaran tahun $year dengan kapasitas baterai $batteryCapacity kWh
      ```

#### Contoh 1:

- Masukan (kode di main):
  ```kotlin
  val car = Car("Toyota", 2020)
  println(car.getCarInfo())
- Keluaran: `Toyota keluaran tahun 2020`
- Penjelasan: Object `Car` dibuat dengan brand `Toyota` dan year `2020`. Method `getCarInfo()` menampilkan data sesuai
  format.

#### Contoh 2:

- Masukan (kode di main):
  ```kotlin
  val electricCar = ElectricCar("Tesla", 2023, 100)
  println(electricCar.getCarInfo())
- Keluaran: `Tesla keluaran tahun 2023 dengan kapasitas baterai 100 kWh`
- Penjelasan: Object `ElectricCar` dibuat dengan brand `Tesla`, year `2023`, dan kapasitas baterai `100`. Method
  `getCarInfo()` menampilkan data sesuai format method override.

## Menguji Kode

Untuk menguji kode, silakan jalankan fungsi `main` pada file `Exam4Main.kt`.

Jika kode pada `Exam4.kt` sudah diperbaiki sesuai ketentuan, maka keluarannya akan seperti berikut:

```
Toyota keluaran tahun 2020
Tesla keluaran tahun 2023 dengan kapasitas baterai 100 kWh
```