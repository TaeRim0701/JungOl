import java.util.Scanner;

public class Array9069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;

        do {
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            if (month == 0) {
                break;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    System.out.println("입력하신 달의 날 수는 31일입니다.");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println("입력하신 달의 날 수는 30일입니다.");
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
                    System.out.println("입력하신 달의 날 수는 29일입니다.");
                } else {
                    System.out.println("입력하신 달의 날 수는 28일입니다.");
                }
            } else {
                System.out.println("잘못 입력하였습니다.");
            }
        } while (true);
    }
}
