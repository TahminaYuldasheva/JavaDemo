package homework9;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();

        for (String s : strings) {
            result.put(s, result.containsKey(s));
        }

        return result;
    }
}
