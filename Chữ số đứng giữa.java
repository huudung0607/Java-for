import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        long tmp = n;
        while(n != 0){
            cnt++;
            n/=10;
        }
        if(cnt % 2 == 0){
            System.out.print("NOT FOUND");
            return;
        }
        int dem = 0;
        long lastNum = 0;
        while(dem < cnt/2 + 1){
            dem++;
            lastNum = tmp %  10;
            tmp /= 10;
        }
        System.out.print(lastNum);
    }
}
