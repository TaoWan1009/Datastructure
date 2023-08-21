package LinkList;

/**
 * ClassName: SingleLinkListDemo
 * Package: LinkList
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/9 15:56
 * @Version 1.0
 */
public class SingleLinkListDemo {
    public static void main(String[] args) {
        mainNode m1=new mainNode("wantao",22);
        mainNode m2=new mainNode("ff",23);
        SingleLinkList list1=new SingleLinkList();
        list1.add(m1);
        list1.add(m2);
        list1.list();

    }
}
class SingleLinkList{
    mainNode head=new mainNode("",0);
    public void add(mainNode node){
        mainNode temp=head;
        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=node;
    }
    public void list(){

        mainNode temp=head.next;
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
}
class mainNode{
    public String name;
    public int age;
    public mainNode next;

    public mainNode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "mainNode{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
