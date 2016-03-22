package Step.while_part2;

class Box {
    protected int width, length, hight;

    Box() {
        width = 0;
        length = 0;
        hight = 0;
    }

    Box(int width, int length, int hight) {
        this.width = width;
        this.length = length;
        this.hight = hight;
    }

    Box(int length) {
        this.width = length;
        this.length = length;
        this.hight = length;
    }

    public void printSimple() {
        System.out.print("\n  ");
        for (int y = 0; y < length - 1 + hight; System.out.print("\n  "), y++)
            for (int x = 0; x < length - 1 + width; x++)
                if (false
                        || (x == 0 && y >= length - 1 && y <= length - 1 + hight - 1)
                        || (x == width - 1 && y >= length - 1 && y <= length - 1 + hight - 1)
                        || (x == length - 1 && y >= 0 && y <= hight - 1)
                        || (x == width - 1 + length - 1 && y >= 0 && y <= hight - 1)

                        || (y == 0 && x >= length - 1 && x <= length - 1 + width - 1)
                        || (y == hight - 1 && x >= length - 1 && x <= length - 1 + width - 1)
                        || (y == length - 1 && x >= 0 && x <= width - 1)
                        || (y == hight - 1 + length - 1 && x >= 0 && x <= width - 1)

                        || (x == length - 1 - y && y >= 0 && y <= length - 1)
                        || (x == length - 1 + hight - 1 - y && y >= hight - 1 && y <= hight - 1 + length - 1)
                        || (x == width - 1 + length - 1 - y && y >= 0 && y <= length - 1)
                        || (x == width - 1 + length - 1 + hight - 1 - y && y >= hight - 1 && y <= hight - 1 + length - 1)
                        )
                    System.out.print(" *");
                else System.out.print("  ");
    }

    public void printHideLine() {
        System.out.print("\n  ");
        for (int y = 0; y < length - 1 + hight; System.out.print("\n  "), y++)
            for (int x = 0; x < length - 1 + width; x++)
                if (false
                        || (x == 0 && y >= length - 1 && y <= length - 1 + hight - 1)
                        || (x == width - 1 && y >= length - 1 && y <= length - 1 + hight - 1)
                        //	|| (x==length-1 && y>=0 && y<=hight-1)
                        || (x == width - 1 + length - 1 && y >= 0 && y <= hight - 1)

                        || (y == 0 && x >= length - 1 && x <= length - 1 + width - 1)
                        //	|| (y==hight-1 && x>=length-1 && x<=length-1+width-1)
                        || (y == length - 1 && x >= 0 && x <= width - 1)
                        || (y == hight - 1 + length - 1 && x >= 0 && x <= width - 1)

                        || (x == length - 1 - y && y >= 0 && y <= length - 1)
                        //	|| (x==length-1+hight-1-y && y>=hight-1 && y<=hight-1+length-1)
                        || (x == width - 1 + length - 1 - y && y >= 0 && y <= length - 1)
                        || (x == width - 1 + length - 1 + hight - 1 - y && y >= hight - 1 && y <= hight - 1 + length - 1)
                        )
                    System.out.print(" *");
                else if (false
                        || (x == length - 1 && y >= 0 && y <= hight - 1)
                        || (y == hight - 1 && x >= length - 1 && x <= length - 1 + width - 1)
                        || (x == length - 1 + hight - 1 - y && y >= hight - 1 && y <= hight - 1 + length - 1)
                        )
                    System.out.print(" '");
                else
                    System.out.print("  ");
    }
}

public class While_part_2 {

    public static void main(String[] args) {

        Box box1 = new Box(8, 4, 7);
        Box box2 = new Box(6);

        box1.printSimple();
        box1.printHideLine();
        box2.printSimple();
        box2.printHideLine();
    }
}
