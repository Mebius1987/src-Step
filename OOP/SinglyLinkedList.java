package Step.OOP;

class SinglyLinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;// голова
    private Node tail;// хвост
    private int count;

    public SinglyLinkedList() {
        // nothing to do here...
    }

    /**
     * пример комментария документации! метод под комментарием реализует
     * добавление элемента в начало списка.
     * <br />// переход на следующию строчку
     * <h2>огромный заголовок</h2>// тип заголовку
     * <h3>очень крупный заголовок</h3>
     * <hr />// горизонтальная линичия
     * <h4>большой заголовок</h4>
     * <h5>обычный заголовок</h5>
     * <h6>маленький заголовок</h6>
     * <ul>
     * <li>инкапсуляция</li>// лист тайтсл
     * <li>наследование</li>
     * <li>полиморфизм</li>
     * </ul>
     *
     * @return метод ничего не возвращает...
     * @see java.lang.String// анатация
     * @see <a href="https://vk.com/sunmeat">Alexander ©</a>
     */
    public void addHead(int data) {
        Node newElem = new Node();// создание элемента
        newElem.data = data;// передача данных
        newElem.next = head;//
        if (head == null) {
            tail = newElem;
        }
        head = newElem;
        count++;
    }

    public void addTail(int data) {
        Node newElem = new Node();
        newElem.data = data;
        //newElem.next = null;
        if (tail == null) {
            head = newElem;
        } else {
            tail.next = newElem;
        }
        tail = newElem;
        count++;
    }

    public void insert(int data, int position) {
        if (position >= count) {
            addTail(data);
            return;
        } else if (position <= 0) {
            addHead(data);
            return;
        }

        Node newElem = new Node();
        newElem.data = data;
        int i = 1;
        Node beforeNew = head;
        while (i++ != position) {
            beforeNew = beforeNew.next;
        }
        newElem.next = beforeNew.next;
        beforeNew.next = newElem;

        count++;
    }

    public void delHead() {
        if (count == 0) {
            // System.out.println("Список пуст!");
            return;
        }
        head = head.next;
        count--;
        if (head == null) {
            tail = null;
        }
    }

    public void delTail() {
        if (count == 0) {
            // System.out.println("Список пуст!");
            return;
        }
        del(count - 1);
    }

    public void del(int position) {
        if (position <= 0) {
            delHead();
            return;
        }

        if (position >= count) {
            position = count - 1;
        }

        int i = 1;
        Node beforeDel = head;
        while (i++ != position) {
            beforeDel = beforeDel.next;
        }
        Node sacrifice = beforeDel.next;
        beforeDel.next = sacrifice.next;
        count--;
        if (beforeDel.next == null) {
            tail = beforeDel;
        }
    }

    public void clear() {
        while (head != null) {
            delHead();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getCount() {
        return count;
    }

    public int indexOf(int data) {
        if (count == 0) {
            // System.out.println("Список пуст!");
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (i < count) {
            if (data == temp.data) {
                return i;
            }
            i++;
            temp = temp.next;
        }

        return -1;
    }

    public boolean isEmpty() {
            return count == 0;
    }

   // public void [] toArray (){


    }


class Program1 {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // вставка в конец списка
        sll.addTail(10);
        sll.addTail(20);
        sll.addTail(30);
        sll.addTail(40);
        sll.print();

        // вставка в начало списка
        sll.addHead(50);
        sll.addHead(60);
        sll.addHead(70);
        sll.addHead(80);
        sll.print();

        // количество элементов, поиск элементов
        System.out.println("count: " + sll.getCount());
        System.out.println("index of 70: " + sll.indexOf(70) + ", index of 90: " + sll.indexOf(90));

        // вставка по позиции
        sll.insert(-1, -1);
        sll.print();
        sll.insert(2, 2);
        sll.print();
        sll.insert(22, 22);
        sll.print();

        // удаление с начала списка
        sll.delHead();
        sll.delHead();
        sll.delHead();
        sll.print();

        // удаление с конца списка
        sll.delTail();
        sll.delTail();
        sll.delTail();
        sll.print();

        // удаление по указанному индексу
        sll.del(0);
        sll.del(1);
        sll.del(2);
        sll.print();

        // очистка списка
        sll.clear();
        sll.print();
    }
}
