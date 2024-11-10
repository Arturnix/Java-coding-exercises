package pl.JavaCodingExercises.exercises.linkedlists;

public class Partition {
    //Write a code to partition a linked list around a value x.
    //Such that all nodes less than x  come before all nodes gte >= x.
    //If x is contained within the list, the values of x only need to be after the elements lt < x.

    //The partition element x can appear anywhere in the "right partition".
    //It does not need to appear between the left and right partitions.

    //input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x = 5]
    //output: 1 -> 2 -> 3 -> 5 -> 8 -> 5 -> 10

    //hint #3: There are many solutions to this problem, most of which are equally optimal in runtime.
    //Some have shorter, cleaner code than others. Can you brainstorm different solutions?
    //hint #24: Consider that the elements don't have to stay in the same relative order. We only need to ensure that
    //elements less than the pivot must be before elements grater than the pivot. Does that help you come up with
    //more solutions?

    public Node sortLinkedList(Node root, int partition) {
        Node pointer = root;
        Node lessThanRoot = null;
        Node lessThanTail = null;
        Node greaterOrEqualRoot = null;
        Node greaterOrEqualTail = null;

        while(pointer != null) {
            Node next = pointer.next;
            pointer.next = null; //aby uniknac kiedy dodam jako ostatni elment listy, który ma podczepione węzły, które nie powinny znaleźć się w danej części partition.
            if(pointer.data < partition) {
                if(lessThanRoot == null) { //ustawiam pierwszy element listy z elementami lt < x
                    lessThanRoot = pointer;
                    lessThanTail = lessThanRoot;
                } else { //dodaje kolejne elmenty do listy lt < x
                    lessThanTail.next = pointer; //wksaźnik z poprzedniej iteracji, który w pierwszej iteracji wskazywał na Root, więc w drugiej to jest element .next na który wskauje Root
                    lessThanTail = pointer; //czyli to juz jest nowy wskaznik na nowy element, który w tej iteracji doszedl do listy
                }
            } else {
               if(greaterOrEqualRoot == null) {
                   greaterOrEqualRoot = pointer;
                   greaterOrEqualTail = greaterOrEqualRoot;
               } else {
                   greaterOrEqualTail.next = pointer;
                   greaterOrEqualTail = pointer;
               }
            }
            pointer = next;
        }

        if(lessThanRoot == null) { //aby uniknac bledu przy laczeniu list, poniewaz ostatni element pierwszej listy lacze z pierwszym elementem drugiej listy. Wiec zwracam od razu pierwszy element drugiej listy skoro nie mam co do niego podlaczyc.
            return greaterOrEqualRoot;
        }

        lessThanTail.next = greaterOrEqualRoot;

        return lessThanRoot;
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(8);
        Node node4 = new Node(5);
        Node node5 = new Node(10);
        Node node6 = new Node(2);
        Node node7 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Partition partition = new Partition();
        System.out.println(partition.sortLinkedList(node1, 5));

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

