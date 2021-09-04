import java.util.*;
public class Tichmatranvoichuyenvicuano {
    static void tich(int a[][],int b[][],int c[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=0;
                for(int k=0;k<m;k++)
                {
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
    }
    static void cv(int a[][],int b[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[j][i]=a[i][j];
            }
        }
    }
    static void outf(int c[][],int n,int m)
    {
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("\n");
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int t=1;
        while(t<=test)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int [n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int b[][]=new int [m][n];
            cv(a,b,n,m);
            int c[][]=new int [n][n];
            tich(a,b,c,n,m);
            System.out.println("Test "+t+":\n");
            outf(c,n,n);
            // System.out.println("");
            // outf(b,m,n);
            // System.out.println("");
            // outf(c,n,n);
            t++;
        
        }
        sc.close();
    }

}
