package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 15.03.2016.
 */
public class Levonapravo_6 {
    public static void levonapravo(int n) {

        if (n / 10 != 0) {
            levonapravo(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        levonapravo(179);
    }
}

