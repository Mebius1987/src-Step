package Step.metodi_home_work;

/**
 * Created by Mebius on 10.03.2016.
 */
public class isSimple {
    public static boolean isSimple(int number) {
        /*
        4.	Написать статический булевский метод isSimple, который проверяет, является ли переданное ему число простым.
        Число называется простым, если оно делится без остатка только на себя и на единицу.
*/

        int start = 2;
        boolean isSimple = true; //сколько раз получился 0
        while (start < number) {
            if (number % start == 0) {
                isSimple = false;
                break;
            }
            start++;
        }
        return isSimple;

    }

    public static void main(String[] args) {

        boolean otvet = isSimple(3);
        System.out.println(otvet);

    }
}