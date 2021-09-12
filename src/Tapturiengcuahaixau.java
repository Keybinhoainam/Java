import java.util.*;
public class Tapturiengcuahaixau {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        long test=sc.nextLong();
        sc.nextLine();
        for(long t=0;t<test;t++)
        {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String a1[]=s1.split(" ");
            Arrays.sort(a1);
            ArrayList<String> kq=new ArrayList<String>();
            for(int i=0;i<a1.length;i++)
            {
                if(!s2.contains(a1[i])&& !kq.contains(a1[i]))
                {
                    kq.add(a1[i]);
                }
            }
            for(String i: kq)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
