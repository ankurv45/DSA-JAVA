class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
}
class DetectCycle {
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

     n5.next = n3;

     Node temp = head;
     Node slow = temp;
     Node fast = temp;
     boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
               cycle = true;
               break;
            }
        }
        if (cycle) {
            System.out.println("Cycle Detected");
        }
        else {
            System.out.println("Cycle not detected");
        }

    }
}
