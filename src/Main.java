import AncientNumbers.AncientNumbers;
import AncientNumbers.mbiro.AncientNumberConverter;

public class Main {
    public static void main(String[] args) {
        AncientNumbers asd = new AncientNumbers();

        String ancientNumber1 = "CV";
        String ancientNumber2 = "MCMXCIVI";

        System.out.println(asd.romanToInt(ancientNumber1));
        System.out.println(asd.romanToInt(ancientNumber2));

        System.out.println(AncientNumberConverter.ancientNumberToInt(ancientNumber1));
        System.out.println(AncientNumberConverter.ancientNumberToInt(ancientNumber2));
    }
}
