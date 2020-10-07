fun main(){

    // Soal 1
    fun cetakSegitiga(num: Int){
        var k = 0
        for (i in 1..num) {
            for (spasi in 1..num - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
            k = 0
        }
    }
    cetakSegitiga(4)

    // Soal 2
    fun cetakSquare(num: Int) {
        for (i in 1..num){
            for (x in 1 until num){
                print("*")
            }
            println("*")
        }
    }
    cetakSquare(4)

    // Soal 3
    fun gradeCheck(num: Int): String{
        return if (num>=65)"Lulus!"
        else "Tidak Lulus"
    }
    println(gradeCheck(65))
}