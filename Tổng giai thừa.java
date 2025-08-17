import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         long giaiThua = 1;
         long sum = 0;
         for(int i = 1;i <= n; i++){
             giaiThua *= 1l * i;
             sum += giaiThua;
         }
         System.out.print(sum);
    }
}
