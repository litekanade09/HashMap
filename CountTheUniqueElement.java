import java.util.*;
public class CountTheUniqueElement {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6,2,4,3,7,4,1};
        HashSet<Integer> count = new HashSet<>();
        for(int i = 0;i< nums.length;i++){
            count.add(nums[i]);
        }
        System.out.print(count.size());
        //O(nk)
    }

}
