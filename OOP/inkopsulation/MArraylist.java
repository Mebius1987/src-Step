package Step.OOP.inkopsulation;

import java.util.Arrays;

/**
 * Created by Mebius on 13.04.2016.
 */

class MyArrayList {

    private int size = 0;
    private int capacity = 10;
    private int[] data;

    public MyArrayList() {
        // data = new int[capacity]; // вместо копирования кода - применяется делегирование конструкторов!
        this(10);
        System.out.println("MyArrayList default c-tor!"); // эта строчка отладочная, в итоговой версии её быть не должно!
    }

    public MyArrayList(int capacity) {
        if (capacity < 10) {
            capacity = 10;
        }
        this.capacity = capacity;
        data = new int[capacity];
        System.out.println("MyArrayList parametrized c-tor!"); // отладочная строка кода
    }

    public void pushBack(int value) {
        ensureCapacity();
        data[size++] = value;
    }

    public void pushFront(int value) {
        ensureCapacity();
        for (int i = size; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = value;
        size++;
    }

    public void clear() {
        Arrays.fill(data, 0);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Collection is empty.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity = (capacity * 3) / 2 + 1;
            int temp[] = new int[capacity];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
        }
    }

    public boolean insert(int index, int znak) {
        ensureCapacity();
        if (index < size) {
            size++;
            ensureCapacity();
            // тут тоже можно заменить на System.arraycopy
            System.arraycopy(data, index, data, index + 1, size - index);
            data[index] = znak;
            return true;
        }
        return false;
    }

    public void removeAt(int index) {
        if (index < size) {
            System.arraycopy(data, index + 1, data, index, size - index);
            size--;
            trimToSize();
        }
    }

    public void remove(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value)
                removeAt(i + 1);
        }
    }

    public void popFront() {
        removeAt(1);
        trimToSize();
    }

    public void popBack() {
        size--;
        trimToSize();
    }

    private void trimToSize() {
        if (size < capacity / 2) {
            int temp[] = new int[capacity];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
            capacity = size;
        }
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = size; i > 0; i--) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

}

class MArraylist {

    public static void main(String[] args) {
        // тесты работы с эррейлистом:
        MyArrayList ar = new MyArrayList();
        // тестировать надо правильно
        for (int i = 0; i < 25; i++)
        {
            ar.pushBack(i);
        }
        System.out.println("Push Back");
        ar.print();

        for (int i = 0; i < 25; i++)
        {
            ar.pushFront(i);
        }
        System.out.println("Push Front");
        ar.print();

        System.out.println("Insert");
        ar.insert(25, 52);
        ar.print();

        System.out.println("BAD Insert");
        ar.insert(100, 52);
        ar.print();

        for (int i = 0; i < 25; i++)
        {
            ar.removeAt(i);
        }
        System.out.println("Remove At");
        ar.print();

        int index = ar.indexOf(12);
        System.out.println(index);

        for (int i = 0; i < 25; i++)
        {
            ar.remove(i);
        }

        System.out.println("Remove");
        ar.print();

        ar.popFront();
        System.out.println("Pop Front");
        ar.print();

        ar.popBack();
        System.out.println("Pop Back");
        ar.print();

        /*
         * ar.clear(); ar.print(); /* for (int i = 0; i < 1000; i++) {
         * ar.pushBack(i); ar.print(); }
         */
    }
}

