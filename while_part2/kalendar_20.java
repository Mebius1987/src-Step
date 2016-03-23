package Step.while_part2;

import java.util.Scanner;

/**
 * Created by Mebius on 22.03.2016.
 */
public class kalendar_20 {
    /*
    20.	Пользователь вводит дату (по отдельности день, месяц, год).
    Определить день недели, соответствующий введенной дате.
    При написании программы следует исходить из того, что 01.01.01 – это понедельник.
     */
    public static void main(String[] args) {

        task20();
    }
    public static void task20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year:");
        int yx = sc.nextInt();
        if (yx < 0) {
            System.out.println("Incorrect input");
            return;
        }
        boolean yVesokos = (yx % 4 == 0 && yx % 100 != 0) || yx % 400 == 0;
        System.out.println("Input month");
        int mx = sc.nextInt();
        if (mx < 1 || mx > 12) {
            System.out.println("Incorrect input");
            return;
        }
        System.out.print("Input day of month:");
        int dx = sc.nextInt();
        if (dx < 1 || dx > 31 || (mx == 2 && yVesokos && dx > 29) || (mx == 2 && !yVesokos && dx > 28)
                || (dx == 31 && (mx == 4 || mx == 6 || mx == 9 || mx == 11))) {
            System.out.println("Incorrect input");
            return;
        }

        final int y = 2001;
        final int m = 1;
        final int d = 1;
        int dname = 0;
        int days = 0;
        days = (yx - y) * 365 + (yx / 4 - yx / 100 + yx / 400) - (y / 4 - y / 100 + y / 400);
        if (yVesokos) {
            days--;
        }
        switch (mx) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                if (yVesokos) {
                    days += 29;
                } else {
                    days += 28;
                }
            case 2:
                days += 31;
            case 1:
                days += dx - 1;
        }
        if (y > yx || (y == yx && m > mx) || (y == yx && m == mx && d > dx)) {
            dname += 7;
        }
        dname += days % 7;
        String[] names = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(names[dname]);
    }
}
