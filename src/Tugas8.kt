fun main(){

    // Soal 1
    fun arkademy(num: Int){
        for (i in 1..num){
            if (i%3 == 0 && i%5==0){
                println("Arkademy")
            }else if(i%3 == 0){
                println("arka")
            }else if (i%5 == 0){
                println("demy")
            }else{
                println(i)
            }
        }
    }
    arkademy(15)

    // Soal 2
    fun bilanganGanjil(num: Int) {
        return println(num%2!=0)
    }
    fun bilanganGenap(num: Int) {
        return println(num%2==0)
    }
    bilanganGanjil(4)
    bilanganGanjil(5)
    bilanganGenap(6)
    bilanganGenap(7)
}