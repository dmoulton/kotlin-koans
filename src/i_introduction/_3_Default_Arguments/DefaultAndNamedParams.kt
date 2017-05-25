package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloads of 'JavaCode3.foo()' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add parameters and replace 'todoTask3()' with a real body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

fun foo(name: String,
        number: Int = -1,
        toUpperCase: Boolean = false): String {
    val s = if (number < 0) {
        name
    } else {
        name + number.toString()
    }

    return if (toUpperCase) {
        s.toUpperCase()
    } else {
        s
    }
}

fun task3(): String {
    //todoTask3()
    return (foo("a", number = 42) +
            foo("b", number = 1) +
            foo("c", number = 42, toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}
