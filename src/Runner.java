import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

        // use an index-based for loop here to sum up the numbers in nums
        int i = 0;
        while (i < words.size() && !(words.get(i).contains("h"))) {
            System.out.println(words.get(i));
            i++;
        }

        ArrayList<String> luna = new ArrayList<String>();
        luna.add("a");
        luna.add(0, "b");
        luna.add(1, "c");
        luna.remove(2);
        luna.set(0, "d");
        System.out.println(luna);
    }
}
