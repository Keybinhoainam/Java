import java.util.*;
public class Xaunhiphan {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        long []s=new long [100];
        s[1]=1;s[2]=1;
        for(int i=3;i<93;i++)
        {
            s[i]=s[i-2]+s[i-1];
        }
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            
            while(n>2)
            {
                if(k>s[n-2])
                {
                    k-=(s[n-2]);
                    n-=1;
                }
                else{
                    n-=2;
                }
            }
            if(n==1)System.out.println(0);
            if(n==2)System.out.println(1);
        }
    }
}
