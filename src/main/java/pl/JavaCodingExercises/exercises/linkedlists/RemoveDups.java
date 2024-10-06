package pl.JavaCodingExercises.exercises.linkedlists;

import java.util.HashSet;

public class RemoveDups {
    //time complexity O(N)
    //space complexity O(N) N - number of nodes. Jeśli nie będzie żadnych duplicates to cała lista zapisze się do hash set.
    public static void main(String[] args) {
        //create nodes
        Node node1 = new Node(1); //Expected result [1,2,3]
        Node node2 = new Node(2); //use HashSet to filter out duplicates
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(3);
        Node node6 = new Node(3);

        //link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        RemoveDups removeDups = new RemoveDups();
        removeDups.removeDups(node1);

        //print result
        while(node1 != null) {
            System.out.println(node1.data + " ");
            node1 = node1.next;
        }
    }

    public void removeDups(Node node) {
        HashSet<Integer> hs = new HashSet<>();
        Node previous = null; //pointer to the previous node. Use when I will delete node from the list

        while (node != null) { //domyslnie ostatni node nie ma ustawionego next na inny node tylko już i tak z konstruktora jest dany mu null. Więc dla niego nie ma podmiany z null na inny node.
            if(!hs.contains(node.data)) {
                hs.add(node.data);
                previous = node; //czyli poprzedni teraz bedzie tym obecnie odwiedzonym w danej iteracji i on juz przechodzi do historii jako previous aby zapewnic mozliwą iterację po wszystkich elementach.
            } else { //delete node from the list, because hs contains this node (value of this node, data field of this node).
                previous.next = node.next; //czyli next node, na jaki wskazuje ten previous to bedzie ten, na który jako next wskazuje obecny node. Czyli od obecnego noda odpinam wskazanie na next i wpinam je do tego previous node. I tym sposobem obecny node jest odpięty z mojej listy bo nie ma już elementu - node w mojej liście, który by na niego wskazywał.
            }
            node = node.next; //w ten sposób iteruję po elementach czyli moich nodach.
        }
    }
}
