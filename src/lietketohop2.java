import java.util.*;
public class lietketohop2 {
    public static int dem;
    public static Scanner sc=new Scanner(System.in);
    public static void tohop(int t,int k,int n,int a[]) {
        if(t==k+1)
        {
            dem++;
            for(int i=1;i<=k;i++)
            {
                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
        else{
            int tmp=a[t-1];
            for(int i=tmp+1;i<=n;i++)
            {
                a[t]=i;
                tohop(t+1,k,n,a);
            }
        }
        
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[k+1];
        a[0]=0;
        dem=0;
        tohop(1,k,n,a);
        System.out.printf("\nTong cong co %d to hop",dem);
        System.out.println();
    }
    
}
