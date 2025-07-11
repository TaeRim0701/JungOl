import java.util.Scanner;

public class Function236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println(Func(n1 * n2 * n3));
    }

    public static int Func(int n) {
        if (n == 0) {
            return 1;
        }
        int tmp = n % 10;
        if (tmp == 0) {
            tmp = 1;
        }

        return Func(n /= 10) * tmp;
    }
}
