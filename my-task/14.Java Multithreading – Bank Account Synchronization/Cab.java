public class Cab {

    private boolean booked = false;

    public synchronized void bookCab(String customerName) {

        if (!booked) {
            System.out.println(customerName + " successfully booked the cab.");
            booked = true;
        } else {
            System.out.println(customerName + " failed to book the cab. Cab is already booked.");
        }
    }
}
