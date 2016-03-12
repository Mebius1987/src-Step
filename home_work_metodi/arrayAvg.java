package Step.home_work_metodi;

/**
 * Created by Mebius on 10.03.2016.
 */
public class arrayAvg {

    public static int arrayAvg(int ar[]) {
        /*
        6.	Написать статический метод arrayAvg, определяющий среднее арифметическое элементов передаваемого ему массива.
*/
        int s = 0;
        for (int current : ar) {
            s += current;
        }
        return s/ar.length;
    }
    public static void main(String[] args) {
        int sred =arrayAvg(new int[]{1, 2, 3, 4, 5});
        System.out.println(sred);
    }
}
