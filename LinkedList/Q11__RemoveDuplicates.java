class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
}
class RemoveDuplicates {
    public static void main(String[] args) {

     Node n1 = new Node(10);
     Node n2 = new Node(10);
     Node n3 = new Node(20);
     Node n4 = new Node(20);
     Node n5 = new Node(20);
     Node n6 = new Node(30);
     Node n7 = new Node(40);
     Node n8 = new Node(40);

     Node head = n1;
      
     n1.next = n2;
     n2.next = n3;
     n3.next = n4;
     n4.next = n5;
     n5.next = n6;
     n6.next = n7;
     n7.next = n8;

    Node temp = head;
      
    while (temp != null && temp.next != null){
        if (temp.data == temp.next.data) {
            temp.next = temp.next.next;
        }
        else {
            temp = temp.next;
        }
    }
      
    temp = head;

    while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
    }
}
