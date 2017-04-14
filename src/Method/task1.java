package Method;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Task 1. 3 numbers: ");
        System.out.print(" Please enter number a > ");
        int a = sc.nextInt();
        System.out.print(" Please enter number b > ");
        int b = sc.nextInt();
        System.out.print(" Please enter number c > ");
        int c = sc.nextInt();
        maxNumber(a, b, c);
    }

    static void maxNumber(int a, int b, int c) {
        if ((a > b) & (a > c))
            System.out.print("Max number is a");
        else if (b > c)
            System.out.print("Max number is b");
        else if (a == b & b == c)
            System.out.print("A==B==C");
        else
            System.out.print("Max number is c");
    }

}

