package Step.while_part2;

import Step.while_part2.Line;
import Step.while_part2.Point;

import java.util.Scanner;

/**
 * Created by Mebius on 07.03.2016.
 */
 class Point_ {
    int x, y;

    Point_(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

 class Line_ {
    Point p1, p2;
    int A, B, C;
    int left_width = 0, right_width = 0;

    // Ax+By+C=0 (y1-y2)*x + (x2-x1)*y + (x1*y2-x2*y1) = 0
    Line_(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        A = p1.y - p2.y;
        B = p2.x - p1.x;
        C = p1.x * p2.y - p2.x * p1.y;
    }

    Line_(int x1, int y1, int x2, int y2, int left_width, int right_width) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        A = p1.y - p2.y;
        B = p2.x - p1.x;
        C = p1.x * p2.y - p2.x * p1.y;
        this.left_width = -left_width;
        this.right_width = right_width;
    }

    void show() {
        System.out.printf(" Отрезок от точки с координатами (%d;%d) до точки (%d;%d)\n", p1.x, p1.y, p2.x, p2.y);
        System.out.printf(" Уравнение прямой Ax+By+C=0;	 %d*x + %d*y + %d = 0\n", A, B, C);
    }

    boolean draw(int x, int y) {
        return (A * x + B * y + C) >= (left_width) && (A * x + B * y + C) <= right_width &&
                ((p1.y < p2.y) ? (!(y < p1.y) && !(y > p2.y)) : (!(y < p2.y) && !(y > p1.y))) &&
                ((p1.x < p2.x) ? (!(x < p1.x) && !(x > p2.x)) : (!(x < p2.x) && !(x > p1.x)));
    }
}

public class while2_18 {
    private static Scanner input = new Scanner(System.in);

    private static void print(String s) {
        System.out.print(s);
    }

    private static void println(String s) {
        System.out.println(s);
    }

    private static void printf(String s, Object... args1) {
        System.out.printf(s, args1);
    }

    public static void main(String[] args) {

        Line[] picture = {

                // Забор
                new Line(71, 17, 112, 17), new Line(71, 20, 112, 20),
                new Line(73 + 4 * 0, 15, 73 + 4 * 0, 21), new Line(74 + 4 * 0, 15, 74 + 4 * 0, 21),
                new Line(73 + 4 * 1, 15, 73 + 4 * 1, 21), new Line(74 + 4 * 1, 15, 74 + 4 * 1, 21),
                new Line(73 + 4 * 2, 15, 73 + 4 * 2, 21), new Line(74 + 4 * 2, 15, 74 + 4 * 2, 21),
                new Line(73 + 4 * 3, 15, 73 + 4 * 3, 21), new Line(74 + 4 * 3, 15, 74 + 4 * 3, 21),
                new Line(73 + 4 * 4, 15, 73 + 4 * 4, 21), new Line(74 + 4 * 4, 15, 74 + 4 * 4, 21),
                new Line(73 + 4 * 5, 15, 73 + 4 * 5, 21), new Line(74 + 4 * 5, 15, 74 + 4 * 5, 21),
                new Line(73 + 4 * 6, 15, 73 + 4 * 6, 21), new Line(74 + 4 * 6, 15, 74 + 4 * 6, 21),
                new Line(73 + 4 * 7, 15, 73 + 4 * 7, 21), new Line(74 + 4 * 7, 15, 74 + 4 * 7, 21),
                new Line(73 + 4 * 8, 15, 73 + 4 * 8, 21), new Line(74 + 4 * 8, 15, 74 + 4 * 8, 21),
                new Line(73 + 4 * 9, 15, 73 + 4 * 9, 21), new Line(74 + 4 * 9, 15, 74 + 4 * 9, 21),

                // Домик
                new Line(20, 21, 65, 21), new Line(20, 10, 65, 10),
                new Line(20, 10, 20, 21), new Line(65, 10, 65, 21),

                // Окошко
                new Line(30, 17, 40, 17), new Line(30, 13, 30, 17),
                new Line(30, 13, 40, 13), new Line(40, 13, 40, 17),
                new Line(35, 13, 35, 17), new Line(30, 15, 40, 15),

                // Дверь
                new Line(58, 13, 58, 21), new Line(50, 13, 50, 21), new Line(50, 13, 58, 13),

                //Крыша с дымоходом
                new Line(15, 11, 43, 3, 20, 20), new Line(70, 11, 43, 3, 20, 20),
                new Line(54, 6, 54, 4), new Line(58, 7, 58, 4), new Line(54, 4, 58, 4)
        };

        boolean draw = false;
        for (int y = 0; y < 35; println(""), y++)
            for (int x = 0; x < 200; draw = false, x++) {
                for (Line line : picture)
                    if (!draw && line.draw(x, y)) {
                        print("*");
                        draw = true;
                    }
                if (!draw) print(" ");
            }
    }
}
