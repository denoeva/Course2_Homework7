import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Россия", "священная", "наша", "держава", "Россия", "любимая", "наша", "страна"));
        Set<String> setWords = new HashSet<>(words);
        System.out.println(setWords);
    }
}

