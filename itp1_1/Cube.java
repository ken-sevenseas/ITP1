package itp1_1;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int count = 2;
        int ans = n;
        while (count != 0) {
            ans *= n;
            count--;
        }

        System.out.println(ans);
    }
}
