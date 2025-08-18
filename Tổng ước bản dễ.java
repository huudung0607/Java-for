import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                sum += 1l * i;
                if(i != n/i){
                    sum += 1l * n/i;
                }
            }
        }
        System.out.print(sum);
    }
}
