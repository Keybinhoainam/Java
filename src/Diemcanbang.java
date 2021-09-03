import java.util.*;
public class Diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=1;t<=test;t++)
        {
            int n=sc.nextInt();
            int a[]=new int [n+1];
            int tongr=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                tongr+=a[i];
            }
            int tongl=a[0];
            int check=0;
            if(tongl==tongr)
            {
                System.out.println(1);
                check=1;
            }
            int i;
            for(i=1;i<n;i++)
            {
                tongl+=a[i];
                tongr-=a[i-1];
                if(tongl==tongr)
                {
                    check=1;
                    System.out.println(i+1);
                    break;
                }
            }
            if(check==0)System.out.println(-1);
        }
        sc.close();
    }
}
