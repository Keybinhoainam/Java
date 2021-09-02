import java.util.*;
public class Sapxepchon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int min = a[i];
            int imin=i;
            for(int j=i+1;j<n;j++)
            {
                if(min>a[j])
                {
                    min=a[j];
                    imin=j;
                }
            }
            int tmp=a[i];
            a[i]=a[imin];
            a[imin]=tmp;
            System.out.print("Buoc "+(i+1)+": " );
            for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
