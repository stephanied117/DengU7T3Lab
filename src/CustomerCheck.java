import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double total = 0.0;
        for (MenuItem c : check) {
            total += c.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        for (MenuItem c : check) {
            if (c.isDailySpecial() == true) {
                return false;
            }
        }
        if (totalPrices() < 40) {
            return false;
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        double fin = totalPrices();
        if (couponApplies() == true) {
            fin = totalPrices() * 0.75;
        }
        if (check.size() >= 6) {
            fin *= 1.20;
        }
        return fin;
    }
}
