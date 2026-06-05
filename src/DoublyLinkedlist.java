class Node3 {
    String data;
    Node3 prev;
    Node3 next;
    Node3(String data) {
        this.data = data;
    }
}
public class DoublyLinkedlist {
    static Node3 delete(Node3 head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        Node3 prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head;
    }
    static Node3 add(Node3 head,String val)
    {
        Node3 newNode=new Node3(val);
        if(head==null)
        {
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        return newNode;
    }
    static Node3 back(Node3 head)
    {
        Node3 t=head;
        while(t.next!=null)
        {
            t=t.next;
        }
        return t;
    }
    public static void main(String[] args) {

        Node3 first = new Node3("Bharath");
        Node3 second = new Node3("Brami");
        Node3 third = new Node3("Achari");
        Node3 fourth =new Node3("Revanth");
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next=fourth;
        fourth.prev=third;
        Node3 temp = first;
        System.out.print("forward : ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.print("delete : ");
        first= delete(first);
        Node3 t=first;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
        System.out.print("Adding : ");
        first=add(first, "Harsha");
        Node3 te=first;
        while(te!=null)
        {
            System.out.print(te.data+" ");
            te=te.next;
        }
        System.out.println();
        System.out.print("Back : ");
        first=back(first);
        Node3 k=first;
        while(k!=null)
        {
            System.out.print(k.data + " ");
            k = k.prev;
        }
    }
}