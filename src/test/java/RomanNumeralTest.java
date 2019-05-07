import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RomanNumeralTest {

    private RomanNumber romanNumberConverter;

    @BeforeEach
    public void setUp() {
        romanNumberConverter = new RomanNumber();
    }

    @ParameterizedTest
    @CsvSource({"1 , I",
                "2 , II",
                "4, IV",
                "5, V",
                "8, VIII",
                "10, X",
                "11, XI",
                "40, XL",
                "44, XLIV"

    })
    public void convert_arabics_to_romans_first_number(int input, String expected) {
        String romanNumber = romanNumberConverter.convert(input);
        assertThat(romanNumber, is(expected));
    }

}
