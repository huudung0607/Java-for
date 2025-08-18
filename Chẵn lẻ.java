import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.print("28tech");
            return;
        }
        int cntChan = 0, cntLe = 0;
        while(n != 0){
            long lastNum = n % 10;
            if(n % 2 == 0){
                cntChan++;
            }
            else cntLe++;
            n/=10;
        }
        if(cntChan > cntLe){
            System.out.print("28tech");
        }
        else System.out.print("29tech");
    }
}
