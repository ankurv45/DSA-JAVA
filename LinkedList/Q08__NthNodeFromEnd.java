class Node{
          int data;
          Node next;
          Node(int data) {
              this.data = data;
              this.next = null;
          }
}
class NthNodeFromEnd{
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

          int n = 2;

          Node fast = head;
          Node slow = head;
          for (int i = 0; i < n; i++) {
              fast = fast.next;
          }

          while (fast != null){
              fast = fast.next;
              slow = slow.next;
          }
        System.out.println(slow.data);
    }
}
