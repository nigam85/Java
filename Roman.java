import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a HashMap to store the Roman numeral symbols and their corresponding values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Read Roman numeral as input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String romanNumeral = scanner.nextLine().toUpperCase();

        // Convert Roman numeral to integer
        int result = 0;
        int prevValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(romanNumeral.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }

        // Print the integer value
        System.out.println(result);
    }
}
