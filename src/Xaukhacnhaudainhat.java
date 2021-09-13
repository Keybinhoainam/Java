import java.util.*;
public class Xaukhacnhaudainhat {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        long test=sc.nextLong();
        sc.nextLine();
        for(long t=0;t<test;t++)
        {
            String s1=sc.next();
            String s2=sc.next();
            if(s1.compareTo(s2)==0)System.out.println(-1);
            else
            {
                if(s1.length()>s2.length())System.out.println(s1.length());
                else System.out.println(s2.length());
            }

        }
    }
}
