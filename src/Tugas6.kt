fun main() {


    // Soal 1
    /* Array merupakan kumpulan dari data-data tunggal yang dijadikan dalam 1 variabel array yang alamat memorinya
    *berbeda yang selanjutnya disebut elemen-elemen array yang bisa kita akses berdasarkan indeks.
    **/

    // Soal 2
    /*Collections sendiri merupakan sebuah objek yang bisa menyimpan kumpulan objek lain termasuk data class.
    *Dengan collection kita bisa menyimpan banyak data sekaligus.
    *Di dalam collections terdapat beberapa objek turunan, di antaranya adalah List, Set, dan Map.
    **/

    // Soal 3
    val hargaBarang = intArrayOf(15000, 9000, 5000, 25000)
    var totalHarga = 0
    hargaBarang.forEach({ totalHarga += it })
    println("total harga: $totalHarga")

    // Soal 4
    val buahTambah: List<String> = listOf("Buah Naga", "Alpokat", "Mangga", "Nanas", "Kiwi")
    val buahFavorit: MutableList<String> = mutableListOf("Jambu", "Nangka", "Melon", "Pisang", "Jeruk")
    println(buahFavorit.toList())
    for (i in buahTambah){
        buahFavorit.add(i)
    }
    println(buahFavorit.toList())
}