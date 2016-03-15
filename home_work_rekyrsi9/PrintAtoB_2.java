package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
public class PrintAtoB_2 {
    /*
  2. От A до B.
Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
Ввод: 5 1
Вывод: 5 4 3 2 1


            */

    public static int printAtoB(int a, int b) {
        if (a < b) {
            System.out.println(a);
            return 1 + printAtoB(a + 1, b);
        } else if (a > b) {
            System.out.println(a);
            return 1 + printAtoB(a - 1, b);
        } else {
            System.out.println(a);
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Количество входов " + printAtoB(5, 11));
    }
}
