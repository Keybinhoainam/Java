import java.util.*;
public class Capsocotongbangk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int [n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(map.containsKey(a[i]))
                {
                    int tmp=map.get(a[i])+1;
                    map.replace(a[i], tmp);

                }
                else
                {
                    map.put(a[i], 1);
                }
            }
            long kq=0;
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(k-a[i]))
                {
                    int tmp=map.get(k-a[i]);
                    // System.out.println(a[i]+" "+tmp);
                    kq+=tmp;
                    if(k-a[i]==a[i])kq-=1;
                }
            }
            System.out.println(kq/2);
        }
        sc.close();
    }
}
