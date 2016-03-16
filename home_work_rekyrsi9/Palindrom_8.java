package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 16.03.2016.
 */
/*

8. Палиндром.
Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом. Выведите YES или NO.
При решении этой задачи нельзя пользоваться циклами.
Ввод: radar yes
Вывод: YES NO

 */
public class Palindrom_8 {
    public static String palindrom (String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return palindrom(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static void main (String[] args){
        System.out.println(palindrom("radar"));
    }
}
