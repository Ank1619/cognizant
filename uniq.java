
import java.util.HashSet;

public class uniq {
    public static void main(String[] args) {
        String str="abcde";
        String str1="defgh";
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            set.add(ch);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str1.charAt(i);
            set.add(ch);
        }

        System.out.println(set);

    }
}
