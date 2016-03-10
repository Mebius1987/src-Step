package Step.metodi_home_work;

/**
 * Created by Mebius on 10.03.2016.
 */
public class cube {
    public static double cube(int chislo) {
        /*
        3.	Написать статический метод cube, который возвращает куб переданного числа.
*/
        return Math.pow(chislo, 3);

    }

    public static void main(String[] args) {
        double rezult = cube(5);
        System.out.println(rezult);
    }
}
