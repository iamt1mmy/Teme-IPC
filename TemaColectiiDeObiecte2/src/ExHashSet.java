import java.util.HashSet;

public class ExHashSet {

	public static boolean containsAllVowels(String str) {
        HashSet<Character> vowels = new HashSet<>();
        for (char v : str.toLowerCase().toCharArray()) {
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                vowels.add(v);
            }
        }
        return vowels.size() == 5;
    }

    public static void main(String[] args) {
        System.out.println(containsAllVowels("The quick brown fox jumps over the lazy dog"));
        System.out.println(containsAllVowels("Hello, World!"));
    }

}
