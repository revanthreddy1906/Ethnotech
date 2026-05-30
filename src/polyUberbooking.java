class UberRide {
    void calculateFare() {
        System.out.println("Calculating estimated Uber fare...");
    }
}
class UberBike extends UberRide {
    @Override
    void calculateFare() {
        double fare = 50.0;
        System.out.println("Uber Bike fare: $" + fare);
    }
}
class UberAuto extends UberRide {
    @Override
    void calculateFare() {
        double fare = 100.0;
        System.out.println("Uber Auto fare: $" + fare);
    }
}
class UberCab extends UberRide {
    @Override
    void calculateFare() {
        double fare = 250.0;
        System.out.println("Uber Cab (Premier) fare: $" + fare);
    }
}
class UberShare extends UberRide {
    @Override
    void calculateFare() {
        double fare = 150.0;
        System.out.println("Uber Share fare: $" + fare);
    }
}
public class polyUberbooking {
    public static void main(String[] args) {
        UberRide bike = new UberBike();
        UberRide auto = new UberAuto();
        UberRide cab = new UberCab();
        UberRide share = new UberShare();
        System.out.println("--- Uber Booking Estimates ---");
        bike.calculateFare();
        auto.calculateFare();
        cab.calculateFare();
        share.calculateFare();
    }
}