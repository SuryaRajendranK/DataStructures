public class Linkedlistmain {
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.add(10);
        ll.add(40);
        ll.add(30);
        // ll.addFirst(100);
        // ll.add(2, 25);
        ll.printlist();
        // ll.removeLast();
        // ll.printlist();
        ll.removeFirst();
        System.out.println("hi");
        ll.printlist();

    }
}
