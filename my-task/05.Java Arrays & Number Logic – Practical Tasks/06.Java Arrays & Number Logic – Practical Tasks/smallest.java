public class smallest {
    public static void main(String[] args) {

        int[] arr = {10, 45, 23, 89, 67};

        int Smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
        }

        System.out.println("Smallest element: " + Smallest);
    }
}
