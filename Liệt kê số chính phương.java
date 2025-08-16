import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 1; i <= (int)Math.sqrt(n);i++){
            System.out.print((long)Math.pow(i,2) + " " );
        }
    }
}
