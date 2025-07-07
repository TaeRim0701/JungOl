import java.util.ArrayList;
import java.util.Scanner;

public class Array9066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 65; i <= 90; i++) {
            arr.add((char)i);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
            System.out.print(" ");
        }
    }
}
