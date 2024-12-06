import java.util.*;
public class main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //insert
        map.put("India",150);
        map.put("US",85);

        System.out.println(map);

        //Get
//        int pop = map.get("India");
//        System.out.println(pop);
//
//        System.out.println(map.get("Indonesia"));
//
//        //Containskey
//        System.out.println(map.containsKey("India"));
//        System.out.println(map.containsKey("Indonesia"));

        //remove
        System.out.println(map.remove("US"));
        System.out.println(map);
    }
}
