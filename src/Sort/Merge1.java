package Sort;

/**
 * Created by zdmein on 2017/10/4.
 *
 *     归并排序
 *
 */
public class Merge1 {
    public static void main(String [] args){
        int [] a={5,4,9,8,7,6,0,1,3,2};
        MergeSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void MergeSort(int []arr , int first ,int last ){
        if(first<last){
            int mid=(first+last)/2;
            MergeSort(arr,first,mid);
            MergeSort(arr,mid+1,last);
            Merge(arr,first,mid,last);
        }
    }

    public static void Merge(int [] array , int first ,int mid ,int last){
        int  n1= mid-first+1;
        int n2=last-mid;
        int [] L=new int [n1];
        int [] H=new int [n2];
        int i,j,k;
        for( i=0,k=first;i<n1;i++,k++){
            L[i]=array[k];
        }
        for( i=0,k=mid+1;i<n2;i++,k++){
            H[i]=array[k];
        }
        for( k=first,i=0,j=0;i<n1&j<n2;k++){
            if(L[i]>H[j]){
                array[k]=L[i];
                i++;
            }else {
                array[k]=H[j];
                j++;
            }
        }
        if(i<n1){
            for(j=i;j<n1;j++,k++) {
                array[k] = L[j];
            }
        }
        if(j<n2){
            for(i=j;i<n2;i++,k++){
                array[k]=H[i];
            }
        }
    }
}
