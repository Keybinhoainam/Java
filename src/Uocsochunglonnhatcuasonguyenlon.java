import java.util.*;

public class Uocsochunglonnhatcuasonguyenlon {
    static long mod(String b,long a)
    {
        long tong=0;
        for(int i=0;i<b.length();i++)
        {
            char ch = b.charAt(i);
            int num = Integer.parseInt(String.valueOf(ch));
            tong=((tong%a * 10%a)%a+num%a)%a;
        }
        return tong;
    }
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
            long a=sc.nextLong();
            sc.nextLine();
            String b=sc.nextLine();
            long b1=mod(b,a);
            long uoc=ucln(a,b1);
            System.out.println(uoc);
        }
        sc.close();
    }
}
