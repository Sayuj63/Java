import java.util.*;

public class CheckElementHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        int element = 3;
        if (set.contains(element)) {
            System.out.println(element + "exists in the HashSet.");
        } else {
            System.out.println(element + "does not exist in the HashSet.");
        }
    }
}
