import java.util.Scanner;
import java.util.HashSet;

public class UniqueCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        HashSet<Character> uniqueChars = new HashSet<>();
        boolean hasAlnum = false;

        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
            if (Character.isLetterOrDigit(c)) {
                hasAlnum = true;
            }
        }

        System.out.println(hasAlnum ? uniqueChars.size() : 0);
    }
}
