import java.util.*;
public class Boisochunguocsochung {

    static long ucln(long a,long b)
    {
        if(b==0)return a;
        return ucln(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            long a=sc.nextInt();
            long b=sc.nextInt();
            long uoc=ucln(a,b);
            long boi=a*b/uoc;
            System.out.println(boi+" "+uoc);
        }
        sc.close();
    }
}
