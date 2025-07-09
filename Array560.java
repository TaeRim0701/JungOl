import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(Collections.min(arr));
    }
}
