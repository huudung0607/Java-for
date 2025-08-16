import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(long i = 1; i <= Math.sqrt(n); ++i){
            if(n % i == 0){
                sum += i;
                if(i != n/i){
                    sum += n/i;
                }
            }
        }
        System.out.println(sum);
    }
}
