package Array;

/**
 * Created by zdmein on 2017/8/30.
 *未排序正整数数组中累加和为给定值的最长子数组长度
 * 给定一个无需数组arr,其中元素为正，给定一个整数k。求arr的所有子数组中累加和为k的最长子数组的长度。
 * arr=[1,2,1,1,1],k=3
 * 结果返回3
 */
public class getMaxLength1 {
    public static void main(String [] args){
        int [] arr={1,2,1,1,1};
        int k=3;
        System.out.println(getMaxLength(arr,k));

    }

    public static int getMaxLength(int [] arr ,int k){
        if(arr==null||arr.length<0||k<0){
            return 0;
        }

        int right =0;
        int left=0;
        int len=0;
        int sum=arr[0];
        while (right<arr.length){
            if(sum==k){
                len=Math.max(len,right-left+1);
                sum-=arr[left++];
            }else if(sum<k){
                right++;
                if(right==arr.length){
                    break;
                }
                sum+=arr[right];
            }else {
                sum-=arr[left++];
            }
        }
        return len;
    }
}
