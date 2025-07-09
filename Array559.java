import java.util.Scanner;

public class Array559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] average = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

        int Start = sc.nextInt();
        int End = sc.nextInt();

        System.out.println(average[Start - 1] + average[End - 1]);
    }
}
