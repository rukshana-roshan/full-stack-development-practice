public class FirstNonRepeated {
    public static void main(String[] args) {

        String text = "programming";

        for (int i = 0; i < text.length(); i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeated Character = " + text.charAt(i));
                break;
            }
        }
    }
}
