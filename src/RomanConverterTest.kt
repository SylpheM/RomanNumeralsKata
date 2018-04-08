import org.assertj.core.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

class RomanConverterTest {

    @ParameterizedTest
    @CsvFileSource(resources = ["two-column.csv"], numLinesToSkip = 1)
    fun `convert number return romans letters`(number:Int, expected:String){
        val convertedValue = RomanConverter().convert(number)
        assertThat(convertedValue).isEqualTo(expected)
    }
}
