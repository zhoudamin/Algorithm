package ClassicalAlgorithm;

/**
 * Created by zdmein on 2017/9/23.
 */
public class quickSort1 {

    public static void main(String[] args) {
        int[] testData = {8, 5, 7, 1, 99, 44, 78, 22};
        int[] dataSorted = quickSort(testData, 0, testData.length-1);
        for(int a : dataSorted) {
            System.out.print(a + " ");
        }
    }
    /**
     * 快速排序
     */
    private static int partition(int[] data, int low, int high) {
        int key = data[low];
        while(low < high) {
            while(low<high && data[high]>=key) {
                high--;
            }
            data[low] = data[high];//(此时因low=high或data[high]<key)将high下标处的数赋给low下标处的数，保证data[low]<key
            while(low<high && data[low]<=key) {
                low++;
            }
            data[high] = data[low];//(此时因low=high或data[low]>key)将low下标处的数赋给high下标处的数，保证data[high]>key
        }
        data[low] = key;
        return low;
    }
    public static int[] quickSort(int[] data, int low, int high) {
        if(low < high) {
            int result = partition(data, low, high);
            quickSort(data, low, result-1);//对low到result-1下标间数进行排序
            quickSort(data, result+1, high);//对result+1到high下标间数进行排序
        }
        return data;
    }
}
