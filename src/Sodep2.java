import java.util.*;
public class Sodep2 {
    static int tongcs(String s)
    {
        int tong=0;
        for(int i=0;i<s.length();i++)
        {
            tong+=s.charAt(i)-'0';
        }
        if(tong%10==0)return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            String s=sc.next();;
            int n=s.length();
            int mid=(n%2==0)?n/2-1:n/2;
            int check=0;
            if(n==1||(s.charAt(0)!='8'&&s.charAt(n-1)!='8'))check=1;
            if(tongcs(s)==0)check=1;
            for(int i=0;i<=n-1&&check==0;i++)
            {
                int tmp1=(int)(s.charAt(i));
                int tmp2=(int)(s.charAt(n-1-i));
                if(tmp1!=tmp2)
                {
                    check=1;
                    break;
                }
            }
            if(check==0)System.out.println("YES");
            else System.out.println("NO");

        }
        sc.close();
    }
}
