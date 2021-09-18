import java.util.Scanner;
import java.math.*;
public class Hieusonguyenlon2 {
    public static Scanner sc=new Scanner(System.in);
    // public static String tru(String s1,String s2) {
    //     for(int i=s1.length();i<s2.length();i++)
    //     {
    //         s1='0'+s1;
    //     }
    //     for(int i=s2.length();i<s1.length();i++)
    //     {
    //         s2='0'+s2;
    //     }
    //     int check=1;
    //     if(s2.compareTo(s1)>0)
    //     {
    //         check=0;
    //         String tmp=s1;
    //         s1=s2;
    //         s2=tmp;
    //     }
    //     String s3="";
    //     int no=0;
    //     int tmp=0;
    //     for(int i=s1.length()-1;i>=0;i--)
    //     {
    //         tmp=s1.charAt(i)-s2.charAt(i)-no;
    //         if(tmp<0){
    //             tmp+=10;
    //             no=1;
    //         }
    //         else no=0;
    //         char tmp2= (char)(tmp + '0');
    //         s3=tmp2+s3;
    //     }
    //     int i=0;
    //     while(s3.charAt(i)=='0'&&i<s3.length()-1)i+=1;
    //     s3=s3.substring(i);
    //     if(check==0)s3='-'+s3;
    //     return s3;
    // }
    public static void main(String[] args) {
        // int test=sc.nextInt();
        // sc.nextLine();
        // for(int t=0;t<test;t++)
        // {
            String s1=sc.next();
            String s2=sc.next();
            BigInteger a=new BigInteger(s1);
            BigInteger b=new BigInteger("-"+s2);
            BigInteger c=a.add(b);
            System.out.println(c);
        // }
    }
}
