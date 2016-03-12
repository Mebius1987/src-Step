package Step.home_work_metodi;

import java.util.Arrays;

/**
 * Created by Mebius on 10.03.2016.
 */
public class arrayMinMax {
    public static int minmax(int ar[]) {
        /*
8.	Написать статический метод, показывающий на экран минимум и максимум (значение и индекс) среди элементов передаваемого ему массива.
*/
        int min = 0;
        int max = 0;
        int mini = 0;
        int maxi = 0;
        int mas[] = new int[ar.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mas));
        min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                mini = i;

            }
        }

        max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                maxi = i;
            }
        }


        return min;
        /*
        return max;
        return mini;
        return maxi;
        */
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int mini = 0;
        int maxi = 0;
        minmax(new int[]{1, 2, 3, 4, 5});
        System.out.println("Минимальное значение = " + min + ", его порядковый номер = " + mini);
        System.out.println("Максимальное значение = " + max + ", его порядковый номер = " + maxi);
    }


}
