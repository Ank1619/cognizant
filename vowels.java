import java.util.HashSet;

public class vowels {
    public static void main(String[] args) {
        String str = "CDF";
        HashSet<Character> vowel = new HashSet<>();
        char[] vow = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < vow.length; i++) {
            vowel.add(vow[i]);
        }
        int vowel_count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowel.contains(ch)) {
                vowel_count++;
            }
        }
        int diff = str.length() - vowel_count;
        int result = 1;

        for (int i = 1; i <= diff; i++) {
            result *= i;
        }

        System.out.println(result);

    }
}
