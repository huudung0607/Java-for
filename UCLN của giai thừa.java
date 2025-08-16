import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        if(a < b){
            long giaiThua = 1;
            for(long i = 1;i <= a;i++){
                giaiThua *= i;
            }
            System.out.print(giaiThua);
        }
        else if(a == b){
            long giaiThua = 1;
            for(long i = 1;i <= a;i++){
                giaiThua *= i;
            }
            System.out.print(giaiThua);
        }
        else{
            long giaiThua = 1;
            for(long i = 1;i <= b;i++){
                giaiThua *= i;
            }
            System.out.print(giaiThua);
        }
    }
}
