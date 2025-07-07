import java.util.ArrayList;
import java.util.Scanner;

public class Array9068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0;

        while(i < 100) {
            int n = sc.nextInt();

            if (n == 0) break;
            else {
                arr.add(n);
            }
            i++;
        }

        for (int j = 1; j < arr.size(); j += 2) {
            System.out.print(arr.get(j) + " ");
        }
    }
}
