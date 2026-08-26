// 1st way

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class FindIntersection {
    public static void main(String[] args) {

        // List 1
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head1 = n1;

        n1.next = n2;
        n2.next = n3;

        // Common part
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n3.next = n4;
        n4.next = n5;

        // List 2
        Node n6 = new Node(15);
        Node n7 = new Node(25);

        Node head2 = n6;

        n6.next = n7;
        n7.next = n4;   // Same Node 40

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != temp2) {

            if (temp1 == null) {
                temp1 = head2;
            } else {
                temp1 = temp1.next;
            }

            if (temp2 == null) {
                temp2 = head1;
            } else {
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            System.out.println(temp1.data);
        } else {
            System.out.println("No intersection");
        }
    }
}



//2nd way

class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
}
class FindIntersection {
    public static void main(String[] args) {

     Node n1 = new Node(10);
     Node n2 = new Node(20);
     Node n3 = new Node(30);

     Node head1 = n1;
        n1.next = n2;
        n2.next = n3;

     Node n4 = new Node(40);
     Node n5 = new Node(50);
     n4.next = n5;

     Node n6 = new Node(15);
     Node n7 = new Node(25);

     Node head2 = n6;
     n6.next = n7;

    Node temp1 = head1;
    Node temp2 = head2;

    while (temp1.next != null) {
        temp1 = temp1.next;
    }
    while (temp2.next != null){
        temp2 = temp2.next;
    }
    temp1.next = n4;
    temp2.next = n4;

    temp1 =head1;
    temp2 = head2;

    int length1 = 0;
    int length2 = 0;

    while (temp1 != null) {
        length1++;
        temp1 = temp1.next;
    }

        while (temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;
    int diff = length1 - length2;
        if (diff > 0) {
           for (int i = 0; i < diff; i++){
                temp1 = temp1.next;
            }
        } else if (diff < 0) {
           for (int i = 0; i < -diff; i++) {
               temp2 = temp2.next;
           }
        }

        while (temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        System.out.println(temp1.data);
    }
}
