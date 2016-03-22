package Step.while_part2;

import javax.swing.*;

/**
 * Created by Mebius on 07.03.2016.
 */

class Point {
    int x, y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    Point p1, p2;
    int A, B, C;
    int left_width=0, right_width=0;

    // Ax+By+C=0 (y1-y2)*x + (x2-x1)*y + (x1*y2-x2*y1) = 0
    Line (int x1, int y1, int x2, int y2) {
        p1 = new Point(x1,y1); p2 = new Point(x2,y2);
        A = p1.y-p2.y;
        B = p2.x-p1.x;
        C = p1.x*p2.y-p2.x*p1.y;
    }

    Line (int x1, int y1, int x2, int y2, int left_width, int right_width) {
        p1 = new Point(x1,y1); p2 = new Point(x2,y2);
        A = p1.y-p2.y;
        B = p2.x-p1.x;
        C = p1.x*p2.y-p2.x*p1.y;
        this.left_width = -left_width;
        this.right_width = right_width;
    }

    void show() {
        System.out.printf(" Отрезок от точки с координатами (%d;%d) до точки (%d;%d)\n", p1.x, p1.y, p2.x, p2.y);
        System.out.printf (" Уравнение прямой Ax+By+C=0;	 %d*x + %d*y + %d = 0\n", A, B, C);
    }

    boolean draw (int x, int y) {
        return //((A*x+B*y+C)>left_width) && ((A*x+B*y+C)<right_width) &&
                (A*x+B*y+C)>=(left_width)&&(A*x+B*y+C)<=right_width &&

                        ((p1.y<p2.y)? (!(y<p1.y) && !(y>p2.y)) : (!(y<p2.y) && !(y>p1.y))) &&
                        ((p1.x<p2.x)? (!(x<p1.x) && !(x>p2.x)) : (!(x<p2.x) && !(x>p1.x)));
    }
}

public class while2_17 {

    private static void print (String s) {System.out.print(s);}
    private static void println (String s) {System.out.println(s);}
    private static void printf (String s, Object... args1) {System.out.printf(s, args1);}

    public static void main(String[] args) {
        String answer;
        do {answer= JOptionPane.showInputDialog("Введите нечетное число");} while (answer==null);
        int size = Integer.parseInt(answer);

        Line [] figure1 = {	new Line(0,0,size-1,0), new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1),
                new Line(0,size-1,size-1,size-1), new Line(0,0,size-1,size-1)};
        Line [] figure2 = {	new Line(0,0,size-1,0), new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1),
                new Line(0,size-1,size-1,size-1), new Line(0,size-1,size-1,0)};
        Line [] figure3 = {	new Line(0,0,size-1,0), new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1),
                new Line(0,size-1,size-1,size-1), new Line((size-1)/2,0,(size-1)/2,size-1)};
        Line [] figure4 = {	new Line(0,0,size-1,0), new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1),
                new Line(0,size-1,size-1,size-1), new Line(0,(size-1)/2,size-1,(size-1)/2)};
        Line [] figure5 = {	new Line(0,0,(size-1)/2,0), new Line(0,0,0,(size-1)/2), new Line(size-1,(size-1)/2,size-1,size-1),
                new Line((size-1)/2,size-1,size-1,size-1), new Line(0,0,size-1,size-1)};
        Line [] figure6 = {	new Line((size-1)/2,0,size-1,0), new Line(0,(size-1)/2,0,size-1), new Line(size-1,0,size-1,(size-1)/2),
                new Line(0,size-1,(size-1)/2,size-1), new Line(0,size-1,size-1,0)};
        Line [] figure7 = {	new Line(0,0,size-1,0), new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1),
                new Line(0,size-1,size-1,size-1),  new Line(0,0,size-1,size-1), new Line(0,size-1,size-1,0)};
        Line [] figure8 = {	new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1), new Line(0,0,size-1,size-1),
                new Line(0,size-1,size-1,0)};
        Line [] figure9 = {	new Line(0,0,size-1,0), new Line(0,size-1,size-1,size-1), new Line(0,0,size-1,size-1),
                new Line(0,size-1,size-1,0)};
        Line [] figure10 ={	new Line(0,0,size-1,0), new Line(0,0,0,size-1), new Line(size-1,0,size-1,size-1), new Line(0,size-1,
                size-1,size-1), new Line((size-1)/2,0,(size-1)/2,size-1), new Line(0,(size-1)/2,size-1,(size-1)/2)};
        Line [] figure11 ={	new Line(1,0,(size-1)/2-1,0), new Line(0,1,0,(size-1)/2-1), new Line(size-1,(size-1)/2+1,size-1,size-1-1),
                new Line((size-1)/2+1,size-1,size-1-1,size-1), new Line((size-1)/2,1,(size-1)/2,(size-1)/2-1),
                new Line((size-1)/2,(size-1)/2+1,(size-1)/2,size-1-1), new Line(1,(size-1)/2,(size-1)/2-1,(size-1)/2),
                new Line((size-1)/2+1,(size-1)/2,size-1-1,(size-1)/2)};
        Line [] figure12 ={	new Line(1,size-1,(size-1)/2-1,size-1), new Line(size-1,1,size-1,(size-1)/2-1),
                new Line(0,(size-1)/2+1,0,size-1-1), new Line((size-1)/2+1,0,size-1-1,0),
                new Line((size-1)/2,1,(size-1)/2,(size-1)/2-1), new Line((size-1)/2,(size-1)/2+1,(size-1)/2,size-1-1),
                new Line(1,(size-1)/2,(size-1)/2-1,(size-1)/2), new Line((size-1)/2+1,(size-1)/2,size-1-1,(size-1)/2)};

        Line [][] picture = {figure1, figure2, figure3, figure4, figure5, figure6, figure7, figure8, figure9, figure10, figure11, figure12};

        for (Line[] figure:picture) {
            boolean draw=false;
            for (int y=0; y<size; println(""), y++)
                for (int x=0; x<size; draw=false, x++) {
                    for (Line line:figure)
                        if (!draw && line.draw(x,y)) {print(" *"); draw=true;}
                    if (!draw) print("  ");
                }
            println("");
        }
    }
}
