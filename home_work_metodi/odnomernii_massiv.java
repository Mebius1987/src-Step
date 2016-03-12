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

    public static void main(String[] args) {

        int a= 10;//razmer
        int mas[] = new int[a];
        zapArr(mas,a);
        sysArr(mas);
    }
}
/*
    int a = 10;//dlina massiva
    int mas[] = new int[a];
    int kol = 0;
    int sum = 0;
    int arf = 0;
for (int i = 0; i < mas.length; i++) {
        mas[i] = (int) (Math.random() * 40 - 20);
        //System.out.print(mas[i] + " ");
        System.out.println(i + "  " + mas[i] + ", ");
        if (mas[i] > 0) {
        kol++;
        sum += mas[i];
        }
        arf = sum / mas.length;
        }
        System.out.println("Положительных элеметов масива =" + kol + "\n Сумма =" + sum + "\n  Среднее арифметическое положительных элементов массива =" + arf);
        }
        */