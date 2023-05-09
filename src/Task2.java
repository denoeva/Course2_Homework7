import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> setNums = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                setNums.add(num);
            }
        }
        System.out.println(setNums);
    }
}

