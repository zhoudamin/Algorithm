package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/10/12.
 */
public class SenseTime2 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int row = cin.nextInt();
        int col = cin.nextInt();
        int [][] num=new  int [row][col];



        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                num[i][j]=cin.nextInt();
            }
        }

        int numeber=sen2(row,col,num);
        System.out.println(row*col-numeber);
    }
    public static int sen2(int row,int col,int [][]num){
        int [][] flag=new  int [row][col];

        for(int j=0;j<col;j++){
            int i=0;
            if(num[i][j]==0) {
                flag[i][j] = 1;
                i++;
                if (i < row) {
                    while (num[i][j] == 0) {
                        flag[i][j] = 1;
                        int index = i;
                        for (; index >= 0 && num[index][j] == 0; index--) {
                            flag[index][j] = 1;
                        }
                        for (index = i; index < col && num[index][j] == 0; index++) {
                            flag[index][j] = 1;
                        }
                        i++;
                    }
                }
            }
        }
        int count=0;
        for (int i=0;i<row-1;i++){
            for (int j=0;j<col-1;j++){
               if(flag[i][j]==0 && (flag [i+1][j]==1 ||flag [i][j+1]==1 )){
                   flag[i][j]=1;
               }
            }
        }

        for (int i=0;i<row-1;i++){
            for (int j=col-1;j>0;j--){
                if(flag[i][j]==0 && (flag [i+1][j]==1 ||flag [i][j-1]==1 )){
                    flag[i][j]=1;
                }
                if(flag[i][j]==1 &&num[i+1][j]==0){
                    flag[i+1][j]=1;
                }
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (flag[i][j]==1){
                count++;
                }
            }
            }
        return count;
    }
}

/**
 *
 3
 3
 0
 0
 1
 1
 1
 0
 1
 1
 1
 */
