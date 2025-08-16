import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
         for(int i = 0 ; i <= n / a;i++){
             if((n - a*i) % b == 0){
                 System.out.print("YES");
                 return;
             }
         }
         System.out.print("NO");
    }
}
