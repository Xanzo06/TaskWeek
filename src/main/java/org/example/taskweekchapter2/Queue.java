package org.example.taskweekchapter2;

public class Queue {
    private Node head;
    private Node tail;

    class Node {
        String data;
        Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void add(String data) {
        Node newNode = new Node(data, null);
        if (tail != null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
    }

    public String remove() {
        if (head == null) {
            return null;
        }
        String result = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return result;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Iterator iterator() {
        return new Iterator();
    }

    public class Iterator {
        private Node current;

        public Iterator() {
            this.current = head; // начинаем с начала очереди
        }

        public boolean hasNext() {
            return current != null;
        }

        public String next() {
            if (!hasNext()) {
                return null;
            }
            String data = current.data;
            current = current.next;
            return data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add("Привет");
        queue.add("Как дела?");
        queue.add("Пока");

        System.out.println(queue.remove()); // Привет
        System.out.println(queue.remove()); // Как дела?
        System.out.println(queue.remove()); // Пока
        System.out.println(queue.remove()); // null

        // Проверим итератор
        queue.add("Первый");
        queue.add("Второй");
        queue.add("Третий");

        Queue.Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
