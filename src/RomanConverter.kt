class RomanConverter {

    fun convert(inputNumber:Int) : String{
        if (inputNumber > 10) {
            val tens = inputNumber / 10
            return "${convertTens(tens)}${convert(inputNumber - tens * 10)}"
        }
        return when(inputNumber){
            0 -> ""
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            10 -> "X"
            else -> "unsupported"
        }
    }

    fun convertTens(inputNumber: Int) : String {
        var remainingNumber = inputNumber
        var output = ""
        if(remainingNumber >= 10){
            remainingNumber -= 10
            output += "C"
        }
        if(remainingNumber >= 5){
            remainingNumber -= 5
            output += "L"
        }
        for (i in 1 .. remainingNumber)
            output += "X"
        return output
    }
}