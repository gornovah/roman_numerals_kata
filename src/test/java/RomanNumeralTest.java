import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RomanNumeralTest {

    @Test
    public void convert_arabics_to_romans_first_number() {
        RomanNumber romanNumberConverter = new RomanNumber();
        String romanNumber = romanNumberConverter.convert(1);
        assertThat(romanNumber, is("I"));
    }

    @Test
    public void convert_arabics_to_romans_number_three() {
        RomanNumber romanNumberConverter =new RomanNumber();
        String romanNumber = romanNumberConverter.convert(3);
        assertThat(romanNumber, is("III"));
    }


}
