import java.util.ArrayList;

public class Array556 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arr.add(i);
            System.out.print(arr.get(i - 1));
            System.out.print(" ");
        }
    }
}
