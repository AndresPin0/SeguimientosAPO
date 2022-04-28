package model;

public class List {

    Node first;
    Node last;
    Node actual;
    int limit;
    int turnLimit;

    public List() {
        first = null;
        last = null;
        actual = null;
        limit = 50;
        turnLimit = 3;
    }

    //      First = (1)                Last = (6)             Actual = (1)          NewNode(1)
    //<-first.prev . ->first.next        <-last.prev . ->last.next
    //        6 <-(1)-> 2  1<-(2)-> 3  2 <-(3)-> 4  3 <-(4)-> 5  4 <-(5)-> 6  5 <-(6)-> 1
    public void giveTurn(int value) {
        Node newNode = new Node(value);
        newNode.value = value;

        if (limit != 0) {
            if (first == null) {
                first = newNode;
                last = newNode;
                first.next = first;
                last.prev = last;
                actual = first;
                last = newNode;
            } else {
                last.next = newNode;
                newNode.next = first;
                last = newNode;
                first.prev = last;
            }
            limit--;
        } else {
            System.out.println("You can't add more turns. ");
        }
        System.out.println("Your turn:: " + newNode.getValue() + " has been successfully added.\n");
    }

    public void showTurn() {
        if (actual != null) {
            System.out.println("The actual turn is:: " + actual.getValue() + "\n");
        } else {
            System.out.println("There are no turns yet.\n");
        }
    }

    public void passTurn() {
        if (actual != null) {
            actual = actual.getNext();
            actual.setNext(actual.getNext());
            actual.setPrev(actual.getPrev());
        }
        System.out.println(actual.getValue());
    }

    public void deleteActualTurn() {
        Node tmp = first;

        while (tmp == first) {
            if (tmp.getValue() == actual.getValue()) {
                if (tmp == first && tmp == last) {
                    first = null;
                    last = null;
                    actual = null;
                } else if (tmp == first) {
                    first = first.getNext();
                    first.setPrev(last);
                    last.setNext(first);

                    actual = actual.getNext();
                } else if (tmp == last) {
                    last = last.getPrev();
                    last.setNext(first);
                    first.setPrev(last);

                    actual = first;
                } else {
                    tmp.getPrev().setNext(tmp.getNext());
                    tmp.getNext().setPrev(tmp.getPrev());
                    actual = tmp.getNext();
                }
            } else {
                tmp = tmp.getNext();
            }
        }
    }
}


