package itp1_1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.print(a * b + " ");
        System.out.println(2 * a + 2 * b);
    }
}
