package RecursiveAndDynamic;

/**
 * Created by zdmein on 2017/9/14.
 * 跳跃游戏
 给出一个非负整数数组，你最初定位在数组的第一个位置。
 数组中的每个元素代表你在那个位置可以跳跃的最大长度。　　　

 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 给出数组A = [2,3,1,1,4]，最少到达数组最后一个位置的跳跃次数是2
 (从数组下标0跳一步到数组下标1，然后跳3步到数组的最后一个位置，一共跳跃2次)

 思路：贪心算法;
 * 从第一个数开始, 寻找可以一个可以跳最远的点;
 * 例1：3 1 2 4 1 0 0
 * 1.从第一个位置0,可以跳到位置1和位置2和位置3;
 * 2.如果跳到位置1,那么最远就可以跳到位置(1+1);
 * 3.如果跳到位置2,那么最远就可以跳到位置(2+2);
 * 4.如果跳到位置3,那么最远就可以跳到位置(3+4);
 * 5.故选择跳到位置3 ,重复1.2.3步;
 *
 * 算法分析：
 * 1.如果选择跳到位置3 ,就无法跳到位置2和位置3, 那么会不会因此错过最优解？ 答：不会！
 * 2.因为任意位置1和位置2能到达的位置, 位置3都可以到达;
 * 3.故不会错过最优解;
 */
public class jump1 {
    public static void main(String [] args){
        int [] arr={3,2,3,1,1,4};
        System.out.println(jump(arr));
    }

    public static int jump(int [] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int jump=0;
        int cur=0;
        int next=0;
        for (int i=0;i<arr.length;i++){
            if(cur<i){
                jump++;
                cur=next;
            }
            next=Math.max(next,i+arr[i]);
        }
        return jump;
    }
}
