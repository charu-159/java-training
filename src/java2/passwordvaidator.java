package java2;
import java.util.Scanner;

public class passwordvaidator {
    private String password;

    // Constructor
    public passwordvaidator(String password) {
        this.password = password;
    }

    // Password validation method
    public boolean isValidPassword() {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read password input from user
        String inputPassword = scanner.nextLine();

        passwordvaidator validator = new passwordvaidator(inputPassword);

        // Check password validity and print result
        if (validator.isValidPassword()) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }

        scanner.close();
    }
}