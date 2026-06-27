public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 67,100,80};
        int evenCount=0;
        int oddCount =0;

        for (int i = 0; i< arr.length;i++){
            if (arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }

        }
        System.out.println("even count is:" + evenCount);
        System.out.println("Odd count is:" + oddCount);
    }
    
}
