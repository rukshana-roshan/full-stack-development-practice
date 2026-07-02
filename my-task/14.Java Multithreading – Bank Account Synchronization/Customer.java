public class Customer extends Thread {

    public Cab cab;
    public String customerName;

    public Customer(Cab cab, String customerName) {
        this.cab = cab;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        cab.bookCab(customerName);
    }
}