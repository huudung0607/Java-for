import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long lastNum = n % 10;
        while(n >= 10){
            n/=10;
        }
        System.out.print(n + " " + lastNum);
    }
}
