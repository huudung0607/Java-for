import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n ; i+=1){
            sum += 1l * Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
