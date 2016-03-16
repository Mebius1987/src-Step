package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 16.03.2016.
 */
/*
12. НОД.
Написать рекурсивный  статический метод нахождения наибольшего общего делителя двух целых чисел.
 */
public class NOD_12 {
    public static float nod(int a, int b) {
        if (a != 0 && b != 0)
            return nod(b, a % b);
        return a;
    }


    public static void main(String[] args) {
        System.out.println(nod(30, 18));
    }
}
