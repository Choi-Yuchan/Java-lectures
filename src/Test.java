import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
