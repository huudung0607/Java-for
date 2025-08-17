import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1.0;
        long giaiThua = 1;
        for(int i = 1;i <= n ;i++){
            giaiThua *= i;
            sum += 1.0/giaiThua;
        }
        System.out.printf("%.2f",sum);
    }
}
