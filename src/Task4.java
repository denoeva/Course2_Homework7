import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> mapStrings = new HashMap<>();
        for (String string : strings) {
            if (!mapStrings.containsKey(string)) {
                mapStrings.put(string, 1);
            } else {
                mapStrings.put(string, mapStrings.get(string) + 1);
            }
        }
        System.out.println(mapStrings.values());
    }
}

