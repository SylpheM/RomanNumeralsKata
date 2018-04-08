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

    @Test
    fun `convert 6 return VI`(){
        val convertedValue = RomanConverter().convert(6)
        assertThat(convertedValue).isEqualTo("VI")
    }

    @Test
    fun `convert 7 return VII`(){
        val convertedValue = RomanConverter().convert(7)
        assertThat(convertedValue).isEqualTo("VII")
    }

    @Test
    fun `convert 8 return VIII`(){
        val convertedValue = RomanConverter().convert(8)
        assertThat(convertedValue).isEqualTo("VIII")
    }

    @Test
    fun `convert 9 return IX`(){
        val convertedValue = RomanConverter().convert(9)
        assertThat(convertedValue).isEqualTo("IX")
    }

    @Test
    fun `convert 10 return X`(){
        val convertedValue = RomanConverter().convert(10)
        assertThat(convertedValue).isEqualTo("X")
    }

    @Test
    fun `convert 11 return XI`(){
        val convertedValue = RomanConverter().convert(11)
        assertThat(convertedValue).isEqualTo("XI")
    }

    @Test
    fun `convert 25 return XXV`(){
        val convertedValue = RomanConverter().convert(25)
        assertThat(convertedValue).isEqualTo("XXV")
    }

    @Test
    fun `convert 49 return XLIX`(){
        val convertedValue = RomanConverter().convert(49)
        assertThat(convertedValue).isEqualTo("XLIX")
    }

    @Test
    fun `convert 50 return L`(){
        val convertedValue = RomanConverter().convert(50)
        assertThat(convertedValue).isEqualTo("L")
    }

    @Test
    fun `convert 100 return C`(){
        val convertedValue = RomanConverter().convert(100)
        assertThat(convertedValue).isEqualTo("C")
    }

    @Test
    fun `convert 168 return CLXVIII`(){
        val convertedValue = RomanConverter().convert(168)
        assertThat(convertedValue).isEqualTo("CLXVIII")
    }

}
