package Step;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mebius on 19.02.2016.
 */
public class Stroki {
    public static void main(String[] args) {
        task4();
    }


    public static void task1() {
//1.	Ввести с клавиатуры строку текста, а затем один символ.
// Показать на экран индексы и количество совпадений (ищем вхождения символа в строку).
        Scanner sc = new Scanner(System.in);
        String a = sc.next();// вводим строку
        String find = sc.next();// вводим что искать
        int index = 0;
        int kol = 0;

        while ((index = a.indexOf(find, index)) != -1) {
            System.out.println("Индекс " + index);
            index++;
            kol++;
        }

        System.out.println("Всего нашли " + find + " = " + kol + " раза.");
    }

    public static void task2() {
        /*
        2.	Написать программу, подсчитывающую количество слов, а также гласных и согласных букв в строке,
        введённой пользователем. Дополнительно выводить количество знаков пунктуации, цифр и других символов.
         Учесть, что между словами (а также до и после слов) может быть более одного пробела!
         Текст строки должен быть на английском языке. Пример вывода программы:
Всего символов в строке текста – 38, из них:
Слов – 6
Гласных букв - 12
Согласных букв - 21
Знаков пунктуации - 2
Цифр – 0
Других символов – 3

         */
        Scanner sc = new Scanner(System.in);
        String pred = sc.nextLine();// вводим строку

        int length = pred.length();
        System.out.println("Всего символов в строке текста – " + length + ", из них:");

        String str = pred;
        str.replaceAll("[\\s]{2,}", " ");
        String parts[] = str.split(" ");
        length = parts.length;
        System.out.println("Слов – " + length);

        int a = 0;
        String regex = "[aeiouy]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pred);
        while (m.find()) {
            a++;
        }
        System.out.println("Согласных букв - " + a);

        int b = 0;
        String regexb = "[bcdfghjklmnpqrstvwxz]";
        Pattern pb = Pattern.compile(regexb);
        Matcher mb = pb.matcher(pred);
        while (mb.find()) {
            b++;
        }
        System.out.println("Гласных букв - " + b);

        int c = 0;
        String regexc = "[/p]";
        Pattern pc = Pattern.compile(regexc);
        Matcher mc = pc.matcher(pred);
        while (mc.find()) {
            c++;
        }
        System.out.println("Знаков пунктуации - " + c);

        int d = 0;
        String regexd = "[0-9]";
        Pattern pd = Pattern.compile(regexd);
        Matcher md = pd.matcher(pred);
        while (md.find()) {
            d++;
        }
        System.out.println("Цифры - " + d);

        System.out.println("Других символов – " + (length - a - b - c - d));
    }

    public static void task3() {
    /*
    3.	Подсчитать среднюю длину слова во введённом предложении.
    */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();// вводим строку
        int call = 0;
        int j = 0;
        String[] tokens = str.split(" ");
        for (int i = 1; i <= tokens.length; i++) {
            call += tokens[i].length();
            j = i;
        }
        int otvet = call / j;
        System.out.println("Средняя длина слова во введённом предложении" + otvet);
    }

    public static void task4() {
    /*
4.	Определить, является ли строка палиндромом. Примеры палиндромов:
Аргентина манит негра.
Лёша на полке клопа нашёл.
Нажал кабан на баклажан.
Я так нежен, Катя.
Мокнет Оксана с котенком…
На вид енот – это не диван…
Юра, хватит! - А в харю?
метод реверс
*/
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String copy = str;
    }

    public static void task5() {
    /*
            5.	Посчитать, сколько раз определённое слово содержится в строке текста.
*/
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();// вводим строку
        String slovo = sc.next();// ждем ввода слова
        int call = 0;
        String[] tokens = str.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            if (slovo.equalsIgnoreCase(tokens[i])) {
                call++;
            }
        }
        System.out.println("Слово \"" + slovo + "\" содержится в строке \"" + str + "\" " + call + " раза");
    }

    public static void task6() {
/*
            6. Показать на экране фразу «ЭТО СПАМ!», если введённая с клавиатуры строка содержит слова вроде
            «viagra» или «XXX»,  иначе показать фразу «это не спам». Регистр строки не имеет значения.
            Предусмотреть возможность добавления новых нежелательных слов (организовать массив).
            «buy ViAgRA now» => ЭТО СПАМ!
            «free xxxxx»             => ЭТО СПАМ!
            «innocent rabbit»  => это не спам
*/
        String[] badWords = {"XXX, viagra"};
        boolean spam = false;
        String text = "мой телефон XXX";
        for (String word : badWords) {
            if (text.contains(word))
                spam = true;
            break;
        }
        if (spam) {
            System.out.println("Это спам!");
        } else
            System.out.println("Это не спам");
    }

    public static void task7() {
    /*
        7. Даётся стоимость некоторого товара в виде строки: "$120".
        Напишите программу, которая будет из такой строки выделять число-значение, в данном случае 120.
        Также предусмотреть варианты: "$ 120", "120 EUR", "120EUR", "120 USD", "120USD", "120 грн.", "120грн.", "120 грн", "120 грн.".
        Стоимость товара может быть от 0 до 1000000000. Требуется применить регулярные выражения.
*/


    }

    /*
                    8. Напишите программу, которая генерирует пароль указанной длины.
        */
    public static void task9() {
      /*

            9. Написать программу, проверяющую является ли одна строка анаграммой для другой  строки.
             Пробелы и пунктуация, разница в больших и маленьких буквах должны игнорироваться.
             Обе строки вводятся с клавиатуры. Пример анаграммы:
    Строка 1: Аз есмь строка, живу я, мерой остр.
            Строка 2: За семь морей ростка я вижу рост!
    Другие анаграммы: http://englishon-line.ru/anagrammyi-na-angliyskom.html
*/
    }

    public static void task10() {
/*
            10. В языке Java принято первое слово,
            входящее в название переменной, записывать с маленькой латинской буквы,
            а следующее слово идёт с большой буквы (только первая буква слова большая),
            слова не имеют разделителей и состоят только из латинских букв.
            Например, правильные записи переменных в Java могут выглядеть следующим образом:
            javaIdentifier, longAndMnemonicIdentifier, name, nEERC.
            В языке Си для описания переменных используются только маленькие латинские символы и символ "_",
             который отделяет непустые слова друг от друга. Примеры:  cpp_identifier, long_and_mnemonic_identifier, name, n_e_e_r_c.
             Вам требуется написать программу, которая преобразует строку, записанную в одной нотации в формат другой нотации.
             Идентификатор переменной должен вводиться с клавиатуры.
             Программа должна определить, с какого языка взята переменная, и переделать название в другой  язык.
*/
        String a = "javaIdentifierSuperPuperTest";

        String b = "name";

        String c = "long_and_mnemonic_identifier_";

        String d = "alex_Java";

        boolean firstLetterIsBig = false;
        boolean hasBigLetter = false;
        boolean hasProcherk = false;

        String test = c;

        if (test.charAt(0) >= 'A' && test.charAt(0) <= 'Z') {
            firstLetterIsBig = true;
        }

        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) >= 'A' && test.charAt(i) <= 'Z') {
                hasBigLetter = true;
                break;
            }
        }

        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == '_') {
                hasProcherk = true;
                break;
            }
        }

        System.out.println("First Big: " + firstLetterIsBig);
        System.out.println("Has Big: " + hasBigLetter);
        System.out.println("Has _: " + hasProcherk);

        boolean isJava = false;
        boolean isCpp = false;

        if (firstLetterIsBig == false && hasBigLetter == true && hasProcherk == false) {
            isJava = true;
        } else if (firstLetterIsBig == false && hasBigLetter == false && hasProcherk == true) {
            isCpp = true;
        } else if (firstLetterIsBig == false && hasBigLetter == false && hasProcherk == false) {
            isJava = true;
            isCpp = true;
        }

        if (isJava && !isCpp) {
            System.out.println("It's Java identifier!");

            String original = test;
            String result = "";
            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) >= 'a' && original.charAt(i) <= 'z') {
                    result = result + original.charAt(i);
                } else {
                    String temp = original.charAt(i) + "";
                    temp = temp.toLowerCase();
                    result = result + "_" + temp;
                }
            }
            System.out.println(result);
        }
        if (isCpp && !isJava) {
            System.out.println("It's C++ identifier!");

            String original = test;
            String result = "";

            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) >= 'a' && original.charAt(i) <= 'z') {
                    result = result + original.charAt(i);
                } else if (original.charAt(i) == '_' && i != original.length() - 1) {
                    String temp = original.charAt(i + 1) + "";
                    temp = temp.toUpperCase();
                    result = result + temp;
                    i++;
                }
            }
            System.out.println(result);
        }
        if (!isJava && !isCpp) {
            System.out.println("Smth else!");
        }
    }

/*
            11. Для проверки знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
            чтобы задавать каждому ученику пример из таблицы умножения. Но в классе 25 человек, а примеры среди них не должны повторяться.
            В помощь учителю напишите программу, которая будет выводить на экран 25 случайных примеров из таблицы умножения
            (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
            При этом среди примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
int first = r.next(2,10);

String corrent = frist + "x" + second;
            12*. Напишите программу, которая выведет на экран все возможные варианты перестановки символов в исходной строке.
            Избежать повторения при перестановках. Примерами перестановок символов строки «AAB» могут быть «AAB», «ABA» и «BAA».

            13*. Напишите программу, которая найдет максимальное количество цифр, расположенных между двумя девятками в числе Pi.
            Ограничить этот поиск одним миллионом знаков после запятой.
            Например:  в начале числа Pi, между двумя девятками находятся 6 чисел, потом одно и тд: 3.14159265358979323846
на хабре решение
            14*. Пользователь вводит с клавиатуры арифметическое выражение. Посчитать его значение.
            Если в выражении встречаются неуместные символы, выдать сообщение, что выражение введено не корректно.
            Пример выражения:
            25 * 2 – 10 * 4 + (28 / 7.0 * (2 + 3)) =
            30.
Обратная польская запись
            15. Определить, какая буква в тексте встречается чаще всего.

    16. Дан неупорядоченный массив строк. Упорядочить строки – сначала по длине, затем по алфавиту.

    17. Перевести строку в целое число. JDK-методы использовать запрещено!
    перевести строку в масив и использовать меспау

            18. Написать программу, которая проверяет корректность email, указанного с клавиатуры.

    19. Строка состоит из слов, разделённых одним или несколькими пробелами. Переставьте слова в алфавитном порядке.

    20. Дан текст. Найдите в нём все числа, окружённые пробелами, и добавьте перед ними < и > после них.
с помощью регулярки просто
    21. В виде строк вводятся два очень длинных целых числа. Найти их сумму.

    22. Напишите программу, которая будет печатать ромбовидный рисунок на основе имеющейся строки (максимальная длина – 50 символов).
    Пример вывода, если строка "testing":

    t
            te
    tes
            test
    testi
            testin
    testing
            esting
    sting
            ting
    ing
            ng
    g

    23. Во время автопробега имена водителей нечаянно были записаны вместе с их позицией, в случайном порядке.
    Написать программу сортировки имён водителей в порядке возрастания их позиции.
    Например, давайте предположим, есть такой массив строк:
            "Эдди-3", "Майкл-1", "Ника-4", "Монтойя-6".

    Программа должна вывести:
            "Майкл, Эдди, Ника, Монтойя"

    Стартовое количество имён может быть любым. Имена выбираются случайным образом из заранее заготовленного массива имён.

    24. Написать программу, которая проверяет введённый IP-адрес на валидность. Правильный адрес выглядит
    так: xxx.xxx.xxx.xxx, где ххх - это число от 0 до 255. Требуется применить регулярные выражения.

    Например:
            .12.12.13.14
            256.25.234.221
            1.2.3.45
            23.24.25.26.

    Выводы:
    INVALID
            INVALID
    VALID
            INVALID

    25. Написать программу, которая представляет собой простую версию базы данных по хранению логинов-паролей. Возможности программы:
            1) добавление пользователя (с клавиатуры указывается логин и пароль). Если такого логина ещё нет в базе,
            тогда в массив добавляется новый пользователь (при этом в отдельном массиве типа DateTime фиксируется время создания пользователя).
            2) редактирование паролей (с клавиатуры указывается логин для нужного пользователя).
            3) удаление пользователя (по номеру в массиве, начиная с 0).
            4) показ всех данных (список всех пользователей - логины и время регистрации).
            делать 11 после этого
            */

}






