import java.util.ArrayList;
import java.util.Scanner;

public class Struct2605 {
    int weight, height, level = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Struct2605> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(new Struct2605());
            people.get(i).weight = sc.nextInt();
            people.get(i).height = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                int nowW = people.get(i).weight;
                int nowH = people.get(i).height;

                if (nowW < people.get(j).weight && nowH < people.get(j).height) {
                    people.get(i).level++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(people.get(i).level + " ");
        }
    }
}
