fun main() {
/*
* all variable types in kotlin are not nullable by default in kotlin.but by placing a question mare we can make
it nullable.

* the initial variable must always be null in order to find length if it is declared nullable.or else similar
error will appear "Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type 'String?'."

* or else you can use if condition if (variableName != null) { print(variableName.length) }

* or shortcut print(variableName?.length) - it is known as safe call operator
Safe call operator
The safe call operator ?. allows you to handle nullability safely in a shorter form. Instead of throwing an NPE,
if the object is null, the ?. operator simply returns null.

* or Not-null assertion operator(!!)
The not-null assertion operator !! converts any value to a non-nullable type.
When you apply the !! operator to a variable whose value is not null, it's safely handled as a non-nullable type, and
the code executes normally. However, if the value is null, the !! operator forces it to be treated as non-nullable,
which results in an Null Pointer Exception.  }
 */
    var text : String? = "yellow"
//    print(text)
//    text = "yelloe"
    var variableName : String? = "yell"
    if (text != null)
        println(text.length)
    else
        println("The variable is null")
    println(variableName?.length)
    text = null
    println(text?.length)
    // println(text!!.length) // through's a Null Pointer Exception
    text = null
    var text2 : String = text ?: "the text is null" // shortcut for if else loop null check
    println(text2)
}