class Food {
    private String name;
    private int price;
    Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
    String getName() {
        return name;
    }
    int getPrice() {
        return price;
    }
}
abstract class OrderSystem {
    abstract void displayMenu();
    abstract void addItem(String item);
    abstract void generateBill();
}
class FoodOrder2 extends OrderSystem {
    private Food[] menu;
    private Food[] orders;
    private int orderCount;
    FoodOrder2() {
        menu = new Food[10];
        menu[0] = new Food("Chicken Biryani", 120);
        menu[1] = new Food("Egg Biryani", 100);
        menu[2] = new Food("Veg Biryani", 90);
        menu[3] = new Food("Mutton Biryani", 180);
        menu[4] = new Food("Pizza", 250);
        menu[5] = new Food("Burger", 150);
        menu[6] = new Food("Fried Rice", 130);
        menu[7] = new Food("Chicken Mandi", 500);
        menu[8] = new Food("Ice Cream", 60);
        menu[9] = new Food("Cool Drinks", 40);
        orders = new Food[20];
        orderCount = 0;
    }
    @Override
    void displayMenu() {
        System.out.println("----- MENU -----");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].getName() + " : Rs." + menu[i].getPrice());
        }
    }
    @Override
    void addItem(String item) {
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getName().equalsIgnoreCase(item)) {
                found = true;
                if (orderCount < orders.length) {
                    orders[orderCount] = menu[i];
                    orderCount++;
                    System.out.println(item + " added successfully.");
                } else {
                    System.out.println("Order cart is full!");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item not available.");
        }
    }
    @Override
    void generateBill() {
        int total = 0;
        System.out.println("\n----- BILL -----");
        for (int i = 0; i < orderCount; i++) {
            System.out.println(orders[i].getName() + " : Rs." + orders[i].getPrice());
            total += orders[i].getPrice();
        }
        System.out.println("Total Amount = Rs." + total);
    }
}
public class SwiggyFoodOrder {
    public static void main(String[] args) {
        OrderSystem order = new FoodOrder2();
        order.displayMenu();
        System.out.println();
        order.addItem("Chicken Biryani");
        order.addItem("Pizza");
        order.addItem("Cool Drinks");
        order.addItem("Ice Cream");
        order.generateBill();
    }
}
