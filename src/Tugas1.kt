fun main() {
    // Soal Nomer 1
    var a = 1
    var b = 2
    // Cara 1
    a -= b
    b += a
    a = b - a
    println(a)
    println(b)
    // Cara 2
    a = b.also { b = a }
    println(a)
    println(b)

    // Soal Nomer 2
    // 5 Kegiatan saya dari bangun tidur
    println("5 kegiatan saya setelah bangun tidur")
    println("1. Mandi")
    println("2. Sholat")
    println("3. Makan")
    println("4. Cek Email")
    println("5. Belajar/Nugas")
}