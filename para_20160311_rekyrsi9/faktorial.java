package Step.para_20160311_rekyrsi9;

/**
 * Created by Mebius on 11.03.2016.
 */
public class faktorial {
    //public static int count =0;
    public static int F(int n) {
        //count++;
        //System.out.println(count);

        if (n == 0 || n == 1)
            return 1;//условие выхода из рекурсии

            return F(n - 1) * n;// условие входа

    }

    public static void main(String[] args) {

        System.out.println(F(16));
    }
}
