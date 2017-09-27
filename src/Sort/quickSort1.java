package Sort;

import java.util.Arrays;

/**
 * Created by zdmein on 2017/9/27.
 * 快排
 */
public class quickSort1 {
    public static void main(String [] args){
        int [] a={5,4,9,8,7,6,0,1,3,2};
        quickSort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));

    }
    public static void quickSort(int [] a,int left,int right){
        int index = partition(a,0,a.length-1);
        if(index-1>left){
            quickSort(a,left,index-1);
        }

        if(right>index){
            quickSort(a,index,right);
        }

    }

    public static int partition(int []arr,int low ,int high){
        int i=low;
        int j=high;
        int index=arr[low];

        while (i<j){
            while (i<j && arr[j]>=index){
                j--;
            }
            arr[i++]=arr[j];

            while (i<j && arr[i]<index){
                i++;
            }
            arr[j--]=arr[i];
        }
        arr[i]=index;
        return low;
    }
}
