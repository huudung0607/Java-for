import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bia = n / 28;
        int vo = bia;
        while(vo >= 3){
            int biaDoi = vo / 3;
            bia += biaDoi;
            vo = vo % 3 + biaDoi;
        }
        System.out.println(bia);
    }

}
