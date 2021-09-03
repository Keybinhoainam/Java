
import java.util.*;

public class Boisonhonhatcuansonguyenduongdautien {
    
    public static void main(String[] args) {
        int []ch=new int [10005] ;
    ch[0]=ch[1]=1;
    int dem=0;
    long []snt=new long[10000];
    for(int i=2;i<=100;i++)
    {
        if(ch[i]==0)
        {
            snt[dem++]=i;
            for(int j=i*i;j<=10000;j+=i)
            {
                ch[j]=1;
            }
        }
    }
    for(int i=100;i<=10000;i++)
    {
        if(ch[i]==0)snt[dem++]=i;
    }
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=1;t<=test;t++)
        {
            long kq=1;
            long n=sc.nextInt();
            int i=0;
            while(snt[i]<=n)
            {
                int j=1;
                while(Math.pow(snt[i],j)<=n)j++;
                j--;
                long tmp=(long)(Math.pow(snt[i],j));
                kq=kq*tmp;
                i++;

            }
            System.out.println(kq);

        }
        sc.close();
    }
    
}
