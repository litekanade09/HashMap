import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.*;
public class IteratorInHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Mumbai");
        set.add("Virar");
        set.add("vasai");
        set.add("vashi");
        set.add("mankhurd");

//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for(String city : set){
            System.out.println(city);
        }
    }
}
