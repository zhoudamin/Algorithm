package ProgrammingWritten;

import java.util.Scanner;

import java.io

        .*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by zdmein on 2017/9/21.
 */
public class xiec3 {





        /*请完成下面这个函数，实现题目要求的功能
        当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
        ******************************开始写代码******************************/
        static int findMinMis(int[] A) {
            int sdvf=0;
            Arrays.sort(A);
            int i = 1;
            for(int j=0;j<A.length;){
                if(A[j]<i){
                    j++;
                }else if(A[j]==i){
                    i++;
                    j++;
                    if(j==A.length){
                        sdvf = i;
                    }
                }else{
                    sdvf = i;
                    break;
                }
            }
            return sdvf;
        }
        /******************************结束写代码******************************/


        public static void main(String[] args){
            Scanner in = new Scanner(System.in

            );
            int res;

            int _A_size = 0;
            _A_size = Integer.parseInt(in.nextLine().trim());
            int[] _A = new int[_A_size];
            int _A_item;
            for(int _A_i = 0; _A_i < _A_size; _A_i++) {
                _A_item = Integer.parseInt(in.nextLine().trim());
                _A[_A_i] = _A_item;
            }

            res = findMinMis(_A);
            System.out.println(String.valueOf(res));

        }
    }


