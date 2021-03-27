package Ch01.Ex01;

import java.util.Scanner;

public class Ch01Ex01 {
    public static void main(String[] args) {
        System.out.println("Give me an integer:");
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();
        scan.close();
        System.out.printf("Binary: %s\n", Integer.toString(integer, 2));
        System.out.printf("Octal: %s\n", Integer.toString(integer, 8));
        System.out.printf("Hex: %s\n", Integer.toString(integer, 16));
        System.out.printf("Reciprocal as hex: %a\n", 1.0 / integer);
    }
}
