import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive counting
        input = input.toLowerCase();

        // Create HashMap to store character counts
        HashMap<Character, Integer> letterCount = new HashMap<>();

        // Iterate over each character
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Count only letters
                letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
            }
        }

        // Display results
        System.out.println("Letter frequencies:");
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
