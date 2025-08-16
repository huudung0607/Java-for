import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.println(0);
            return;
        }
        int cnt = 0;
        while(n != 0){
            long lastNum = n % 10;
            if(lastNum == 2 || lastNum == 3 || lastNum == 5 || lastNum == 7){
                cnt++;
            }
            n/=10;
        }
        System.out.println(cnt);
    }
}
