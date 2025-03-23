package lecture_2;

import org.w3c.dom.ls.LSOutput;

public class prepostincrement {
    public static void main (String args []){

        int a=10;
        int b=20;
        int c=++b-++a+b;
        int d=c++ + ++c +b++;
        int ans=d+c+b+ ++a +--c +--d+b++;
                System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(ans);
    }
}
