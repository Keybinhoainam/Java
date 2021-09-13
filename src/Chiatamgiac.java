import java.util.*;
public class Chiatamgiac {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        long test=sc.nextLong();
        for(long t=0;t<test;t++)
        {
            int n=sc.nextInt(),h=sc.nextInt();
            for(int i=1;i<n;i++)
            {
                Double tmp=(h*Math.sqrt((double)(i)/n));
                System.out.printf("%.6f",tmp);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
