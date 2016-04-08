package Step.OOP;

/**
 * Created by Mebius on 25.03.2016.
 */
public class Predmeti_4 {
    /*
    4.	Создать классы, описывающие 5 любых предметов (например - электрочайник, книгу, телефон, гелевую ручку, купюру в 10 гривен, и тп).
     */
    class Helios { // do not change class name!

        // поля:
        String name = "Helios";
        String color = "black";
        String modification = "ADV";
        int number = 427737;
        boolean zar9gen;

        // методы:
        void gpsOn() {
            System.out.println(name + " следит за расположением");
        }

        void gpsOff() {
            System.out.println(name + " экономит аккумулятор");
        }

        void ignitionOn() {
            System.out.println(name + " зажигание включено ");
            gpsOn();
        }

        void ignitionOff() {
            System.out.println(name + " зажигание выключено ");
            gpsOff();
        }

        void ImmobilaizerOn() {
            System.out.println(name + " двигатель заблокирован");

        }

        void ImmobilaizerOff() {
            System.out.println(name + " двигатель разблокирован");

        }
    }

    class Akb {
        String name = "Trinix";
        String color = "black";
        String modification = "12v/7Ah";
        boolean zar9gen;

        // методы:
        void akbLow() {
            System.out.println(name + " разряжен требует зарядки");
        }

        void akbFull() {
            System.out.println(name + " заряжен может быть установлен");
        }
    }

    class Telefon {
        // поля:
        String name = "Panasonic";
        String color = "Silver";
        String model = "Kx-TGA250RU";

        // методы:
        void akbLow() {
            System.out.println(name + " заряжается стоя на базе");
        }

        void akbFull() {
            System.out.println(name + " звонит");
        }

    }

    class Hub {
        // поля:
        String name = "Ajax";
        String color = "White";
        String model = "1";

        // методы:
        void ogidaet() {
            System.out.println(name + " ждет события от датчиков");
        }

        void alarm() {
            System.out.println(name + " передает события на пульт");
        }

        void reg() {
            System.out.println(name + " проверяет через какой канал связи может зарегистрироваться");
        }
    }

    class Voda {
        // поля:
        String name = "Schweppes";
        String color = "White";
        String modification = "Bitter Lemon";
        double emkost = 1.5;

        // методы:
        void full() {
            System.out.println(name + " стоит с закрытой крышкой сдерживает воду и газ");
        }

        void open() {
            System.out.println(name + " выпускает газ из бутылки");
        }
    }


}
