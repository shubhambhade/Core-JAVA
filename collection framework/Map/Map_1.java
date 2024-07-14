package CollectionFrameworks.Map;
import java.util.*;
public class Map_1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("us","united states");
        map.put("in","india");
        map.putIfAbsent("in","india2");
        map.put("en","india");
        System.out.println(map);
        map.remove("us");
        System.out.println(map);

        // set of entry
        Set<Map.Entry<String,String>> entries = map.entrySet();

        for(Map.Entry<String,String>entry : entries)
        {
            System.out.println(entry.getKey()+" ,"+entry.getValue());
        }
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<String> values = map.values();
        System.out.println(values);

        System.out.println(map.containsKey("in"));

        System.out.println(map.getOrDefault("en","Others"));
    }
}
