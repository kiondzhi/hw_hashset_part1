import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(4);
        set3.add(10);
        set3.add(20);
        set3.add(6);
        set3.add(35);

        HashSet<Integer> overFifteen = new HashSet<>(findOverFifteen(set3));
        System.out.println(overFifteen);


    }

    public static HashSet<Integer> findOverFifteen(HashSet<Integer> set3) {
        for (Integer num : set3) {
            if (num > 15 && num % 2 == 0) {
                System.out.println(num);
            } else {
                System.out.println(num / 2);
            }
        }
        return set3;
    }
}
