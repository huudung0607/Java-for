import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long lastNum = n % 10;
        long sum = 0;
        n/=10;
        while(n != 0){
            long last = n % 10;
            sum += Math.abs(lastNum - last);
            lastNum = last;
            n/=10;
        }
        System.out.print(sum);
    }
}
