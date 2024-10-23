package pl.JavaCodingExercises.exercises.linkedlists;

public class ReturnKthToLast {
    //Implement an algorithm to find the kth to last element of a singly linked list
    //Hints: #8, #25, #41, #67, #126
    //#8 What if you knew the linked list size? What is the difference between finding the Kth-tolast
    //element and finding the Xth element?
    //#25 If you don't know the linked list size, can you compute it? How does this impact the
    //runtime?
    //#41 Try implementing it recursively. If you could find the ( K - l ) th to last element, can you
    //find the Kth element?
    //#67 You might find it useful to return multiple values. Some languages don't directly support
    //this, but there are workarounds in essentially any language. What are some of those
    //workarounds?
    //#126 Can you do it iteratively? Imagine if you had two pointers pointing to adjacent nodes
    //and they were moving at the same speed through the linked list. When one hits the end
    //of the linked list, where will the other be?

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

        ReturnKthToLast returnKthToLast = new ReturnKthToLast();
        System.out.println(returnKthToLast.returnKthToLastElement(node1, 3).data); //k odleglość szukanego Node'a od końca listy. Wartość z tego Node'a mam zwrócić
    }

    public Node returnKthToLastElement(Node root, int k) {

        Node headNode = root;
        Node tailNode = root;

        for(int i = 0; i < k; i++) { //ustawiam ten wskaźnik na k-tym elemencie od początku. Czyli jestem wartość k-tą pozycję przed drugim wskaźnikiem
            if(headNode == null) {
                return null;
            }
            headNode = headNode.next; //czyli przesuwam wskaźnik o te k-te elemnty do przodu.
        }

        while(headNode != null) { //tą różnię od początku k-tego elementu przenoszę na koniec linked listy tak aby k-ty element wskaszywany przez headNode był k-tym elementem od końca wskazywanym przez tailNode.
            headNode = headNode.next;
            tailNode = tailNode.next; //ten wskaźnik jest na k-tej pozycji od tyłu listy.
        }

        return tailNode;
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
