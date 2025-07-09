import java.util.Arrays;
import java.util.Scanner;

public class Array9072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = Arrays.stream(arr).sum();
        int average = sum / arr.length;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + (double)average);
    }
}
