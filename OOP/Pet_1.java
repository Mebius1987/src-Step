package Step.OOP;

/**
 * Created by Mebius on 25.03.2016.
 */
/*
1.	Реализовать класс Pet, который описывает характеристики и поведение домашнего питомца (собаки, рыбки, хомячка, удава, и тп).
 */

class Dog { // do not change class name!

    // поля:
    String name; // кличка собачки
    String color; // цвет (масть)
    String poroda;
    int age; // возраст в годах
    double weight; // вес
    boolean isHungry; // голодный или нет?
    boolean xo4etGulat;
    boolean xo4etCesat;

    // методы:
    void play() {
        System.out.println(name + " играется!");
    }

    void sleep() {
        System.out.println(name + " спит");
    }

    void laet() {
        System.out.println(name + " лает на прохожих...");
    }

    void prosit() {
        System.out.println(name + " просится гулять");
    }

    void gdet() {
        System.out.println(name + " ждет хозяйку у входа");
    }

    void grustit() {
        System.out.println(name + " грустит, что хозяйка не его чухает");
    }
}

class Pet { // change!

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = " собачка Гарри";
        dog.age = 9;
        dog.play();
        dog.laet();
        dog.sleep();
        dog.prosit();
        dog.gdet();
        dog.grustit();

    }
}