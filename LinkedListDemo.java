public class LinkedListDemo {
    node head;

    // printlist method is for printing the list
    void printlist() {
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void add(int a) {
        node temp = new node(a);
        // if linkedlist is null
        if (head == null) {
            head = temp;
        }
        // if linkedlist is not null
        else {
            node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    void addFirst(int a) {
        node temp = new node(a);
        // if linkedlist is null
        if (head == null) {
            head = temp;
        }
        // if linkedlist is not null
        else {
            temp.next = head;
            head = temp;

        }

    }

    void add(int index, int element) {
        try {
            // if linkedlist is null
            if (index == 0) {
                addFirst(element);
            }
            // if linkedlist is not null
            else {
                node temp = new node(element);
                int count = 0;
                node curr = head;
                while (count < index - 1) {
                    curr = curr.next;
                    count++;
                }
                temp.next = curr.next;
                curr.next = temp;

            }

        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();

        }
    }

    void removeLast() {
        // if node is null
        if (head == null) {

        }
        // if list has only one node
        else if (head.next == null) {
            head = null;
        }
        // if list has more than one node
        else if (head.next != null) {
            node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;

            }
            curr.next = null;
        }
    }

    void removeFirst() {
        // if list is null
        if (head == null) {
            System.out.println("list is null");
        }
        // if list has only one element
        else if (head.next == null) {
            head = null;
        }
        // if list has more than one element
        else if (head.next != null) {
            node curr = head;
            curr = head;
            head = head.next;
            curr.next = null;
        }

    }

}
