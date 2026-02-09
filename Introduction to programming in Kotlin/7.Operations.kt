fun main () {
    val x = 5
    val y = 4
    println("z = ${x + y}")
    println(x + y)

    //Practice 4: 1.Basic Arithmetic Operations
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    // Practice 4: 2. print expression directly
    println("3 + 3 * 4 = ${3 + 3 * 4}")

    var result = x + y
    /*
     * prefix operations
     * shortcuts for Arithmetic Operation
     */
   result += 2  //same as result = result + 2
    println(result)

    result -= 2
    println(result)

    result *= 2
    println(result)

    result /= 2
    println(result)

    result %= 2
    println(result)

    /*
    * postfix operations
    * prints the value and then does the operation
     */
    var a = 0
    println("a = $a")
    println("a++ = ${a++}")
    println("a = $a")

    println("a = $a")
    println("a-- = ${a--}")
    println("a = $a")

    /*
    * prefix operations
    * does the operation and then prints the value.
     */

    println("a = $a")
    println("++a = ${++a}")
    println("a = $a")

    println("a = $a")
    println("--a = ${++a}")
    println("a = $a")
    ifCondition( )
    bracketCondition( )
    firstConditionSkip( )
    elseIfCondition()
    lessThanOrEqualToElseIfCondition()
    NotEqualToTrue()
}
fun ifCondition ( ) {
    val isActive = true
    if (!isActive) {
        println("The condition is true")
    }
    else{
        println("The condition is false")
    }
}
fun bracketCondition () {
    val myNumber = 5
    if (myNumber >= 5)
        println("The condition is true")
    else
        println("The condition is false")
}
fun firstConditionSkip() {
    val myNumber = 4
    if (myNumber >= 5)
        println("my number is five") // only this line is skipped
        println("refer above")
        println("refer above")
}
fun elseIfCondition() {
    val myValue = 5
    if (myValue < 2)
        println("The number is less than 2")
    else if (myValue < 3)
        println("The number is less than 3")
    else if (myValue < 4)
        println("The number is less than 4")
    else
        println("The number is grater than or equal to 5")
}
fun lessThanOrEqualToElseIfCondition() {
    val myValue = 150
    if (myValue != 150) //not equal to operator
        println("The number is less than 150")
    else if (myValue <= 150)  // less than or equal to operator
        println("The number is less than  or equal to 150")
    else
        println("The number is grater than 150")
}
fun NotEqualToTrue() {
    val myValue = true
    if (!myValue) // not equal to operation with boolean operators
        println("The user is not active")
    else
        println("The user is active")
}