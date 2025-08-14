
import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 3;i <= n ;i += 3){
            sum += 1L * i;
        }
        System.out.println(sum);
    }
}
