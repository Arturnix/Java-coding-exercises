package pl.JavaCodingExercises.exercises.linkedlists;

public class DeleteMiddleNode {
    /* Implement an algorithm to delete a node in the middle (any node but the first and last node, not necessarily the exact middle)
of a singly linked list, given only access to that node.
Example:
Input: the node c from the linked list a->b->c->d->e->f
Result: nothing is returned but the new linked list looks like a->b->d->e->f
Czyli bez tego node c, który jest podany jako argument w inpucie.
Hints #72: Picture the list 1->5->9->12, removing 9 will make it looks like 1->5->12. You only have access to 9 node. Can you
make it looks like the correct answer?
     */

    private void deleteNode(Node nodeToDelete) {

        Node headNode = nodeToDelete;
        nodeToDelete.data = nodeToDelete.next.data;

        while(headNode != null) {
            headNode.data = headNode.next.data;

            if(headNode.next.next == null) {
                headNode.next = null;
            }

            headNode = headNode.next;
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
        deleteMiddleNode.deleteNode(node4);
        System.out.println(node1);
    }

    public static class Node {

        public int data;
        public Node next;

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
}
