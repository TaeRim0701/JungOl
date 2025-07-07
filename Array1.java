import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            arr.add(n);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            System.out.print(" ");
        }

    }
}
