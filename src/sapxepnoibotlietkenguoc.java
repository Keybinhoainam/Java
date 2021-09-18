import java.util.*;
public class sapxepnoibotlietkenguoc {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int n=sc.nextInt();
            int a[]=new int [n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            String kq[]=new String[n];
            int i;
            for(i=0;i<n-1;i++)
            {
                int check=0;
                for(int j=0;j<n-1-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        check=1;
                        int tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
                if(check==0)break;
                String s1= "Buoc " + String.valueOf(i+1)+": ";
                for(int j=0;j<n;j++)
                {
                    s1+=String.valueOf(a[j])+" ";
                }
                kq[i]=s1;
            }
            for(int j=i-1;j>=0;j--)
            {
                System.out.println(kq[j]);
            }
        }
    }
}
