import java.util.*;
public class Khaibasolpnhanvien {
    public static String xuly(String ns) {
        String []tmp=ns.split("/");
        ns="";
        for(int i=0;i<tmp.length-1;i++)
        {
            String tmp2=tmp[i];
            if(tmp2.length()==1)tmp2='0'+tmp2;
            ns=ns+tmp2+"/";
        }
        ns=ns+tmp[tmp.length-1];
        return ns;
        
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String msv="00001";
        String ten=sc.nextLine();
        String gt=sc.nextLine();
        String ns=xuly(sc.nextLine().trim());
        String dc=sc.nextLine();
        String thue=sc.nextLine();
        String khd=xuly(sc.nextLine());
        System.out.printf("%s %s %s %s %s %s %s",msv,ten,gt,ns,dc,thue,khd);

    }
}
