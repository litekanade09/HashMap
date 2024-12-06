import java.util.*;
public class IterationinLinkedHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Bengalurur");
        cities.add("chennai");
        cities.add("Virar");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mumbai");
        lhs.add("Bengalurur");
        lhs.add("chennai");
        lhs.add("Virar");
        System.out.println(lhs);
        lhs.remove("Mumbai");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Bengalurur");
        ts.add("Chennai");
        ts.add("Virar");
        System.out.println(ts);

    }
}
