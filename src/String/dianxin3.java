package String;

import java.util.*;


/**
 * Created by zdmein on 2017/9/24.
 */
public class dianxin3 {

    public static    HashMap<Integer,Integer> uniquenum(int[] array111){
        Arrays.sort(array111);
        HashMap<Integer,Integer> hashmap =new HashMap<Integer,Integer>();
        int i1=1;
        for(int num : array111){
            if (!hashmap.containsKey(num))
                hashmap.put(num, i1++);
        }
        return hashmap;
    }

    public static void main(String[] args) {
        //定义冗余数组
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int jj=0;
        int [] array=new int [n];
        while (jj<n){
            array[jj]=cin.nextInt();
            jj++;
        }

int [] array1=new int [n];

        for(int i=0;i<n;i++){
            array1[i]=array[i];
        }
        HashMap<Integer,Integer> hashmap =uniquenum(array1);

      int []result= new int [array.length];
        for (int i=0;i<array.length;i++) {
            result[i]=hashmap.get(array[i]);
        }

        for (int i=0;i<result.length-1;i++) {
            System.out.print(result[i]+" ");
        }
        System.out.print(result[n-1]);

    }

}


