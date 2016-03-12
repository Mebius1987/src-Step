package Step.home_work_metodi;

/**
 * Created by Mebius on 10.03.2016.
 */

public class odnomernii_massiv {
    public static int[] zapArr(int ar[], int razmer) {
            /*
        7.	Написать 4 метода, которые позволят: вернуть ссылку на созданный одномерный массив типа int указанного размера,
        заполнить массив случайными числами, показать массив на экран консоли, отсортировать массив, вставить целое
         число в указанный массив типа int по указанному индексу.
*/
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 40 - 20);
        }
        return ar;
    }
    public static void sysArr(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + "  " + ar[i] + ", ");
        }
    }
    static void quickSort(int ar[], int start, int end) {

        int L = start, R = end;
        int M = ar[(start + end) / 2];

        do {

            while (ar[L] < M) {
                L++;
            }
            while (ar[R] > M) {
                R--;
            }

            if (L <= R) {
                int temp = ar[L];
                ar[L] = ar[R];
                ar[R] = temp;
                L++;
                R--;
            }

        } while (L <= R);

        if (start < R) {
            quickSort(ar, start, R);
        }
        if (L < end) {
            quickSort(ar, L, end);
        }
    }

    public static void main(String[] args) {

        int a= 10;//razmer
        int mas[] = new int[a];
        zapArr(mas,a);
        sysArr(mas);
        quickSort(mas, 0, mas.length - 1);
    }
}
