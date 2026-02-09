fun main() {/*
    * you can call a function multiple times.
     */
    sayHello("max", 22) //input

    //using function with if else
    val internetConnection = true
    if (internetConnection) {
        getData()
    } else {
        showMessage()
    }

    // return a variable
    val max = maxValue(9, 7)
    println("max value of two numbers is $max")

    val max2 = maxValue2(9, 7)
    println("max value of two numbers is $max2")

    sendMessage(
        name = "max"
    )
}

fun sayHello(name: String, age: Int) {   // input parameter: input type
    println("hello, I am $name . age = $age")
    val num = age //local variable
}

fun getData() {
    println("getting some data.")
}

fun showMessage() {
    println("no internet connection")
}

fun maxValue(a: Int, b: Int): Int {
    // val max = if (a > b) a else b
    // return max

    /*
     * after seeing return keyword the function is exited. so any statement after return is unreadable by
     * the compiler. multiple return types cant exist inside a function normally. we can bypass this using by placing
     * the return value in multiple branches of a function(example if else).
     */

    if (a > b) return a else return b

}

// shor cut for function with single expression.
fun maxValue2(a: Int, b: Int) = if (a > b) a else b

// Parameters with default values.
fun sendMessage (name: String =" enter user name", message: String = defaultMessage() ){
println("USER NAME $name.MESSAGE TO USER $message")
}

fun defaultMessage(): String{
        return "enter email ID"
}