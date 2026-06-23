public class EvenandOdd {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}