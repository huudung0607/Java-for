import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 3; i <= n; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = n; i <= n * n; i++) {
            if (i % 7 == 0)
            {
                System.out.print(i);
                break;
            }
        }
        System.out.println();
        for (int i = n; i >= 0; i--) {
            if (i % 9 == 0)
            {
                System.out.print(i);
                break;
            }
        }
        System.out.println();
        for (int i = 1; i <= 2*n - 1; i+=2)
        {
            System.out.print(i + " ");
        }
    }
}
