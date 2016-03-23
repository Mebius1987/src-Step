package Step.array_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mebius on 23.03.2016.
 */
public class array_23 {
    public String pars(String st) {
        String result = "";
        char[] ch = st.toCharArray();
        int counter = 1;

        if (st.length() == 1)
            result = "1" + st;
        else {
            for (int i = 0; i < st.length() - 1; i++) {
                if (((char) ch[i] == (char) ch[i + 1])) {
                    counter++;
                } else {
                    result += Integer.toString(counter);
                    result += (char) ch[i];
                    counter = 1;
                }
                if (i == st.length() - 2) {
                    result += Integer.toString(counter);
                    result += (char) ch[i + 1];
                    counter = 1;
                }
            }

        }

        return result;
    }

    public static void main(String[] arg) throws IOException {
        digits x = new digits();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String st = "1";
        int bloks = 0;

        System.out.print("blocks number : ");
        bloks = Integer.parseInt(read.readLine());

        for (int i = 0; i < bloks; i++) {
            st = x.pars(st);
        }
        System.out.print(st + ' ');
    }
}


