class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseKGroup {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int k = 2;

        Node current = head;
        Node previousGroupTail = null;

        while (current != null) {

            Node check = current;

            for (int i = 0; i < k; i++) {
                if (check == null) {
                    current = null;
                    break;
                }
                check = check.next;
            }

            if (current == null) {
                break;
            }

            Node groupTail = current;
            Node prev = null;

            for (int i = 0; i < k; i++) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            if (previousGroupTail == null) {
                head = prev;
            } else {
                previousGroupTail.next = prev;
            }

            previousGroupTail = groupTail;
            groupTail.next = current;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
