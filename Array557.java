import java.util.ArrayList;
import java.util.Scanner;

public class Array557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<Character>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.next().charAt(0));
        }

        System.out.print(arr.get(0) + " ");
        System.out.print(arr.get(3) + " ");
        System.out.print(arr.get(6));

    }
}
