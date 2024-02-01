import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat's name using an index-based for loop
        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i).getName());
        }
        System.out.println();
        // COMPLETE ME: print each Cat's name using an enhanced for loop
        for (Cat c : catList) {
            System.out.println(c.getName());
        }

    }
}
