import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp = n;
        while(n >= 10){
            n/=10;
        }
        while(tmp != 0){
            long lastNum = tmp % 10;
            if(lastNum > n){
                System.out.print("NO");
                return;
            }
            tmp/=10;
        }
        System.out.print("YES");
    }
}
