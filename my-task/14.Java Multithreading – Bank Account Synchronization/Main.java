public class Main {

    public static void main(String[] args) {

        Cab cab = new Cab();

        Customer customer1 = new Customer(cab, "Customer 1");
        Customer customer2 = new Customer(cab, "Customer 2");
        Customer customer3 = new Customer(cab, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
