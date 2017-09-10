package ProgrammingWritten;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map.Entry;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/10.
 * 网易笔试
 * 一个合法的括号匹配
   给一个合法的括号匹配序列s，找到同样长的所有的括号匹配序列t，
   1.t和s不同，但是长度相同
   2.t也合法
  3.LCS（s,t） 是满足上面两个条件的t中最大的。

 eg:
 s="(())()"
 匹配的有： "()(())"、"((()))"、"()()()"、"(()())"
 其中 LCS（"(())()","()(())"）为4，其余都是5，所以输出3
 */
public class NetEase1 {

        public static int cnt;
        public static HashMap<String,Integer> map = new HashMap<>();
        public static void main(String[] args) {

            HashMap<Integer,Integer> map2 = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String str1 = input.nextLine();
            // int n = Integer.parseInt(str);

            int n2 = str1.length();
            int n = (int) n2 / 2;
            // StringBuffer bf = new StringBuffer("");
            // String str1 = bf.append(str).reverse().toString();
            // n += Integer.parseInt(str1);
            // System.out.println(n);

            ArrayList<String> list = getBracketsOfN(n);
            for (String str2 : list) {
                if (str1.equals(str2)) {
                    continue;
                }else {
                    int[][] re = longestCommonSubsequence(str1, str2);

                    cnt=0;
                    print(re, str1, str2, str1.length(), str2.length());
                    map.put(str2, cnt);
                }

            }
            for (Entry<String, Integer> entry : map.entrySet()) {

                if (map2.containsKey(entry.getValue())) {
                    int count=map2.get(entry.getValue());
                    map2.put(entry.getValue(), ++count);
                }
                else {
                    map2.put(entry.getValue(), 1);
                }


            }

            int result = 0;
            int max= 0;
            for(Entry<Integer, Integer> entry : map2.entrySet()) {

                if (max<entry.getKey()) {
                    result = entry.getValue();
                }
            }
            System.out.println(result);

        }

        /**
         * Given the number N, return all of the correct brackets.
         *
         * @param n
         * @return
         */
        @SuppressWarnings("unchecked")
        public static ArrayList<String> getBracketsOfN(int n) {
            @SuppressWarnings("rawtypes")
            ArrayList[] dp = new ArrayList[n + 1];
            for (int i = 0; i < dp.length; i++)
                dp[i] = new ArrayList<String>();
            dp[0].add("");
            dp[1].add("()");
            if (n == 0)
                return dp[0];
            if (n == 1)
                return dp[1];
            int count = 2;
            while (count < n + 1) {
                ArrayList<String> lcount = dp[count];
                for (int i = 0; i < count; i++) {
                    ArrayList<String> l1 = dp[i];
                    ArrayList<String> l2 = dp[count - i - 1];
                    for (int j = 0; j < l1.size(); j++) {
                        for (int k = 0; k < l2.size(); k++) {
                            StringBuffer sb = new StringBuffer();
                            sb.append(l1.get(j));
                            sb.append("(");
                            sb.append(l2.get(k));
                            sb.append(")");
                            lcount.add(sb.toString());
                        }
                    }
                }
                dp[count++] = lcount;
            }
            return dp[n];
        }



        // 假如返回两个字符串的最长公共子序列的长度
        public static int[][] longestCommonSubsequence(String str1, String str2) {
            int[][] matrix = new int[str1.length() + 1][str2.length() + 1];//建立二维矩阵
            // 初始化边界条件
            for (int i = 0; i <= str1.length(); i++) {
                matrix[i][0] = 0;//每行第一列置零
            }
            for (int j = 0; j <= str2.length(); j++) {
                matrix[0][j] = 0;//每列第一行置零
            }
            // 填充矩阵
            for (int i = 1; i <= str1.length(); i++) {
                for (int j = 1; j <= str2.length(); j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    } else {
                        matrix[i][j] = (matrix[i - 1][j] >= matrix[i][j - 1] ? matrix[i - 1][j]
                                : matrix[i][j - 1]);
                    }
                }
            }
            return matrix;
        }
        //根据矩阵输出LCS
        public static void print(int[][] opt, String X, String Y, int i, int j) {
            if (i == 0 || j == 0) {
                return;
            }
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                print(opt, X, Y, i - 1, j - 1);
                cnt++;
//                System.out.print(X.charAt(i - 1));
            } else if (opt[i - 1][j] >= opt[i][j]) {
                print(opt, X, Y, i - 1, j);
            } else {
                print(opt, X, Y, i, j - 1);
            }
        }
    }


