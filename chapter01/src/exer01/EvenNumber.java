package exer01;

/**
 * ClassName: EvenNumber
 * Package: exer01
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/15 17:06
 * @Version 1.0
 */
class PrinterNumber extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class EvenNumber {
    public static void main(String[] args) {
        PrinterNumber p1 = new PrinterNumber();
        p1.start();
    }
}


