class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist_node {

    Node4 head;

    void insert(int data) {
        Node4 newNode4 = new Node4(data);

        if (head == null) {
            head = newNode4;
            return;
        }

        Node4 temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode4;
    }

    void display() {
        Node4 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist_node list = new Linkedlist_node();

        list.insert(15);
        list.insert(21);
        list.insert(11);

        list.display();
    }
}