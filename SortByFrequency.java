import java.util.*;
public class SortByFrequency {
    public static String frequencyCharacter(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        List<Character> charct = new ArrayList<>(map.keySet());
        charct.sort((a,b) -> map.get(b) - map.get(a));

        StringBuilder res = new StringBuilder();
        for(char c : charct){
            int count = map.get(c);
            for(int j = 0;j<count;j++){
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        String result = frequencyCharacter(s);
        System.out.print(result);

    }
}
