import java.util.TreeMap;

public class RomanNumeral {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private final int arabicNumber;

    RomanNumeral(int arabicNumber){
        this.arabicNumber = arabicNumber;
    }

    public String getRomanNumeral() {
        int l =  map.floorKey(arabicNumber);
        if ( arabicNumber == l ) {
            return map.get(arabicNumber);
        }
        return map.get(l) + new RomanNumeral(arabicNumber-l).getRomanNumeral();
    }
}
