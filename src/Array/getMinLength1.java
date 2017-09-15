package Array;

/**
 * Created by zdmein on 2017/9/15.
 *    需要排序的最短子数组长度
 *    思路：
        用noMin  记录从右到左，可以遍历的，最左边开始需要重新排的
        用noMax   记录从左到右，可以遍历的，最右边需要重新排的

 1,   5,3,4,2,  6,7
 返回  4
 */
public class getMinLength1 {
    public static void main(String args[]){
        int []arr={1,5,3,4,2,6,7};
        System.out.println(getMinLength(arr));
    }

    public static int getMinLength(int [] arr){
        if(arr==null||arr.length<2){
            return 0;
        }

        int min=arr[arr.length-1];
        int noMin=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>min){
                noMin=i;
            }else {
                min=Math.min(arr[i],min);
            }
        }
        if(noMin==-1)
            return 0;

        int max=arr[0];
        int noMax=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max){
                noMax=i;
            }else {
                max=Math.max(max,arr[i]);
            }
        }

        return noMax-noMin+1;
    }

}
