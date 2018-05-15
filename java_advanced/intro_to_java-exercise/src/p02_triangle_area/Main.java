package p02_triangle_area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int x2 = scan.nextInt();

        int y1 = scan.nextInt();
        int y2 = scan.nextInt();

        int z1 = scan.nextInt();
        int z2 = scan.nextInt();

        int area = (x1 * (y2 - z2) + y1 * (z2 - x2) + z1 * (x2 - y2)) / 2;

        System.out.println(Math.abs(area));
    }
}
