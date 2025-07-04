import java.util.Scanner;

public class Main {
    public static Long factorial(int n) {
        if (n == 1) {
            System.out.printf("%d! = %d\n", n, n);
            return (long)1;
        }

        System.out.printf("%d! = %d * %d!\n", n, n, n - 1);
        return (long)n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
