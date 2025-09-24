import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator{

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!?¿¡@#$€%^&()-_=+<>";

    public static void main(String[] args){

        int length;
        String uppercase;
        String digits;
        String symbols;
        String password = "";
        String passwordChars = LOWERCASE_CHARS;
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Password Generator!");
        System.out.print("Please, select a length for your password: ");

        length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Include Uppercase letters? (y/n): ");
        uppercase = scanner.nextLine();

        System.out.println("Include Digits? (y/n): ");
        digits = scanner.nextLine();

        System.out.println("Include Symbols? (y/n): ");
        symbols = scanner.nextLine();

        if (uppercase.equalsIgnoreCase("y")){
            passwordChars += UPPERCASE_CHARS;
        }

        if (digits.equalsIgnoreCase("y")){
            passwordChars += DIGITS;
        }

        if (symbols.equalsIgnoreCase("y")){
            passwordChars += SYMBOLS;
        }

        for (int i = 0; i < length; i++){
            int randomIndex = random.nextInt(passwordChars.length());
            password += passwordChars.charAt(randomIndex);
        }

        System.out.println("Your password is: " + password);
    }

}
