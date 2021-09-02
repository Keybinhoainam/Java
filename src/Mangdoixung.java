import java.util.Scanner;
public class Mangdoixung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int test=sc.nextInt();
        for(int t=1;t<=test;t++)
        {
            int n=sc.nextInt();
            int []a=new int [n];
            int i;
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n/2;i++)
            {
                if(a[i]!=a[n-1-i])break;
            }
            // System.out.println(i);
            if(i==(n/2))System.out.println("YES");
            else System.out.println("NO");


        }
        sc.close();


    }
}
