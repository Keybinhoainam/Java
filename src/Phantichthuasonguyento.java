import java.util.Scanner;
public class Phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=1;t<=test;t++)
        {
            
            long n =sc.nextLong();
            System.out.print("Test "+t+": ");
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    int dem=0;
                    while(n%i==0)
                    {
                        dem++;
                        n/=i;
                    }
                    System.out.print(i+"("+dem+") ");
                }
            }
            System.out.println("");
        }
        sc.close();

    }
}
