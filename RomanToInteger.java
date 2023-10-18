import java.util.Scanner;
//1B. Enter a Roman Number as input and convert it to an integer.
public class RomanToInteger {

    private static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check for each Roman numeral character and add its value to the result
            switch (currentChar) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral character: " + currentChar);
                    return -1; // Return -1 for invalid input
            }
        }

        return result;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task B: Enter a Roman Number as input
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        // Convert Roman to Integer
        int integerEquivalent = romanToInteger(romanNumeral);

        // Print the result
        System.out.println("Integer Equivalent: " + integerEquivalent);

        scanner.close();
    }
}