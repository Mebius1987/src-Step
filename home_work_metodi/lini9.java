package Step.home_work_metodi;

/**
 * Created by Mebius on 10.03.2016.
 */
public class lini9 {
    public static void myLine(int length, char symbol, boolean c) {
           /*
        1.	Написать статический метод myLine, который можно будет вызвать так:
        myLine(20, '@', true);
        и при этом на экране консоли нарисуется горизонтальная линия, состоящая из 20 «собачек».
        Если передать в последнем параметре false – линия станет вертикальной.
*/
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
            if (c) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {

        myLine(20, '@', true);
    }
}
