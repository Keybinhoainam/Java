import java.util.Scanner;
public class Chuanhoaxauhoten1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++)
        {
            String s=sc.nextLine();
            s=s.toLowerCase();
            char a[]=s.toCharArray();
            int i=0;
            for(;i<a.length;i++)
            {
                if(a[i]!=' ')
                {
                    break;
                }
            }
            int k=i;
            int upper=1;
            for(;i<a.length;i++)
            {
                if(upper==1&&Character.isLetter(a[i]))
                {
                    a[i]=Character.toUpperCase(a[i]);
                    upper=0;
                }
                if(!Character.isLetter(a[i]))
                {
                    upper=1;
                }
            }
            i=k;
            for(;i<a.length;i++)
            {
                if(i<a.length-1&&a[i]==' '&&a[i+1]==' ')
                {
                    continue;
                }
                System.out.print(a[i]);
            }
            System.out.println();

            

            
        }
        // sc.close();
    }
}
