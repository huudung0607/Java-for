import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= n; ++i){
            sum += 1.0/(2 * i);
        }
        System.out.printf("%.5f",sum);
    }
}
