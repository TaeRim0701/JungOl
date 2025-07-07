import java.util.ArrayList;
import java.util.Scanner;

public class Array555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.next());
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
