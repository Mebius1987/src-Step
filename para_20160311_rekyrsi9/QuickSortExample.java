package Step.para_20160311_rekyrsi9;

/**
 * Created by Mebius on 11.03.2016.
 */
public class QuickSortExample {
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

        int size = 10;
        int ar[] = new int[size];

        // до сортировки
        for (int i = 0; i < size; i++) {
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i] + " ");
        }
        System.out.print("\n\n");
        quickSort(ar, 0, ar.length - 1);

        // после сортировки
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.print("\n\n");
    }
}
