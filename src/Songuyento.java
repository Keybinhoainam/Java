/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package btofoop;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
        int n;
        for(int i=0;i<T;i++){
          
            int dem=0;
            n=sc.nextInt();
            for(int j=1;j<=n;j++){
                if(n%j==0)dem++;
                if(dem>2)break;
            }
            if(dem==2)System.out.println("YES");
            else System.out.println("NO");                    
        }
        sc.close();
           
    }
}
