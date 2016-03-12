package Step.para_20160311_rekyrsi9;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Mebius on 11.03.2016.
 */
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int size = 20;
        Random r = new Random();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt(size);
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(binSearch(ar, 5, 0, ar.length - 1));
    }

    static int binSearch(int[] ar, int value, int l, int r) {
        int m = (l + r) / 2;

        if (l >= r) {
            return -1;
        }//условие выхода

        if (ar[m] == value) {
            return m;
        } else if (ar[l] == value) {
            return l;
        } else if (ar[r] == value) {
            return r;
        } else if (ar[m] > value) {
            return binSearch(ar, value, l, m - 1);
        } else {
            return binSearch(ar, value, m + 1, r);
        }
    }
}

