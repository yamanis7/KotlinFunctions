fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}
fun main(args: Array<String>) {
    //Default Argument
    displayBorder()
    println()
    displayBorder('*') //Mengubah char
    println()
    displayBorder('*', 5) //Mengubah jumlah panjang
    println()
    println()

    //Named Argument
    displayBorder(length = 5)
    println()
    displayBorder(character = '*')
}