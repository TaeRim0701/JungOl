import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array9071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        int min = Collections.min(oddArr(arr));
        int max = Collections.max(evenArr(arr));

        System.out.print(min +" "+max);
    }

    public static ArrayList<Integer> evenArr(ArrayList<Integer> arr) {
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                even.add(arr.get(i));
            }
        }

        return even;
    }

    public static ArrayList<Integer> oddArr(ArrayList<Integer> arr) {
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                odd.add(arr.get(i));
            }
        }

        return odd;
    }
}
