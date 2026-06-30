public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String text = "programming";
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            boolean found = false;

            for (int j = 0; j < result.length(); j++) {

                if (ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result = result + ch;
            }
        }

        System.out.println("Original String : " + text);
        System.out.println("Without Duplicates : " + result);
    }
}
