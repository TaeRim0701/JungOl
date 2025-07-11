import java.util.Scanner;

public class Struct9130 {
    String name;
    int age;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Struct9130 Info = new Struct9130();
        System.out.print("당신의 이름은 무엇입니까? ");
        Info.name = sc.nextLine();
        System.out.print("당신의 나이는 몇 살입니까? ");
        Info.age = sc.nextInt();

        System.out.println("당신의 이름은 " + Info.name + "이고 나이는 " + Info.age + "세이군요.");
    }
}
