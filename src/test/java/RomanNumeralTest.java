import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RomanNumeralTest {

    @ParameterizedTest
    @CsvSource({"1 , I",
                "2 , II",
                "4, IV",
                "5, V",
                "8, VIII",
                "10, X",
                "11, XI",
                "40, XL",
                "44, XLIV",
                "50, L",
                "479, CDLXXIX",
                "2019, MMXIX"})
    public void convert_arabics_numbers_to_romans_numbers(int input, String expected) {
        RomanNumber romanNumberConverter = new RomanNumber();
        String romanNumber = romanNumberConverter.convert(input);
        assertThat(romanNumber, is(expected));
    }

}
