import java.util.*;
public class Soxacach {
    public static void sinh(int n,int x[],int vt,int check[]) {
        if(vt==n)
        {
            int c=1;
            for(int i=1;i<n;i++)
            {
                if(Math.abs(x[i]-x[i-1])==1)
                {
                    c=0;
                    break;
                }
            }
            if(c==1)
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print(x[i]);
                }
                System.out.println();
            }
        }
        else{
            for(int i=1;i<=n;i++)
            {
                if(check[i]==0)
                {
                    check[i]=1;
                    x[vt]=i;
                    sinh(n,x,vt+1,check);
                    check[i]=0;
                }
            }
        }
        
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int n=sc.nextInt();
            int x[]=new int [n];
            int check[]=new int [n+5];
            sinh(n,x,0,check);
        }
    }
}
