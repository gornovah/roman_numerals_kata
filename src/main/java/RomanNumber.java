import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public String convert(int number) {

        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        dictionary.put(1, "I");
        dictionary.put(2, "II");
        dictionary.put(3, "III");
        dictionary.put(4, "IV");
        dictionary.put(5, "V");
        dictionary.put(6, "VI");
        dictionary.put(7, "VII");
        dictionary.put(8, "VIII");
        dictionary.put(9, "XI");
        dictionary.put(10, "X");
        return dictionary.get(number);
    }
}
