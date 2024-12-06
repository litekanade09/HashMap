import java.util.*;
public class IterationInHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China", 100);
        map.put("US", 85);
        map.put("Bhutan",10);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("keys = " + k + "," + "value = " + map.get(k));
        }
    }
}
