package pl.JavaCodingExercises.exercises.linkedlists;

public class NodeExample {

    NodeExample next = null;
    int data;

    public NodeExample(int d) {
        data = d;
    }

    void appendToTail(int d) {
        NodeExample end = new NodeExample(d);
        NodeExample n = this;

        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
        //What if multiple objects need a reference to the linked list, and then the head of the linked list
        //changes? Some objects might still be pointing to the old head.
    }

    NodeExample deleteNode(NodeExample head, int d) {
        NodeExample n = head;

        if(n.data == d) {
            return head.next; /* moved head */
        }

        while(n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head; /* head didn't change */
            }
            n = n.next;
        }
        return head;
    }
}
