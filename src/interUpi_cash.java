interface Upi {
    void upipayment();
}
interface Cash {
    void cashpayment();
}
class Payment implements Upi, Cash {
    public void upipayment() {
        System.out.println("Paying With UPI");
    }
    public void cashpayment() {
        System.out.println("Paying With Cash");
    }
}
public class interUpi_cash {
    public static void main(String[] args) {
        Payment p1=new Payment();
        p1.upipayment();
        p1.cashpayment();
    }
}
