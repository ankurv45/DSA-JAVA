class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
}
class DeleteLastNode{
    public static void main(String[] args) {
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);

            Node head = n1;
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;

            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

    }
}
