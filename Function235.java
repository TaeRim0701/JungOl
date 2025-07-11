import java.util.Scanner;

public class Function235 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(n);

        System.out.println(count);
    }

    public static int func(int n) {
        if (n == 1) {
            return 1;
        }
        count++;
        if (n % 2 == 0) {
            return func(n / 2);
        } else {
            return func(n / 3);
        }
    }
}
