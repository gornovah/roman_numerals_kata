public class RomanNumber {
    public String convert(int number) {
        String result = "";
        if (number < 5) {
            for (int i=0; i < number; i++){
                result = result + "I";
            }
        } else {
            result = "V";
        }
        return result;
    }
}
