import java.util.*;
public class Sapxepnoibot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int dem=1;
        for(int i=n-1;i>=0;i--)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(a[j-1]>a[j])
                {
                    c=1;
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                }
            }
            if(c==1)
            {
                System.out.print("Buoc "+(dem++)+": " );
               for(int k=0;k<=n-1;k++)
              {
                  System.out.print(a[k]+" ");
              }
              System.out.print("\n");
            }
            else break;
            
        }
        sc.close();
    }
}
