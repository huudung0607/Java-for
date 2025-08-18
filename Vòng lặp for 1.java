import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Hello 28tech");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
