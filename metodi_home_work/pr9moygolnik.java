package Step.metodi_home_work;

/**
 * Created by Mebius on 10.03.2016.
 */
public class pr9moygolnik {
    public static void myRectangle(int Height, int Width, char ramka, char a) {
/*
        2.	Написать статический метод myRectangle, который выводит на экран консоли прямоугольник.
        Метод принимает 4 параметра: ширина, высота, символ рамки, символ заливки.
*/

        for (int y = 0; y < Height; y++) {
            for (int x = 0; x < Width; x++) {
                if (y == Height + 1) {
                    System.out.print(ramka);
                }
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {


        myRectangle(5, 5, '@', '*');
    }
}
