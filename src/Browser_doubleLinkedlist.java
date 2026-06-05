//Create a browser history system where each visited page is store as a node user

class Browser{
    Browser next;
    String content;
    Browser(String content){
        this.content = content;
        this.next = null;
    }
}
class Tabs{
    Browser head;
    //can visit new pages
    void PageOpen(String content) {
        if(head == null) head = new Browser(content);
        Browser curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Browser(content);
    }
    void PageOpenAtBegining(String content) {
        Browser newNode = new Browser(content);
        newNode.next = head;
        head = newNode;
    }
    void PageOpenAtMiddle(String content) {
        if(head == null) {
            head = new Browser(content);
            return;
        }
        Browser fast = head , slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Browser temp = slow.next;
        slow.next = new Browser(content);
        slow.next.next = temp;
    }
    // display browsing history
    void display() {
        Browser curr = head;
        System.out.println("List of tabs : ");
        while(curr != null) {
            System.out.print(curr.content + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    //search for a page
    boolean search(String content) {
        Browser curr = head;
        while(curr != null) {
            if(curr.content.equals(content)) return true;
            curr = curr.next;
        }
        return false;
    }
    //delete a page from history
    void delete(String content) {
        if(head == null) {
            System.out.println("List is Empty!....");
            return;
        }
        if(head.content.equals(content)) {
            head = head.next;
            return;
        }
        Browser curr = head;
        while(curr.next != null) {
            if(curr.next.content.equals(content)) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
    }

    //count total pages visited
    int countpages() {
        Browser curr = head;
        int cnt = 0;
        while(curr != null) {
            curr = curr.next;
            cnt++;
        }
        return cnt;
    }
}
public class Browser_doubleLinkedlist {
    public static void main(String[] args) {
        Tabs tab = new Tabs();
        tab.PageOpenAtBegining("Netflix");
        tab.PageOpen("Youtube");
        tab.PageOpen("News");
        tab.PageOpenAtBegining("Games");
        tab.PageOpenAtMiddle("Poki");

        System.out.println("Search of tabs : " + tab.search("Games"));

        System.out.println("Count of tabs : " + tab.countpages());

        tab.delete("Games");

        System.out.println("Search of tabs : " + tab.search("Games"));

        System.out.println("Count of tabs : " + tab.countpages());

        tab.display();

    }

}