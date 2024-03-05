package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.insert(2024);
        queue.insert(2025);
        queue.insert(2026);
        queue.insert(2027);
        System.out.println("Очередь до удаления элемента, с главным элементом = " +queue.element());
        queue.display();
        queue.remove();
        System.out.println("Очередь после удаления элемента, с главным элементом = " + queue.element());
        queue.display();



    }
}
