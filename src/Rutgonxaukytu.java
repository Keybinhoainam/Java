import java.util.*;
public class Rutgonxaukytu {
    public static String kt(String s)
    {
        int check=1;
        while(check==1)
        {
            check=0;
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    check=1;
                    String tmp1=s.substring(0, i),tmp2="";
                    if(i+2<s.length())tmp2=s.substring(i+2, s.length());
                    s=tmp1+tmp2;
                    break;
                }

            }
        }
        return s;
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.next();
        s=kt(s);
        if(s.isEmpty())System.out.println("Empty String");
        else System.out.println(s);
    }
}
