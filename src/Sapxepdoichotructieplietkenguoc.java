import java.util.*;
public class Sapxepdoichotructieplietkenguoc {
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
                for(int j=i+1;j<n;j++)
                {

                    if(a[j]<a[i])
                    {
                        int tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                }
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
