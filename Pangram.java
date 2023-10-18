import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//1C.Check if the input is pangram or not.
public class Pangram {

    // Method to check if a sentence is a pangram
    private static boolean checkIfPangram(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueChars.add(ch);
            }
        }

        return uniqueChars.size() == 26;
    }
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task C: Check if the input is a pangram or not
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine().toLowerCase();

        // Check if it's a pangram
        boolean isPangram = checkIfPangram(inputSentence);

        // Print the result
        System.out.println("Is Pangram: " + isPangram);

        scanner.close();
    }
}