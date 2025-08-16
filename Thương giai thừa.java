import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static long giaiThua(int n){
        long res = 1;
        for(int i = 1; i <= n; i++){
            res *= 1l * i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 0; i <= n - 1;i++){
            sum += 1.0/giaiThua(i);
        }
        System.out.printf("%.4f",sum);
    }
}
