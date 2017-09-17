package IO;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/16.
 * 输入数组
 */
public class shuzuInput1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组：以空格隔开");
        String str = scanner.nextLine();

        System.out.println("请输入滑动窗口的大小：");
        int k = scanner.nextInt();

        String[] tmp = str.split(" ");
        int[] arrays = new int[tmp.length];
        for(int i = 0; i < tmp.length;i++){
            arrays[i] = Integer.parseInt(tmp[i]);
        }
        scanner.close();
char [] arr={'a',' ','b'};
        for(int i = 0; i < tmp.length;i++){
           System.out.println(arr);
        }
    }
}
