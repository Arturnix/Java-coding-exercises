package pl.JavaCodingExercises.exercises.linkedlists;

public class Node {

    public int data;
    public Node next; //pointer to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
