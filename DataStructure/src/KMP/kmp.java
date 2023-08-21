package KMP;

/**
 * ClassName: kmp
 * Package: KMP
 * Description:
 *
 * @Author 万涛
 * @Create 2023/8/17 16:40
 * @Version 1.0
 */
public class kmp {
//    public static int getIndexOf(String s, String m){
//        if(s==null||m==null||m.length()<1||s.length()<m.length()){
//            return -1;
//        }
//        char[] str1=s.toCharArray();
//        char[] str2=m.toCharArray();
//        int i1=0;
//        int i2=0;
//        int[] next=getNextArray(str2);
//        while(i1<str1.length && i2<str2.length){
//            if(str1[i1]==str2[i2]){
//                i1++;
//                i2++;
//            }else if(i2==0){
//                i1++;
//            }else{
//                i2=next[i2];
//            }
//        }
//        return i2==str2.length?i1-i2:-1;
//    }
    public static int getIndexOf(String s,String t){
        if(s==null||t==null||t.length()>s.length()||t.length()<1){
            return -1;
        }
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        int i1=0;
        int i2=0;
        int[] next=getNextArray(str2);
        int[] nextval=getNextValArray(next,str2);
        while(i1<str1.length && i2<str2.length){
            if(str1[i1]==str2[i2]){
                i1++;
                i2++;
            }else if(i2==0){
                i1++;
            }else{
                i2=nextval[i2];
            }
        }
        return i2==str2.length?i1=i2:-1;
    }
    public static int[] getNextArray(char[] c){
        if(c.length==1){
            return new int[]{-1};
        }
        int[] next=new int[c.length];
        next[0]=-1;
        next[1]=0;
        int i=2;
        int cn=0;//哪个位置字符和i-1位置字符比
        while(i<c.length){
            if(c[i-1]==c[cn]){
                next[i++]=++cn;
            }else if(cn>0){
                cn=next[cn];
            }else{
                next[i++]=0;
            }
        }
        return next;

    }
    public static int[] getNextValArray(int[] next,char[] c){
        int [] nextval=new int[c.length];
        for(int i=1;i<next.length;i++){
            if(c[i]==c[next[i]]){
                nextval[i]=nextval[next[i]];
            }else{
                nextval[i]=next[i];
            }
        }
        return nextval;
    }

    public static void main(String[] args) {
        String s1="abbstabbse";
        String s2="tabb";
        int ans=getIndexOf(s1,s2);
        System.out.println(ans);
    }

}
