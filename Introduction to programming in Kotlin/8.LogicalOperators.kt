fun main() {
    val isActive = true
    val score = 100
    val internetSpeed = 5000
    if (isActive && score == 100 && internetSpeed == 5000 ) {
        println("you will go to next level")
    }
    else
        print("you have failed the current level")

    val num1 = -5
    val num2 = -3
    val text = if (num1 > 0 || num2 > num1) {
        println("the condition is true")
        "Level Up" //value of the expression that will be stored in text.
    }
    else
        "Level Down" //value of the expression that will be stored in text.
    println("$text")

    /**
     * shortcut methord for if then else statement as expression
     */

    val tex =  if (num1 > 0 || num2 > num1)  5 else "Level Down" //it works if no other statements exists
    println("${tex::class}")
}