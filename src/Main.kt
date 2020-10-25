fun main() {
    argument('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')
//    println(arithmeticSeriesSum(n = 10))
//    println(arithmeticSeriesSum(a = 3, n = 10, d = 2))
//    println(arithmeticSeriesSum(3, n = 10))
}

fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int {
    return n/2 * (2*a + (n-1)*d)
}

fun argument(vararg test: Char){
    print(test[0])
    print(test[3])
    print(test[0])
    print(test[7])
    print(test[8])
}
