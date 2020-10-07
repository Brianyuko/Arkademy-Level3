fun main() {
    // Soal 1
    /*
    *Looping adalah suatu bentuk perintah mengulang suatu statement sampai batas yang ditentukan Contoh:
    *for (i in 1..10){
    * if ( i%2 != 0){// Syarat bilangan ganjil
    *    continue // Jika Syarat terpenuhi, maka akan di skip
    *    }
    *    println("$i adalah angka genap")
    *}
    **/

    // Soal 2
    fun loopNum(num: Int){
        for(i in 0..num){
            println(i)
        }
    }
    loopNum(6)

    // Soal 3
    fun cekGanjilGenap(num: Int): String{
        return if(num%2 == 0){
            "Genap"
        }else{
            "Ganjil"
        }
    }
    println(cekGanjilGenap(99))
    println(cekGanjilGenap(100))

    // Soal 4
    fun deretGanjilGenap(num: Int){
        for (i in 1..num){
            if (i%2 == 0){
                println("$i adalah bilangan genap")
            }else{
                println("$i adalah bilangan ganjil")
            }
        }
    }
    deretGanjilGenap(4)
}