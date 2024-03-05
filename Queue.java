package queue;

public class Queue {
    private int queue[];
    private int qlength;
    private int back;
    private int front;

    public Queue(int qlength){
        this.qlength = qlength;
        queue = new int[qlength];
        front = -1;
        back = -1;
    }
    boolean isEmpty(){
        if(front == -1 && back == -1){
            return true;
        } else {
            return false;
        }
    }
    boolean isFull(){
        return (back == qlength - 1);
    }

    void insert(int itemValue) {
        if(isFull()){
            throw new RuntimeException("Очередь заполнена");
        } else if(front == -1 && back == -1){
            front = back = 0;
            queue[back] = itemValue;
        } else{
            back++;
            queue[back] = itemValue;
        }
    }
    void display(){
        if(isEmpty()){
            throw  new RuntimeException("Очередь пуста");
        } else {
            for(int i = front; i <= back; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    void remove(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back){
            front = back = -1;
        } else {
            front++;
        }
    }
    public int element(){
        return queue[front];
    }
}
