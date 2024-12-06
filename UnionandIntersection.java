import java.util.*;

public class UnionandIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[] = {3,6,9,6,2,4};
        HashSet<Integer> hs = new HashSet<>();

        //union
        for(int i = 0 ;i<arr1.length ; i++){
            hs.add(arr1[i]);
        }
        for(int i = 0;i <arr2.length;i++){
            hs.add(arr2[i]);
        }

        System.out.println("Union Elements : " + hs);
        System.out.println("Unions : " + hs.size());



        hs.clear();
        //intersection
        for(int i = 0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        int count = 0;
        for(int i = 0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
                System.out.println("Intersection Elements : " + arr2[i]);
            }
        }
        System.out.println("Intersections : " + count);


    }
}
