fun main() {

    // Soal 1
    /*
    *if(kondisi yang akan di check) yang akan dilakukan jika kondisi sesuai
    *else yang akan dilakukan jika kondisi tidak sesuai
    **/

    // Soal 2
    fun cekNumber(num: Int){
        when (num){
            1 -> println("Satu")
            2 -> println("Dua")
            3 -> println("Tiga")
            4 -> println("Empat")
            5 -> println("Lima")
            6 -> println("Enam")
            7 -> println("Tujuh")
            8 -> println("Delapan")
            9 -> println("Sembilan")
            10 -> println("Sepuluh")
            else -> println("Tidak terdaftar")
        }
    }
    for(i in 1..11){
        cekNumber(i)
    }

    // Soal 3
    fun salam(num: Int): String {
        when (num) {
            in 1..10 -> {
                // Return Selamat Pagi
                return "Selamat Pagi!"
            }
            in 11..14 -> {
                // Return Selamat Siang
                return "Selamat Siang!"
            }
            in 15..18 -> {
                // Return Selamat Sore
                return "Selamat Sore!"
            }
            in 19..24 -> {
                // Return Selamat Malam
                return "Selamat Malam!"
            }
            else -> {
                // Return Jam salah atau tidak ada
                return "Jam salah atau tidak ada"
            }
        }
    }
    println(salam(19))

    // Soal 4
    /*
    * == operator digunakan untuk membandingkan data dari dua variabel.
    * sedangkan kalau === operator yang digunakan untuk membandingkan variabel atau objek.
    * != akan membandingkan jika kedua nilai tidak sama satu sama lain.
    * !== akan membandingkan jika kedua nilai variabel/objek tidak sama satu sama lain.
    **/
}