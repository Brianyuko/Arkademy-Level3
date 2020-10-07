fun main() {
    /*
    *1. Jelaskan cara membuat sebuah function di Kotlin dengan menggunakan comment,
    *fun namaFunction(namaParameter: Tipedata): returnTipeData {
    *  return namaParameter
    *}
    **/

    // Soal 1
    fun salam(nama: String): String{
        return "Halo $nama selamat pagi!"
    }
    val morning = salam("Dini")
    println(morning)

    // Soal 2
    fun tambah(bilanganPertama: Int, bilanganKedua: Int): Int{
        return bilanganPertama+bilanganKedua
    }
    println(tambah(3,4))
}