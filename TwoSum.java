import java.util.*;
public class TwoSum {
    public int[] twosums(int arr[],int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i <arr.length;i++){
            int ans = target - arr[i];
            if(map.containsKey(ans)){
               return new int[]{map.get(ans),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int arr[] = {3,4,6};
        int target= 9;

        int result[] = two.twosums(arr,target);
        if(result[0] != -1 && result[1] != -1){
            System.out.print("The two sum result is " + result[0] +" and " + result[1]);
        }else{
            System.out.print("None element staisfies the result ");
        }

    }
}
