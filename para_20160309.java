package Step;

import java.util.Arrays;

/**
 * Created by Mebius on 09.03.2016.
 */
public class para_20160309 {

    public static void va(int a, double b, String... s) {
        // в методе могут быть другие параметры, кроме ...
    }

    public static void va(int... v) {
        // вполне обычный метод
    }

    public static void va(int a, int... v) {
        // ошибки нет, но вызвать такой метод не получится - ambigious call
    }
/*

        public static void va(int a, double b, String... v, boolean c) {
            // ... в середине сигнатуры не допускается!
        }

        public static void va(int... i, String... s) {
            // несколько ... не допускается!
        }
*/
    public static void main(String[] args) {
        System.out.println(main(););
    }
}
