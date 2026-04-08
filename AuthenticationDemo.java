import java.util.Scanner;
class AuthException extends Exception {
public AuthException(String message) {
super(message);
}
}
public class AuthenticationDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final String VALID_USER = "admin";
final String VALID_PASS = "ktupass123";
System.out.print("Enter Username: ");
String inputUser = sc.nextLine();
System.out.print("Enter Password: ");
String inputPass = sc.nextLine();
System.out.println("\nVerifying credentials...");
try {
if (!(inputUser.equals(VALID_USER) && inputPass.equals(VALID_PASS))) {
throw new AuthException("Invalid username or password!");
} else {
System.out.println("Access Granted. Welcome to the system.");
}
} catch (AuthException e) {  
System.out.println("SECURITY ALERT: " + e.getMessage());
}}}
