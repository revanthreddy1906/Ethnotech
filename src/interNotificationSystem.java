interface Notifications {
    void sendMessages(String message);
}
class MobileNotification implements Notifications {
    public void sendMessages(String message)
    {
        System.out.println("Sending mobile notification: " + message);
    }
}
class EmailNotification implements Notifications {
    public void sendMessages(String message)
    {
        System.out.println("Sending email notification: " + message);
    }
}
class InstaNotification implements Notifications {
    public void sendMessages(String message)
    {
        System.out.println("Sending Instagram notification: " + message);
    }
}
class WatsappNotification implements Notifications {
    public void sendMessages(String message)
    {
        System.out.println("Sending Watsapp notification: " + message);
    }
}
class JobNotification implements Notifications {
    public void sendMessages(String message)
    {
        System.out.println("Sending Job notification: " + message);
    }
}
public class interNotificationSystem {
    public static void main(String[] args) {
        MobileNotification md = new MobileNotification();
        EmailNotification ed = new EmailNotification();
        InstaNotification id = new InstaNotification();
        WatsappNotification wn=new WatsappNotification();
        JobNotification JB=new JobNotification();
        md.sendMessages("You have a new message!");
        ed.sendMessages("You have a new email!");
        id.sendMessages("You got an insta message!");
        wn.sendMessages("Notification from whatsapp!");
        JB.sendMessages("There is a notification from jobmella!");
    }
}