
import java.util.Scanner;
public class Uocsonguyenlonnhat {
    public static Scanner sc=new Scanner(System.in);
    public static void kt(int snt[]) {
        long n=100000;
        for(int i=0;i<=n;i++)snt[i]=0;
        snt[0]=snt[1]=1;
        for(int i=2;i*i<=n;i++)
        {
            if(snt[i]==0)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    snt[j]=1;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int []snt=new int [100005];
        kt(snt);
        long test=sc.nextLong();
        for(long t=0;t<test;t++)
        {
            long kq=0;
            long n=sc.nextLong();
            long n1=n;
            for(int i=2;i*i<=n1;i++)
            {
                if(snt[i]==0)
                {
                    while(n%i==0)
                    {
                        n/=i;
                        kq=i;
                    }
                }
            }
            if(n>1)kq=n;
            System.out.println(kq);
        }

    }
    
}
