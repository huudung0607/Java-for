import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n < 0){
            System.out.print("NEGATIVE");
            return;
        }
        long sum = 0;
        while(n != 0){
            if((n % 10) % 2 == 0){
                sum += n % 10;
            }
            n/=10;
        }
        System.out.print(sum);
    }
}
