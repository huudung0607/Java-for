import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1 ;i <= n ; ++i){
            sum += 1L * Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
