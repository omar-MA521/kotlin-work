// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    println(args[0] + args[1])
    if (args.size != 2)
    println("Please provide two arguments")
    exitProcess(1)

}