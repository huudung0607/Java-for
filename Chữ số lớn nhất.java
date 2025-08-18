import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.print(0);
            return;
        }
        long maxNum = -1000000000;
        while(n != 0){
            long lastNum = n % 10;
            maxNum = Math.max(maxNum,lastNum);
            n/=10;
        }
        System.out.print(maxNum);
    }
}
