import java.util.*;
public class Xaudoixung {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        long test=sc.nextLong();
        sc.nextLine();
        for(long t=0;t<test;t++)
        {
            String s=sc.next();
            int n=s.length();
            int dem=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)!=s.charAt(n-1-i))
                {
                    dem+=1;
                }
            }
            if(dem/2==1 ||(dem==0&&n%2!=0))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
