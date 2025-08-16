import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int cnt = 0;
        int n = sc.nextInt();
        for(int i = 1; i <= n ;i++){
            if(n % i == 0){
                cnt++;
                v.add(i);
            }
        }
        System.out.println(cnt);
        for(int x : v){
            System.out.print(x + " ");
        }
    }
}
