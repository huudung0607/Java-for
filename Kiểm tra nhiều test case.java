import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            if(x % 2 == 0) System.out.println("EVEN");
            else System.out.println("ODD");
        }
    }
}
