package prob4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node(null);
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        //implement
        Node n = new Node(item);
        Node last = header;
        while (last.next != null) {
            last = last.next;
        }
        last.next = n;
        n.previous = last;

    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        if (item == null) return false;
        if (header.next == null) return false;
        else {
            Node current = header.next;
            while (current != null) {
                if (current.value.equals(item)) {
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                    current.previous.next = current.next;
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        // Implement
        Node firstNode = header.next;
        if (firstNode == null) {
            return false;
        }
        header.next = firstNode.next;
        if (header.next != null) {
            header.next.previous = header;
        }
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        Node currentNode = header.next;
        if (currentNode == null) {
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (currentNode != header) {
            sb.append(currentNode.value);
            currentNode = currentNode.previous;
            if (currentNode.previous != null) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println("LinkedList printed in a reverse order: " + sb);
        // Implement
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("Items in LinkedList printed: " + list);
        list.printReverse();
        list.remove("Harry");
        System.out.println("Items in LinkedList printed after removing Harry:" + list);
        list.removeFirst();
        System.out.println("Items in LinkedList printed after removing the first Item:" + list);
        // Call all your implemented Methods
    }
}
