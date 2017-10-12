package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/10/11.
 * 链接：https://www.nowcoder.com/questionTerminal/6ffdd7e4197c403e88c6a8aa3e7a332a?orderByHotValue=1&questionTypes=000100&page=1&onlyReference=false
 来源：牛客网

 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 输入描述:

 输入为一行，n(1 ≤ n ≤ 1000)


 输出描述:

 输出一个整数,即题目所求
 示例1
 输入

 10
 输出

 2
 */
public class pingan2 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int n = cin.nextInt();
        int index =0;
        while(n/5>0){
            index+=n/5;
        n=n/5;
    }
    System.out.println(index);
    }
}
