public class ReverseString {
    public static void main(String[] args) {
        
        String name = "Rukshana";
        String reverse = "";

        for (int i = name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);

        }
        System.out.println("Original name :" + name);
        System.out.println("Reversed :" + reverse);

    }

    
}

