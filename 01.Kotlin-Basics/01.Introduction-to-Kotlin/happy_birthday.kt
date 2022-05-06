fun printBorder(border: String, times: Int) {
    repeat(times) {
        print(border)
    }
    println()
}

fun printCakeTop(age: Int) {
    printBorder("=", age)
}

fun printCandles(age: Int) {
    print("")
    repeat(age) {
        print(",")
    }
    println()

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeBottom(age: Int, layer: Int) {
    repeat(layer) {
        repeat(age + 2) {
            print("%")
        }
        println()
    }
    println()
}

fun main() {
    var age = 20
    val name = "Van Loc"
    var border = "`-._,-'"
    val times = 5
    printBorder(border, times)
    print("Happy birthday ${name}\n")
    printBorder(border, times)

    // print a birthday cake
    printCakeTop(age)
    printCandles(age)
    printCakeBottom(age, 4)
    printBorder(border, times)
    
    //print an empty line
    println("")
    
    
    println("You are ${age} now")
    println("${age} is a very good age to celebrate")
    
    // name = "Nguyen Van Loc" // error
}