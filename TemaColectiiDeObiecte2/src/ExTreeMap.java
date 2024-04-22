import java.util.Comparator;
import java.util.TreeMap;

public class ExTreeMap {

	public static TreeMap<String, Integer> countWords(String[] words) {
        Comparator<String> caseInsensitiveComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };
        TreeMap<String, Integer> wordCounts = new TreeMap<>(caseInsensitiveComparator);
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        System.out.println(countWords(words));
    }
}
