// 1st way

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RotateLinkedList {
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

        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;

        if (k != 0) {
            tail.next = head;

            Node newTail = head;

            for (int i = 1; i < length - k; i++) {
                newTail = newTail.next;
            }

            head = newTail.next;
            newTail.next = null;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


// 2nd way

class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
}
class Main {
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

     int length = 1;

     Node temp = head;
     while (temp.next != null){
         length++;
         temp = temp.next;
     }
     temp.next = head;
     
     int k = 2;
     k = k % length;
     
     temp = head; 
     
     for (int i=1; i < length - k ;i++){
         temp = temp.next;
     }
     head = temp.next;
     temp.next = null;
    }
}
