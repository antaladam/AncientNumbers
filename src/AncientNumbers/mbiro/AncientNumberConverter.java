package AncientNumbers.mbiro;

public class AncientNumberConverter {
    public static int ancientNumberToInt(String ancientNumString) {
        char[] chars = ancientNumString.toCharArray();
        int number = 0;
        int index = 0;

        while (index <= chars.length) {
            AncientNumber ancientNumber = AncientNumber.getValue(chars[index]);

            // If the next index is not a valid char just add the curr number and break;
            if (index+1 >= chars.length){
                number += ancientNumber.getVal();
                break;
            }

            // If there is a next number check what's that, if it's bigger add the diff of the next - current and continue
            AncientNumber nextAncientNumber = AncientNumber.getValue(chars[index+1]);
            if (nextAncientNumber.getVal() > ancientNumber.getVal()){
                number += nextAncientNumber.getVal() - ancientNumber.getVal();
                index += 2;
                continue;
            }

            // If the next is not bigger so curr >= next, we just add the current.
            number += ancientNumber.getVal();
            index += 1;
        }

        return number;
    }
}
