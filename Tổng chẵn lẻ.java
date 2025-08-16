import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1;i <= n;i++){
            if(i % 2 == 0){
                sum += 1l * i;
            }
            else sum -= 1l * i;
        }
        System.out.println(sum);
    }
}
