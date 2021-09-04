import java.util.*;
public class Sodep3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            String s=sc.next();
            int snt[]={'2','3','5','7'};
            int n=s.length();
            int check=0;
            if(n==1)check=1;
            for(int i=0;i<=n-1&&check==0;i++)
            {
                int tmp1=(int)(s.charAt(i));
                int tmp2=(int)(s.charAt(n-1-i));
                if(tmp1!=tmp2||Arrays.binarySearch(snt, s.charAt(i))<0)
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
