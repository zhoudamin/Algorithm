package String;

/**
 * Created by zdmein on 2017/9/3.
 * 数组中两个字符串的最小距离
 *Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *  Given word1 = “coding”, word2 = “practice”, return 3.
 *   Given word1 = "makes", word2 = "coding", return 1.
 */
public class minDistance1 {
    public static void main(String args[]){
        String [] strs ={"1","3","3","3","2","3","1"};
        String str1="1";
        String str2="2";
        minDistance(strs,str1,str2);

    }

    public static void minDistance(String[] strs,String str1 , String str2){
        if(strs==null||strs.length==0||str1==null||str2==null){
            return;
        }

        int index1=-1;
        int index2=-1;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<strs.length;i++){
            if(strs[i]==str1){
                index1=i;
                if(index2!=-1){
                    min=Math.min(min,index1-index2);
                }
            }else if(strs[i]==str2){
                index2=i;
                if(index1!=-1){
                    min=Math.min(min,index2-index1);
                }
            }
        }

        if(min!=Integer.MAX_VALUE){
            System.out.println(min);
        }else {
            System.out.println(-1);
        }



    }
}
