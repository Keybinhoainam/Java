import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0&&b!=0)System.out.println("VN");
        if(a==0&&b==0)System.out.println("VSN");
        if(a!=0)
        {
            float val=(0-b)/a;
            // System.out.println(val);
            // String kq=String.format("%.2f", val);
            System.out.printf("%.2f", val);
            // System.out.printf("%.2f", kq);
        }
        sc.close();
    }
}
