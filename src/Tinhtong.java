import java.util.*;
public class Tinhtong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=1;t<=test;t++)
        {
            long n=sc.nextLong();
            long kq=(n+1)*n/2;
            System.out.println(kq);
        }
        sc.close();
    }
}
