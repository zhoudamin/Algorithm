
import java.io.*;
/**
 * Created by Administrator on 2017/8/10.
 */
    public class LiftOff extends IntNodeList{
        public static void main(String[] args)throws IOException {
            showInterface();
            BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
            int choice=Integer.parseInt(buff.readLine());
            switch(choice){
                case 1:addHead();break;
                //case 2
                default:break;
            }
        }
        public static void showInterface(){
            System.out.println("*****************************欢迎来到单链表操作界面*****************************");
            System.out.println("请输入您想进行的操作:");
            System.out.println("1——添加元素至表头:");
            System.out.println("2——添加元素至表尾:");
            System.out.println("3——删除链表头部元素:");
            System.out.println("4——删除链表尾部元素:");
            System.out.println("5——删除链表指定元素:");
            System.out.println("6——删除链表:");
            System.out.println("7——判断链表是否含有元素:");
            System.out.println("8——判断链表是否有某个元素:");
            System.out.println("9——输出链表元素:");
        }
        public static void addHead() throws IOException{
            System.out.println("请输入您想添加至表头的元素：");
            BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
            int el=Integer.parseInt(buff.readLine());
            IntNodeList node = new IntNodeList();
            node.addToHead(el);
            node.printAll();
        }
    }


