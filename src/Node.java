/**
 * Created by Administrator on 2017/8/24.
 * 二叉树问题
 */
public class Node {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String args[]){
     ListNode L1 = new ListNode(3);

     ListNode L2=new ListNode(2);
     L1.next=L2;
     L2.next=null;
     ListNode head=reverse(L1);
     while (head!=null) {
         System.out.println(head.val);
         head=head.next;
     }
    }

        public static ListNode reverse(ListNode head) {
            // write your code here
            if(head==null||head.next==null){
                return head;
            }

            ListNode pre=null;
            ListNode next1=null;
            while(head!=null){
                next1=head.next;
                head.next=pre;
                pre=head;
                head=next1;
            }
            return pre;
        }
}
