import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1;i <= n ;i++){
            for(int j = 1;j <= n;j++){
                cnt++;
                if(i % 2 != 0) System.out.print((char)(cnt + 64));
                else System.out.print((char)(cnt + 96));
                if(j == n){
                    cnt = i;
                }
            }
            System.out.println();
        }
    }
}
