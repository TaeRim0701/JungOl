import java.util.Scanner;

public class Function9083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("10큰수 : " + add10(n));
        System.out.println("10작은수 : " + sub10(n));
    }

    public static int add10(int n) {
        return n + 10;
    }

    public static int sub10(int n) {
        return n - 10;
    }
}
