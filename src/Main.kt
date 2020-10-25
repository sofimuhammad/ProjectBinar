fun main() {
    argument('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
//    println(arithmeticSeriesSum(n = 10))
//    println(arithmeticSeriesSum(a = 3, n = 10, d = 2))
//    println(arithmeticSeriesSum(3, n = 10))
}

fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int {
    return n/2 * (2*a + (n-1)*d)
}

fun argument(vararg test: Char){
    println(test[0])
    println(test[3])
    println(test[0])
    println(test[7])
}
