// create a program where a user can enter a password to log in if user enters wrong password more than 3 times, throw a custom exception TooManyAttemptsException. if correct password is entered print login

import java.util.Scanner;

class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException() {
        super("Too many attempts");
    }
}
public class login {
    public login() {
        Scanner sc = new Scanner(System.in);
        String password = "password";
        int attempts = 0;
        try {
            while (true) {
                System.out.println("Enter password:");
                if (sc.nextLine().equals(password)) {
                    System.out.println("Login successful");
                    break;
                }
                if (++attempts > 3) throw new TooManyAttemptsException();
                System.out.println("Incorrect"+ (4 - attempts));
            }
        } catch (TooManyAttemptsException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        } }
    public static void main(String[] args) {
        new login();
    }
}
