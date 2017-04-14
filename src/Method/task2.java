package Method;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Task 2. 2 numbers evaluation: ");
        System.out.print(" Please enter number a > ");
        int a = sc.nextInt();
        System.out.print(" Please enter number b > ");
        int b = sc.nextInt();
        evaluation(a, b);
    }

    static void evaluation(int a, int b) {
        if (a>b)
            System.out.print("Max number is a");
        else if (b>a)
            System.out.print("Max number is b");
        else
            System.out.print("a==b");
    }

}
