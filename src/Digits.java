import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num) {
        ArrayList<Integer> digitList = new ArrayList<Integer>();
        String str = "" + num;
        for (int i = 0; i < str.length(); i++) {
            int in = Integer.parseInt(str.substring(i, i + 1));
            digitList.add(in);
        }
    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) < digitList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

