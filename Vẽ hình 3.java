import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n; j++){
                cnt1++;
                System.out.print(cnt1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        int cnt2 = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n ;j++){
                cnt2++;
                System.out.print(cnt2 + " ");
                if(j == n){
                    cnt2 = i;
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1;i <= n ;i++){
            for(int j = 1; j <= n - i ; j++){
                System.out.print("~");
            }
            for(int j = 1;j <= i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1;i <= n ;i++){
            int sum = i;
            for(int j = 1;j <= i;j++){
                System.out.print(sum + " ");
                sum = sum + (n - j);
            }
            System.out.println();

        }
    }
}
