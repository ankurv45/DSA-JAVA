class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MergeSortedLists {
    public static void main(String[] args) {

        // First sorted list
        Node n1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(50);

        Node head1 = n1;

        n1.next = n2;
        n2.next = n3;

        // Second sorted list
        Node n4 = new Node(20);
        Node n5 = new Node(40);
        Node n6 = new Node(60);

        Node head2 = n4;

        n4.next = n5;
        n5.next = n6;

        Node temp1 = head1;
        Node temp2 = head2;

        // First node decide
        Node head;
        Node tail;

        if (temp1.data < temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        // Merge
        while (temp1 != null && temp2 != null) {

            if (temp1.data < temp2.data) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }

        // Attach remaining nodes
        if (temp1 != null) {
            tail.next = temp1;
        } else {
            tail.next = temp2;
        }

        // Print merged list
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
