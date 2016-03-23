package Step.array_part1;

import java.util.Scanner;

/**
 * Created by Mebius on 09.03.2016.
 */
public class array_part1_22 {
    private static Scanner input = new Scanner(System.in);

    private static void print(Object ob) {
        System.out.print(ob);
    }

    private static void println(Object ob) {
        System.out.println(ob);
    }

    private static void printf(String s, Object... args1) {
        System.out.printf(s, args1);
    }

    static String[] _x_1x = {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять ",
            "десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ",
            "пятнадцать ", "шестьнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать ",};
    static String[] _x0 = {"двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семдесят ", "восемдесят ", "девяносто "};
    static String[] _x00 = {"сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};

    static String toString(int x) {
        String result;
        if (x < 0) return "минус " + toString(-x);
        if (x == 0) return "ноль ";
        result = _xxx_toString(x % 1000);

        if ((x / 1000) % 1000 == 0) result = "" + result;
        else if ((x / 1000) % 1000 == 1) result = "тысяча " + result;
        else if ((x / 1000) % 10 == 1) result = _xxx_toString((x / 1000) % 1000, true) + "тысяча " + result;
        else if ((x / 1000) % 10 == 2 || (x / 1000) % 10 == 3 || (x / 1000) % 10 == 4)
            result = _xxx_toString((x / 1000) % 1000, true) + "тысячи " + result;
        else result = _xxx_toString((x / 1000) % 1000, true) + "тысяч " + result;

        if ((x / 1000_000) % 1000 == 0) result = "" + result;
        else if ((x / 1000_000) % 1000 == 1) result = "миллион " + result;
        else if ((x / 1000_000) % 10 == 1) result = _xxx_toString((x / 1000_000) % 1000) + "миллион " + result;
        else if ((x / 1000_000) % 10 == 2 || (x / 1000_000) % 10 == 3 || (x / 1000_000) % 10 == 4)
            result = _xxx_toString((x / 1000_000) % 1000) + "миллиона " + result;
        else result = _xxx_toString((x / 1000_000) % 1000) + "миллионов " + result;

        if ((x / 1000_000_000) % 1000 == 0) result = "" + result;
        else if ((x / 1000_000_000) % 1000 == 1) result = "миллиард " + result;
        else if ((x / 1000_000_000) % 10 == 1) result = _xxx_toString((x / 1000_000_000) % 1000) + "миллиард " + result;
        else if ((x / 1000_000_000) % 10 == 2 || (x / 1000_000_000) % 10 == 3 || (x / 1000_000_000) % 10 == 4)
            result = _xxx_toString((x / 1000_000_000) % 1000) + "миллиарда " + result;
        else result = _xxx_toString((x / 1000_000_000) % 1000) + "миллиардов " + result;

        return result;

    }

    static String _xxx_toString(int x, boolean thousand) {
        String result = "";
        if (thousand && x == 2) return "две ";
        if (x < 20) return _x_1x[x];
        if (x / 100 > 0) result += _x00[x / 100 - 1];
        if ((x % 100) < 20) return result + _x_1x[x % 100];
        if ((x / 10) % 10 > 0) result += _x0[(x / 10) % 10 - 2];
        if (thousand && x % 10 == 1) return result + "одна ";
        if (thousand && x % 10 == 2) return result + "две ";
        if (x % 10 > 0) result += _x_1x[x % 10];
        return result;
    }

    static String _xxx_toString(int x) {
        return _xxx_toString(x, false);
    }

    public static void main(String[] args) {
        System.out.print("Введите челое число не больше милиарда... ");
        int x = input.nextInt();
        println(toString(x));
    }

}
