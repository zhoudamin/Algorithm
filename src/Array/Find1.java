package Array;

/**
 * Created by zdmein on 2017/11/6.
 * 二维数组中的查找
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Find1 {
    public boolean Find(int target, int [][] array) {
        int i=array[0].length-1;
        for(;i>=0;i--){
            if(array[0][i]<=target){
                for(int j=0;j<array.length;j++){
                    if(array[j][i]==target){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
