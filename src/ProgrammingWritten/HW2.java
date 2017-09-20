package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/20.
 */
public class HW2 {
    public static class Node{
        public char value;
        public Node next;
        public Node(char data){
            this.value=data;
        }
    }

    public static Node noLoop(Node head1 , Node head2){
        if(head1==null||head2==null){
            return null;
        }
        Node cur1=head1;
        Node cur2=head2;
        int n=0;
        while(cur1.next !=null){
            n++;
            cur1=cur1.next;
        }

        while(cur2.next !=null){
            n--;
            cur2=cur2.next;
        }

        if(cur1.value!=cur2.value){
            return null;
        }

        cur1=n>0?head1:head2;
        cur2=cur1==head1?head2:head1;
        n=Math.abs(n);
        while (n!=0){
            n--;
            cur1=cur1.next;
        }
        while (cur1.value!=cur2.value){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
// A_B_C_D_E_F_G+H_I_J_K
//     T_Y_U_H_I_J_K
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        String n = cin.next();  //串串数
        String m = cin.next();  //相邻多少
        char[] nn = n.toCharArray();
        int i = 2;
        Node head1 = new Node(nn[0]);
        Node cur1;
        cur1 = head1;
        while (i < n.length()) {

            Node node = new Node(nn[i]);
            cur1.next = node;
            cur1 = cur1.next;
            i += 2;
        }

        int j = 2;
        char[] mm = m.toCharArray();
        Node head2 = new Node(mm[0]);
        Node cur2;
        cur2 = head2;
        while (j < m.length()) {

            Node node = new Node(mm[j]);
            cur2.next = node;
            cur2 = cur2.next;
            j += 2;
        }

        Node res = noLoop(head1, head2);
        if (res == null) {
            System.out.println(0 + " " + 0);
        } else {
            int index = 0;
            char resc=res.value;
            while (res.next != null) {
                index++;
                res = res.next;
            }

            System.out.println(resc+" "+index);
        }
    }

}
