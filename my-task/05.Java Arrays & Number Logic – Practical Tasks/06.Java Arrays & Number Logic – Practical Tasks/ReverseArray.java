public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};

        int reverse =0;

        // for(int i =arr.length;i<0;i--){
        //     reverse++;
            
        // }
        for(int i = 0; i<arr.length-1;i--){
            reverse--;
        }
        System.out.println("Reverse is :" + reverse);
    }
}
