class Structure() {
    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}
fun boolean() {
    val a = true
    val b = false
    var result: Boolean

    result = a or b // a.or(b)
    println("result = $result")

    result = a and b // a.and(b)
    println("result = $result")
}
fun main(args: Array<String>) {
    val p = Structure()
    p createPyramid 4       // p.createPyramid(4)

    boolean()
}