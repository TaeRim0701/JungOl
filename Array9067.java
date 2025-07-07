import java.util.ArrayList;
import java.util.Scanner;

public class Array9067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print(arr.get(2) + " ");
        System.out.print(arr.get(4) + " ");
        System.out.print(arr.get(9));

    }
}
