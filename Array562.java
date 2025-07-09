import java.util.ArrayList;
import java.util.Scanner;

public class Array562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr_even = new ArrayList<>();
        ArrayList<Integer> arr_odd = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0) {
                arr_even.add(sc.nextInt());
            } else {
                arr_odd.add(sc.nextInt());
            }
        }

        int sum = arr_even.stream().mapToInt(n -> n).sum();
        double average = arr_odd.stream().mapToDouble(n -> n).sum() / arr_even.size();

        System.out.println("sum : " + sum);
        System.out.println("avg : " + average);
    }
}
