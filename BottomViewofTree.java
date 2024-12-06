import java.util.*;
public class BottomViewofTree {
    static class Node{
        int data;
        Node left;
        Node right;
        int hd;
        public Node(int key){
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }
    public static void BotttomView(Node root,int curr,int hd,TreeMap<Integer,int[]> map){
        if(root == null){
            return;
        }
        if(!map.containsKey(hd)){
            map.put(hd,new int[]{root.data , curr});
        }else{
            int[] p = map.get(hd);
            if(p[1] <= curr){
                p[1] = curr;
                p[0] = root.data;
            }
            map.put(hd,p);
        }
        BotttomView(root.left,curr + 1,hd - 1,map);
        BotttomView(root.right,curr + 1,hd + 1,map);
    }
    public static void printBottom(Node root){
        TreeMap<Integer,int[]> map = new TreeMap<>();
        BotttomView(root,0,0,map);
        for(int[] val : map.values()){
            System.out.print(val[0] + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);
        printBottom(root);
    }
}
