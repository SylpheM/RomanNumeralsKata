import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*

class RomanConverterTest {

    @Test
    fun `convert 1 return I`(){
        val convertedValue = RomanConverter().convert(1)
        assertThat(convertedValue).isEqualTo("I")
    }

    @Test
    fun `convert 2 return II`(){
        val convertedValue = RomanConverter().convert(2)
        assertThat(convertedValue).isEqualTo("II")
    }

    @Test
    fun `convert 3 return III`(){
        val convertedValue = RomanConverter().convert(3)
        assertThat(convertedValue).isEqualTo("III")
    }

    @Test
    fun `convert 4 return IV`(){
        val convertedValue = RomanConverter().convert(4)
        assertThat(convertedValue).isEqualTo("IV")
    }

    @Test
    fun `convert 5 return V`(){
        val convertedValue = RomanConverter().convert(5)
        assertThat(convertedValue).isEqualTo("V")
    }

}
