package pl.JavaCodingExercises.exercises.linkedlists;

public class ReverseList {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseList reverseList = new ReverseList();
        reverseList.printReversedNodes(node1);
    }


        public void printReversedNodes (Node root){ //pierwszy element to zawsze root

            Node headNode = root;
            Node previousNode = null;
            Node newOrderNode = null;

            while (headNode != null) {
                newOrderNode = headNode.next;
                headNode.next = previousNode;
                previousNode = headNode; //prevNode staje się tym Nodem, na którym obecnie jestem wskaźnikiem headNode
                headNode = newOrderNode; //przejście na kolejny Node
            }

            System.out.println(previousNode);

        }

    public static class Node {

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
}
