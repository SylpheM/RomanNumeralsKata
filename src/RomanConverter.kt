import kotlin.math.min

class RomanConverter {

    data class Reference(val number: Int, val letter: String)

    private val references = listOf(
            Reference(1000, "M"),
            Reference(500, "D"),
            Reference(100, "C"),
            Reference(50, "L"),
            Reference(10, "X"),
            Reference(5, "V"),
            Reference(1, "I")
    )

    fun convert(inputNumber:Int) : String{
        var remaining = inputNumber
        var output = ""
        while(remaining > 0){
            for (i in references.indices) {
                val ref = references[i]

                if (remaining >= ref.number){
                    output += ref.letter
                    remaining -= ref.number
                    break
                } else {
                    for (j in i+1 until min(references.size, i + 3) ){
                        val nextRef = references[j]
                        val virtualRef = ref.number - nextRef.number
                        if (remaining >= virtualRef && virtualRef != nextRef.number){
                            output += nextRef.letter + ref.letter
                            remaining -= virtualRef
                            break
                        }
                    }
                }
            }
        }
        return output
    }
}