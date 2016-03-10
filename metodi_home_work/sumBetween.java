package Step.metodi_home_work;

/**
 * Created by Mebius on 10.03.2016.
 */
public class sumBetween {
    public static int sumBetween(int first, int second) {
        /*
        5.	Написать статический метод sumBetween, который получает в качестве параметров 2 целых числа и возвращает сумму чисел из диапазона между ними.
*/
        int sum = 0;
        for (int i = first + 1; i < second; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumBetween(12, 14);
        System.out.println(sum);
    }
}