import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n; i <= n*n; i++)
        {
            if (i % 17 == 0)
            {
                System.out.print(i + " ");
                break;
            }
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            if (i % 7 == 0)
            {
                System.out.print(i + " ");
                break;
            }
        }
        System.out.println();
        int sum = 1;
        int step = 1;
        for (int i = 1; i <= n; i++)
        {
            System.out.print(sum + " ");
            step++;
            sum += step - 1;
            if (sum > n)
            {
                break;
            }
        }
    }
}
