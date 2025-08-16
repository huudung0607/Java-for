import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.println(1);
            return;
        }
        int cnt = 0;
        while(n != 0){
            n /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
