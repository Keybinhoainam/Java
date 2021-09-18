import java.util.*;
public class Tongphanso {
    public static Scanner sc=new Scanner(System.in);
    public static long uoc(long a,long b) {
        if(b==0)return a;
        return uoc(b,a%b);
        
    }
    public static void main(String[] args) {
        long tu1=sc.nextInt();
        long mau1=sc.nextInt();
        long tu2=sc.nextInt();
        long mau2=sc.nextInt();
        long tu=tu1*mau2+tu2*mau1;
        long mau=mau1*mau2;
        long tmp=uoc(tu,mau);
        System.out.println((tu/tmp)+"/"+(mau/tmp));
    }
}
