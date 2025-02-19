
import java.util.Scanner;

/**
 * Block2 - Password Strength Evaluator
 * 
 * This program evaluates the strength of a given password based on the presence
 * of uppercase letters, lowercase letters, numbers, and special characters. It
 * categorizes passwords as "Strong", "Moderate", or "Weak" based on predefined 
 * rules and ensures that passwords shorter than 8 characters are flagged as too short.
 * 
 * @author [Rasim Crnica]
 * @version 1.0
 * @since 2025-02-18
 */
public class Block2 {
	
	/**
     * Evaluates the strength of a given password.
     * 
     * @param password The password entered by the user.
     * @return A string indicating whether the password is "Strong", "Moderate", "Weak",
     *         or "Password is too short."
     */
	private static String evaluatePasswordStrength(String password) {
		
		// Check if password length is less than 8 characters
		if (password.length() < 8) {
			
			return ("Password is too short.");
		}
		
		// Flags to track different character types
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasNum = false;
		boolean hasSpecial = false;
		
		// Iterate through each character in the password
		for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasNum = true;
            else hasSpecial = true;
        }
		
		// Determine password strength based on character combinations
		if (hasUpper && hasLower && hasNum && hasSpecial) {
			return ("Strong password");
		} else if ((hasUpper && hasLower && hasNum) || (hasUpper && hasLower && hasSpecial)) {
			
			return ("Moderate password");
		} else {
			
		return ("Weak password");
		
		}
		
	}
	
	
	 /**
     * Main method to get user input and evaluate password strength.
     * 
     * @param args Command-line arguments (not used).
     */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a password to check its strength: ");
        String password = scanner.nextLine().trim();
        
        scanner.close();
        
        System.out.println(evaluatePasswordStrength(password));
        
		

	}

}
