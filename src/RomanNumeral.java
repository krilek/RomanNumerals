import java.util.TreeMap;

public class RomanNumeral {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
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
        return map.get(l) + new RomanNumeral(arabicNumber-1).getRomanNumeral();
    }
}
