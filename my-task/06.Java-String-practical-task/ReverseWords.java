public class ReverseWords {
    public static void main(String[] args) {

        String sentence = "Java is easy";
        String[] words = sentence.split(" ");

        System.out.println("Reversed Sentence:");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
