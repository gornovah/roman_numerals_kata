public class RomanNumber {
    public String convert(int number) {
        String result[]  = {"I", "II", "III","IV", "V", "VI", "VII", "VIII"};
        return result[number - 1];
    }
}
