class InsertBeforeValue{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Main{
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node newnode = new Node(25);

        int beforeValue = 30;

        Node temp = head;

        while (temp.next != null && temp.next.data != beforeValue) {
            temp = temp.next;
        }

        if (temp.next != null) {
            newnode.next = temp.next;
            temp.next = newnode;
        } else {
            System.out.println("Value not found");
        }
        temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
