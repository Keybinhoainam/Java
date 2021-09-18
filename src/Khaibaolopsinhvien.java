import java.util.*;
public class Khaibaolopsinhvien {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String msv="B20DCCN001";
        String ten=sc.nextLine();
        String lop=sc.nextLine();
        String ns=sc.nextLine().trim();
        String []tmp=ns.split("/");
        ns="";
        for(int i=0;i<tmp.length-1;i++)
        {
            String tmp2=tmp[i];
            if(tmp2.length()==1)tmp2='0'+tmp2;
            ns=ns+tmp2+"/";
        }
        ns=ns+tmp[tmp.length-1];
        float n1=sc.nextFloat();
        System.out.printf("%s %s %s %s %.2f",msv,ten,lop,ns,n1);

    }
}
