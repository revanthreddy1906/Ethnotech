abstract class FoodOrder1 {
    abstract void showMenu();
    abstract void printBill(int qty);
}
class Swiggy1 extends FoodOrder1{
    int price;
    Swiggy1(int price){
        this.price=price;
    }
    @Override
    void showMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Burger - Rs.120");
    }

    @Override
    void printBill(int qty) {
        System.out.println("Bill Amount = Rs." + (price * qty));
    }
}
class SwiggyFoodOrder {
    public static void main(String[] args) {
        Swiggy1 s1 = new Swiggy1(120);
        s1.showMenu();
        s1.printBill(2);
    }
}