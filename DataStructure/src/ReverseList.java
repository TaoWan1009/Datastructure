/**
 * ClassName: ReverseList
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/7 19:40
 * @Version 1.0
 */
public class ReverseList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int value){
            this.value=value;
        }
    }
    public static class DoubleNode{
        public int value;
        public DoubleNode next;
        public DoubleNode last;
        public DoubleNode(int value){
            this.value=value;
        }
    }
    public static Node reverseLinkList(Node head){
        Node pre=null;
        Node next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return head;
    }
    public static DoubleNode generateRandomDoubleList(int len, int value) {
        int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }
        size--;
        DoubleNode head = new DoubleNode((int) (Math.random() * (value + 1)));
        DoubleNode pre = head;
        while (size != 0) {
            DoubleNode cur = new DoubleNode((int) (Math.random() * (value + 1)));
            pre.next = cur;
            cur.last = pre;
            pre = cur;
            size--;
        }
        return head;
    }
    public static Node generateRandomLinkedList(int len, int value) {
        int size=(int)(Math.random()*(len+1));
        if(size==0){
            return null;
        }
        size--;
        Node head=new Node((int)(Math.random()*(value+1)));
        Node pre=head;
        while(size!=0){
            Node cur=new Node((int)(Math.random()*(value+1)));
            pre.next=cur;
            cur=pre;
            size--;

        }
        return head;
    }

    public static void main(String[] args) {
        int length=10;
        int value=50;
        Node node=generateRandomLinkedList(length,value);
        node=reverseLinkList(node);
        System.out.println(node);
    }
}

