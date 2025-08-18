import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i+=4)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++)
        {
            System.out.print((char)(i + 96) + " ");
        }
        System.out.println();
        for (int i = Math.max(0, 26 - n); i < 26; i++) {
            System.out.print((char)('a' + i) + " ");
        }
    }
}
