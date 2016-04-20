package Step.OOP.inkopsulation;

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
        ensureCapacity(); // проверку, хватит ли места для нового элемента - делайте сами :)
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
        for (int i = 0; i < size; i++) {
            data[i] = 0;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0; // красота :)
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
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    public void insert(int index, int znak) {
        ensureCapacity();
        for (int i = size + 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = znak;
        size++;
    }

    public void removeAt(int index) {
        if (index < size) {
            for (int i = index - 1; i <= size; i++) {
                data[i] = data[i + 1];
            }
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
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
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

    public int lastIndexOf (int value) {
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

        ar.pushBack(12);
        ar.pushBack(18);
        ar.pushBack(16);
        ar.print();
        ar.pushFront(14);
        ar.print();
        ar.insert(2, 52);
        ar.print();
        ar.removeAt(3);
        ar.print();
        ar.remove(12);
        ar.print();
        ar.popFront();
        ar.print();
        ar.popBack();
        ar.print();
        System.out.println(ar.indexOf(18));

        System.out.println(ar.lastIndexOf(11));
        /*
        ar.clear();
        ar.print();
        /*
        for (int i = 0; i < 1000; i++) {
            ar.pushBack(i);
            ar.print();
        }
        */
    }
}

