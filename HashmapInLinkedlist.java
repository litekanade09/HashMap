import java.util.*;

public class HashmapInLinkedlist {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
        map.put("India" , 150);
        map.put("China" , 100);
        map.put("US", 21);

        System.out.println(map);
    }
}
