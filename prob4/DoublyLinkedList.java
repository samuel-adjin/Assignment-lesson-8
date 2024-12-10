package prob4;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //implement

    }
    // 2. Remove by passing object
    public boolean remove(String item){

        //Implement
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        // Implement
        return false;
    }


    // 4. Prints the list from last to first
    public void printReverse() {

        // Implement
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // Call all your implemented Methods
    }
}
