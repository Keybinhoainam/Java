import java.util.*;
public class Diachiemail {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Vector<String > res=new Vector<String>();
        long test=sc.nextLong();
        sc.nextLine();
        for(long t=0;t<test;t++)
        {
            String s=sc.nextLine();
            s=s.trim();
            s=s.toLowerCase();
            String s2="";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
                {
                    continue;
                }
                else{
                    s2=s2+s.charAt(i);
                }
            }
            String kq[]=s2.split(" ");
            int n=kq.length;
            String res2=kq[n-1];
            for(int i=0;i<n-1;i++)
            {
                if(kq[i]!="")
                {
                    String tmp=kq[i].substring(0,1);
                    res2=res2+tmp;
                }
            }
            int dem=0;
            for(int i=0;i<res.size();i++)
            {
                if(res.get(i).compareTo(res2)==0)
                {
                    dem++;
                }
            }
            res.add(res2);
            if(dem>=1)
            {
                char tmp=(char)(dem+1+'0');
                res2=res2+tmp;
            }
            String tmp="@ptit.edu.vn";
            System.out.println(res2+tmp);
        }
    }
}
