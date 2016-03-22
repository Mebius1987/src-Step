package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
/*
9. Фибоначчи.
Определить статический метод для вычисления элементов ряда чисел Фибоначчи, исходя из рекуррентного выражения F(n) = F(n-1) + F(n-2).
Метод принимает индекс числа, возвращает значение числа.

 */
public class Fibona4i_9 {
    //public static int count =0;
    public static int F(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{

            return F(n - 1) + F(n - 2);
        }

    }

    public static void main(String[] args) {

        System.out.println(F(1000));
    }

}
