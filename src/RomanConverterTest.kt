import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanConverterTest {

    @Test
    fun `convert 1 return I`(){
        val convertedValue = RomanConverter().convert(1)

        assertEquals("I", convertedValue)
    }

}
