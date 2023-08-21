package exer03;

/**
 * ClassName: Exer03
 * Package: exer03
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/5 17:17
 * @Version 1.0
 */
public class Exer03 {
    public static void main(String[] args){
        Exer03 exr=new Exer03();
        exr.meeting(new Man(),new Woman(),new Man());
    }
    public void meeting(person... ps){
        for(int i=0;i<ps.length;i++){
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Woman){
                Woman woman=(Woman)ps[i];
                woman.makeup();
            }else if(ps[i] instanceof Man){
                Man man=(Man)ps[i];
                man.smoke();
            }
        }
    }
}
