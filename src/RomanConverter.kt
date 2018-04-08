class RomanConverter {

    fun convert(integer:Int) : String{
        return when(integer){
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            else -> "unsupported"
        }
    }
}