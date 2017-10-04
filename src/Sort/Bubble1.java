package Sort;

/**
 * Created by zdmein on 2017/10/4.
 */
public class Bubble1 {
    public static void main(String [ ] args){
        int [] a={36,26,48,12,25,65,43,57};
        BubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void BubbleSort(int [] a){
        int tmp;
        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>i;j--){
               if(a[j-1]>a[j]){
                   tmp=a[j-1];
                   a[j-1]=a[j];
                   a[j]=tmp;
               }
            }
        }
    }
}
