import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumber {
    public String convert(int number) {

        Map<Integer, String> dictionary = new LinkedHashMap<>();

        dictionary.put(1000, "M");
        dictionary.put(900, "CM");
        dictionary.put(500, "D");
        dictionary.put(400, "CD");
        dictionary.put(100, "C");
        dictionary.put(90, "XC");
        dictionary.put(50, "L");
        dictionary.put(40, "XL");
        dictionary.put(10, "X");
        dictionary.put(9, "IX");
        dictionary.put(5, "V");
        dictionary.put(4, "IV");
        dictionary.put(1, "I");

        String result = "";

        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            int arabicNumber = entry.getKey();
            String romanNumber = entry.getValue();
            while (number >= arabicNumber) {
                result += romanNumber;
                number -= arabicNumber;
            }
        }
        return result;
    }
}
