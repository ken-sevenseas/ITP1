package itp1_1;

import java.util.Scanner;

public class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secondTime = Integer.parseInt(sc.next());
        int h = secondTime / 3600;
        secondTime -= h * 3600;
        int m = secondTime / 60;
        secondTime -= m * 60;
        System.out.println(h + ":" + m + ":" + secondTime);
    }
}
