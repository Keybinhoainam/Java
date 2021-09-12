import java.util.Scanner;
public class Kiemtrasofibonacci {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        long fibo[]=new long[100];
        fibo[0]=0;fibo[1]=1;
        for(int i=2;i<=92;i++)
        {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        // System.out.println(fibo[92]);
        long test=sc.nextLong();
        for(long t=0;t<test;t++)
        {
            long n=sc.nextLong();
            int i=0;
            while(fibo[i]<n)i++;
            if(fibo[i]==n)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
