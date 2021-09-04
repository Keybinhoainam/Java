import java.util.*;
import java.util.Scanner;

public class sodep1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        // sc.nextLine();
        for(int t=0;t<test;t++)
        {
            String s=sc.next();;
            int n=s.length();
            int mid=(n%2==0)?n/2-1:n/2;
            int check=0;
            if(n==1)check=1;
            for(int i=0;i<=n-1&&check==0;i++)
            {
                int tmp1=(int)(s.charAt(i));
                int tmp2=(int)(s.charAt(n-1-i));
                // System.out.println((tmp1+" "+tmp2));
                if(tmp1!=tmp2 || tmp1%2!=0 ||  tmp2%2!=0)
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
