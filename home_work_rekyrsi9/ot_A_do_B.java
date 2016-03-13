package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
public class ot_A_do_B {
    /*
  2. От A до B.
Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
Ввод: 5 1
Вывод: 5 4 3 2 1


            */

    public static int N(int a, int b) {
        if (a <= b)
            return 1;//условие выхода из рекурсии
        System.out.println(a);
        return N(a + 1);// условие входа

    }

    public static void main(String[] args) {

        N(5,6);
    }
}
