import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RomanNumeralTest {

    private RomanNumber romanNumberConverter;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        romanNumberConverter = new RomanNumber();
    }

    @Test
    public void convert_arabics_to_romans_first_number() {
        String romanNumber = romanNumberConverter.convert(1);
        assertThat(romanNumber, is("I"));
    }

    @Test
    public void convert_arabics_to_romans_number_three() {
        String romanNumber = romanNumberConverter.convert(3);
        assertThat(romanNumber, is("III"));
    }

    @Test
    public void convert_arabics_to_romans_number_five() {
        String romanNumber = romanNumberConverter.convert(5);
        assertThat(romanNumber, is("V"));
    }


}
