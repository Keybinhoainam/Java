import java.util.Scanner;
public class Chuanhoaxauhoten1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++)
        {
            String s=sc.nextLine();
            s=s.toLowerCase().trim();
            String kq[]=s.split("\\s+");
            for(int i=0;i<kq.length;i++)
            {
                System.out.print(Character.toUpperCase(kq[i].charAt(0))+kq[i].substring(1)+" ");
            }
            System.out.println();
        }
            
    }
}
