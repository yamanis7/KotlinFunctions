fun fungsi() {
    println("Memanggil class fungsi")
    println("dengan 'fungsi()' dalam fun main()")
}
fun tambah(a1 : Int, a2 : Int): Int {
    val x = a1 + a2
    return x
}
fun main() {
    fungsi() //function fungsi tidak akan dieksekusi jika nama function tidak dipanggil
    println()

    val angka1 = 5
    val angka2 = 10
    val hasil: Int

    hasil = tambah(angka1, angka2)
    println("hasil = $hasil")
}