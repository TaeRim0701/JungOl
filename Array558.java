import java.util.ArrayList;
import java.util.Scanner;

public class Array558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n;

        do {
            n = sc.nextInt();
            arr.add(n);
        } while (n != 0);

        for (int i = arr.size() - 2; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
