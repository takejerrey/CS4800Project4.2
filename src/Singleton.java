import java.util.Map;
import java.util.HashMap;
public class Singleton {
    private static final Map<String, Object> instances = new HashMap<>();

    private Singleton() {}

    public static synchronized Object getInstance(String key) {
        return instances.computeIfAbsent(key, k -> {
            if ("Carbs".equals(k)) {
                return new Carbs();
            } else if ("Protein".equals(k)) {
                return new Protein();
            } else if ("Fats".equals(k)) {
                return new Fats();
            } else {
                return null;
            }
        });
    }
}
