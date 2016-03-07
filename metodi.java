package Step;


public class metodi {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int streetMagic = 10;
        int hogwartsMagic = 15;

        streetMagic = streetMagic + hogwartsMagic - (hogwartsMagic = streetMagic);

        System.out.println(streetMagic); // 15
        System.out.println(hogwartsMagic); // 10

        // before change
        swap(streetMagic, hogwartsMagic);

        // after change
        System.out.println(streetMagic); // 15
        System.out.println(hogwartsMagic); // 10
    }
}