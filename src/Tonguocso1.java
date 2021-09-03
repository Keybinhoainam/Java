import java.util.*;
public class Tonguocso1 {
    public static void main(String[] args) {
        int tmp=2000000;
        int res[]=new int [tmp+5];
        res[1]=1;
        for(int i=2;i<=tmp;i++)
        {
            if(res[i]==0)
            {
                for(int j=i;j<=tmp;j+=i)
                {
                    int tmp2=j;
                    int dem=0;
                    while(tmp2%i==0)
                    {
                        dem++;
                        tmp2/=i;
                    }
                    res[j]+=(dem*i);
                }
            }
        }
        long kq=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int t=1;t<=n;t++)
        {
            int so=sc.nextInt();
            // System.out.print();
            // System.out.println(so+" "+res[so]);
            kq+=res[so];

        }
        System.out.println(kq);
        sc.close();
    }
}
