import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n != 0){
            if((n % 10) % 2 == 1){
                System.out.print("29tech");
                return;
            }
            n/=10;
        }
        System.out.print("28tech");
    }
}
