public class CharacterFrequency {
    public static void main(String[] args) {

        String text = "banana";

        for (int i = 0; i < text.length(); i++) {

            int count = 1;

            boolean counted = false;

            for (int k = 0; k < i; k++) {

                if (text.charAt(i) == text.charAt(k)) {
                    counted = true;
                    break;
                }
            }

            if (counted)
                continue;

            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            System.out.println(text.charAt(i) + " = " + count);
        }
    }
}
