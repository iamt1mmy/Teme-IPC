import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> pairs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String pair = scanner.nextLine();
            pairs.add(pair);
            System.out.println(pairs.size());
        }
    }
}
