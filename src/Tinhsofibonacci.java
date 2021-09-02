/**
 * tinh_so_fibonacci
 */
import java.util.Scanner;
public class Tinhsofibonacci {

    /**
     *
     */
    static int fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long []f;
            f=new long  [n+5];
            f[0]=0;
            f[1]=1;
            for(int j=2;j<=n;j++)
            {
                f[j]=f[j-1]+f[j-2];
            }
            System.out.println(f[n]);

        }
        sc.close();
    }
}