package Array;

/**
* 合并数组
 **/
public class Main {
    public static void main(String[] args) {
   /*    int[][] arr = { {0,1,1,1,1},
                       {0,1,0,0,1},
                       {0,1,0,0,1},
                       {0,1,1,1,1},
                       {0,1,0,1,1}};
*/
     // int[] arr = {100,4,200,1,3,2};

       int [] A={1,2,3,4};
       int []B={2,4,5,6};
       System.out.println(mergeSortedArray(A,B));
    }

    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int indexA=0;
        int indexB=0;
        int []C =new int [A.length+B.length];
        int indexC=0;
        while(indexA!=A.length && indexB!=B.length) {
            if (A[indexA] < B[indexB]) {
                C[indexC++]=A[indexA++];
            }else if (A[indexA] > B[indexB]) {
                C[indexC++]=B[indexB++];
        }else {
                C[indexC++]=A[indexA++];
                C[indexC++]=B[indexB++];
            }
        }

        if(indexA==A.length && indexB!=B.length){
            for(int i=indexB;i<B.length;i++){
                C[indexC++]=B[i];
            }
        }

        if(indexA!=A.length && indexB==B.length){
            for(int i=indexA;i<A.length;i++){
                C[indexC++]=A[i];
            }
        }
        return C;
    }

    }

