
import java.util.*;
class Ps{
    public long tu,mau;
}
public class Phanso {
    public static long uoc(long a,long b) {
        if(b==0)return a;
        return uoc(b,a%b);
        
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Ps a=new Ps();
        a.tu=sc.nextLong();
        a.mau=sc.nextLong();
        long u=uoc(a.tu,a.mau);
        System.out.println((a.tu/u)+"/"+(a.mau/u));
    }
}
