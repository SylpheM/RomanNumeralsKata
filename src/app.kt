

fun main(args: Array<String>){
    println("Hello!")
    println("Welcome to the converter to roman numerals !")
    waitInput()
}

private fun waitInput() {
    print("Enter a number : ")
    val input = readLine()
    if (input == null || input.isBlank()) {
        println("Please enter something!")
        waitInput()
    } else if (input.toIntOrNull() == null){
        println("Please enter a number!")
        waitInput()
    } else {
        convertInput(input)
    }
}

private fun convertInput(input: String) {
    val romanConverter = RomanConverter()
    println(romanConverter.convert(input.toInt()))
    println("Have a nice day =D")
}