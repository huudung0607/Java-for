import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0; i <n ;i++){
            int x = sc.nextInt();
            if(x == 2022){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
