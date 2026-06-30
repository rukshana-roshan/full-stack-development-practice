public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        boolean anagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}