package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
/*
10. Степень числа.
Вычислить степень числа, используя рекурсию. В статический метод передаётся 2 параметра - число и степень.

 */
public class Stepen_10 {


    public static int F(int n, int s) {

        if (s != 1) {
            return n * F(n, s - 1);
        }
        return n;
    }

    public static void main(String[] args) {

        System.out.println(F(5, 3));
    }

}

