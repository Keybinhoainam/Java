import java.util.*;
public class Tinhluythua {
    public static Scanner sc=new Scanner(System.in);
    public static int mod=1000000007;
    public static long power(int a,long b) {
        if(b==1)return a;
        if(b==0)return 1;
        long tmp=power(a,(b/2));
        if(b%2==0)
        {
            return (tmp%mod * tmp%mod)%mod;
        }
        return((tmp%mod * tmp%mod)%mod *a)%mod;
    }

    public static void main(String[] args) {
        int a=sc.nextInt();
        long b=sc.nextLong();
        while(a!=0||b!=0)
        {
            System.out.println(power(a,b));
            a=sc.nextInt();
            b=sc.nextLong();
        }
    }
}
