package LinkedList;

/**
 * Created by zdmein on 2017/8/31.
 *
 * 打印两个有序链表的公共部分
 * 给定两个有序列表的头指针head1和head2，打印两个链表的公共部分。
 */
public class printCommonPart1 {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value=data;
        }
    }

    public static void main(String args[]){
        Node head1=new Node(2);
        Node head11=new Node(3);
        Node head12=new Node(4);
        Node head13=new Node(7);
        head1.next=head11;
        head11.next=head12;
        head12.next=head13;

        Node head2=new Node(1);
        Node head21=new Node(3);
        Node head22=new Node(4);
        Node head23=new Node(9);
        head2.next=head21;
        head21.next=head22;
        head22.next=head23;

        printCommonPart(head1,head2);
    }

    public static void printCommonPart(Node head1,Node head2){
        System.out.println("Print Common Part: ");
        while(head1!=null&&head2!=null){
            if(head1.value==head2.value){
                System.out.println(head1.value);
                head1=head1.next;
                head2=head2.next;
            }else if(head1.value>head2.value){
                head2=head2.next;
            }else {
                head1=head1.next;
            }
        }
    }
}
