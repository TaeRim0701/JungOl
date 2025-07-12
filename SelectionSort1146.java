import java.util.Scanner;

public class SelectionSort1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int min = num[i];
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (min > num[j]) {
                    min = num[j];
                    minIdx = j;
                }
            }
            num[minIdx] = num[i];
            num[i] = min;

           for (int j = 0; j < n; j++) {
               System.out.print(num[j] + " ");
           }
           System.out.println();
        }
    }
}
