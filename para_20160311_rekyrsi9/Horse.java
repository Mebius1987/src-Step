package Step.para_20160311_rekyrsi9;

/**
 * Created by Mebius on 11.03.2016.
 */
public class Horse {
    static int size = 8;
    static int[][] ar = new int[size][size];

    static int shiftX[] = {1, 2, 2, 1, -1, -2, -2, -1};
    static int shiftY[] = {-2, -1, 1, 2, 2, 1, -1, -2};

    static int timeout = 1; // ms

    static boolean pony(int x, int y, int step) throws InterruptedException {
        ar[y][x] = step;
        show(step);

        if (step >= size * size) {
            return true;
        }

        for (int i = 0; i < shiftX.length; i++) {
            if ((x + shiftX[i] >= 0) && (x + shiftX[i] < size) && (y + shiftY[i] >= 0)
                    && (y + shiftY[i] < size) && (ar[y + shiftY[i]][x + shiftX[i]] == 0)) {
                if (pony(x + shiftX[i], y + shiftY[i], step + 1)) {
                    return true;
                }
            }
        }
        ar[y][x] = -1;

        show(step);

        return false;
    }

    static void show(int step) throws InterruptedException {
        int pause = timeout;
        boolean rollback = false;
        System.out.println("\n");

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {

                if (ar[y][x] == -1) {
                    System.out.print("    [RB]");
                    ar[y][x] = 0;
                    rollback = true;
                } else if (ar[y][x] == step) {
                    System.out.printf("    [%2d]", ar[y][x]);
                } else {
                    System.out.printf("     %2d ", ar[y][x]);
                }
            }
            System.out.println("\n");
        }
        System.out.println("\n\n");

        if (rollback) {
            pause *= 2;
        }
        Thread.sleep(pause);
    }

    public static void main(String[] args) throws InterruptedException {
        pony(0, 0, 1);
    }
}