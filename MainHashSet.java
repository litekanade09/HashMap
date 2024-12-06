import java.util.*;
public class MainHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(1);
        set.add(4);

        System.out.println(set);

        if(set.contains(2)){
            System.out.println("Set contsains 2");

        }else{
            System.out.print("NAII");
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
    }
}
