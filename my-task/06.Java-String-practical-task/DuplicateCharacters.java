public class DuplicateCharacters {
    public static void main(String[] args) {

        String text = "programming";

        for (int i = 0; i < text.length(); i++) {

            int count = 1;

            if (text.charAt(i) == ' ')
                continue;

            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (text.charAt(i) == text.charAt(k)) {
                    printed = true;
                    break;
                }
            }

            if (!printed && count > 1) {
                System.out.println(text.charAt(i) + " = " + count);
            }
        }
    }
}