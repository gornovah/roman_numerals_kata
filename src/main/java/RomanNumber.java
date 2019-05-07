import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public String convert(int number) {

        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        dictionary.put(1, "I");
        dictionary.put(4, "IV");
        dictionary.put(5, "V");
        dictionary.put(10, "X");
        dictionary.put(40, "XL");
        if (dictionary.containsKey(number)) {
            return dictionary.get(number);
        }

        String result = "";
        while (number >= 40){
            result += "XL";
            number += -40;
        }
        while (number >= 10){
            result += "X";
            number += -10;
        }
        while (number >= 5){
            result += "V";
            number += -5;
        }
        while (number >= 4){
            result += "IV";
            number += -4;
        }
        while (number >= 1){
            result += "I";
            number += -1;
        }
        return result;
    }
}
