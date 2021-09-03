import java.util.*;
public class Uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int dem=0;
            int n=sc.nextInt();
            // int []snt=new int [n+5];
            int j;
            for(j=2;j*j<n;j++)
            {
                if(n%j==0)
                {
                    if(j%2==0)dem++;
                    if((n/j)%2==0)dem++;
                }
            }
            if(j*j==n&&j%2==0)dem++;
            if(n%2==0)dem++;
            System.out.println(dem);
        }
        sc.close();
    }
    
}
