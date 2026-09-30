import kotlin.system.exitProcess
import kotlin.math.sqrt

fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Error: values for a, b, c required on command line") // Error msg if < 3 values are inputted
        exitProcess(1)

    }
    // Converting each input into a number to preform maths operations on
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    // Maths operations
    val s = ((a+b+c)/2)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))

    val formattedArea = "%.5f".format(area) // formatting the output to 5 decimal places
    println("Area = " + formattedArea)
}