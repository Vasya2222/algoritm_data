package seminar3;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(0);
        list.add(4);
        list.add(-6);

        list.print();
        list.reverse();
        list.print();
    }
}
