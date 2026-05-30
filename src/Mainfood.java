import java.util.*;

class Swiggy {
    private String name;
    private int price;

    Swiggy(String name, int price) {
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

class FoodOrder {
    private HashMap<String, Swiggy> menu = new HashMap<>();
    private ArrayList<String> orders = new ArrayList<>();

    FoodOrder() {
        menu.put("Chicken Biryani", new Swiggy("Chicken Biryani", 120));
        menu.put("Egg Biryani", new Swiggy("Egg Biryani", 100));
        menu.put("Veg Biryani", new Swiggy("Veg Biryani", 90));
        menu.put("Mutton Biryani", new Swiggy("Mutton Biryani", 180));
        menu.put("Pizza", new Swiggy("Pizza", 250));
        menu.put("Burger", new Swiggy("Burger", 150));
        menu.put("Fried Rice", new Swiggy("Fried Rice", 130));
        menu.put("Chicken Mandi", new Swiggy("Chicken Mandi", 500));
        menu.put("Ice Cream", new Swiggy("Ice Cream", 60));
        menu.put("Cool Drinks", new Swiggy("Cool Drinks", 40));
    }

    void displayMenu() {
        System.out.println("----- MENU -----");

        for (Swiggy food : menu.values()) {
            System.out.println(food.getName() + " : Rs." + food.getPrice());
        }
    }

    void addItem(String item) {
        if (menu.containsKey(item)) {
            orders.add(item);
            System.out.println(item + " added successfully.");
        } else {
            System.out.println("Item not available.");
        }
    }

    void generateBill() {
        int total = 0;

        System.out.println("\n----- BILL -----");

        for (String item : orders) {
            Swiggy food = menu.get(item);

            System.out.println(
                    food.getName() + " : Rs." + food.getPrice()
            );

            total += food.getPrice();
        }

        System.out.println("Total Amount = Rs." + total);
    }
}
public class Mainfood {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.displayMenu();
        order.addItem("Chicken Biryani");
        order.addItem("Pizza");
        order.addItem("Cool Drinks");
        order.addItem("Ice Cream");
        order.generateBill();
    }
}