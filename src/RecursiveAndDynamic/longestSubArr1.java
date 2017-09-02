package RecursiveAndDynamic;

/**
 * Created by zdmein on 2017/9/2.
 * 最长的连续子数组（子数组数字不重复）
 * int [] arr={1,2,3,4,7}; 输出4
 *  int [] arr1={1,2,3,4,1,2,3,4,5,1}; 输出5
 */
public class longestSubArr1 {
    public static void main(String [] args){
        int [] arr={1,2,3,4,7};
        int [] arr1={1,2,3,4,1,2,3,4,5,1};
        longestSubArr(arr1);

    }

    public static void longestSubArr(int [] arr){
        if(arr==null||arr.length==0){
            return;
        }

        int len=1;
        int maxlen=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                len++;
                maxlen=Math.max(len,maxlen);
            }else {
                len=1;
            }
        }
        System.out.println(maxlen);
    }
}
