import java.util.Scanner;
public class Chuanhoaxauhoten2 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++)
        {
            String s=sc.nextLine();
            s=s.toLowerCase().trim();
            String kq[]=s.split("\\s+");
            for(int i=1;i<kq.length;i++)
            {
                if(i<kq.length-1)System.out.print(Character.toUpperCase(kq[i].charAt(0))+kq[i].substring(1)+" ");
                else System.out.print(Character.toUpperCase(kq[i].charAt(0))+kq[i].substring(1));
            }
            System.out.print(", ");
            for(int i=0;i<kq[0].length();i++)
            {
                System.out.print(Character.toUpperCase(kq[0].charAt(i)));
            }
            System.out.println();
        }
    }
}
