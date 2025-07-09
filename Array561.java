import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(Collections.max(less100(arr)) + " " + Collections.min(more100(arr)));

    }

    public static ArrayList<Integer> more100(ArrayList<Integer> arr) {

        ArrayList<Integer> arrMore100 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 100) {
                arrMore100.add(arr.get(i));
            }
        }

        if (arrMore100.isEmpty()) {
            arrMore100.add(100);
        }
        return arrMore100;
    }

    public static ArrayList<Integer> less100(ArrayList<Integer> arr) {

        ArrayList<Integer> arrLess100 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 100) {
                arrLess100.add(arr.get(i));
            }
        }

        if (arrLess100.isEmpty()) {
            arrLess100.add(100);
        }

        return arrLess100;
    }
}
