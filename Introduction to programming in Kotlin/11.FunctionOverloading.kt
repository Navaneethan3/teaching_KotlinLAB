fun main() {
    getData(9.7, 5.2)
    val g = getData(9.7, 5.2, 6.7)
    println(g)

}

fun getData(a: Int, b: Int) = if (a > b) a else b  // overloading by changing type.

// duplicate line is cont + d,formate line is cont + alt + l, context or action  alt + enter
fun getData(a: Double, b: Double) = if (a > b) a else b

fun getData(a: Double, b: Double, c: Double) = if (a >= b && a >= c) a else if (b >= a && b >= c) b else c
