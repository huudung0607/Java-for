import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1 || n == 0){
            System.out.println(-1);
            return;
        }
        if(n % 2 == 0){
            int cnt = n / 2;
            System.out.println(cnt);
            for(int i = 0 ;i < cnt;i++){
                System.out.print(2 + " ");
            }
        }
        else{
            int cnt = n / 2;
            System.out.println(cnt);
            for(int i = 0 ;i < cnt - 1;i++){
                System.out.print(2 + " ");
            }
            System.out.print(3);
        }
    }
}
