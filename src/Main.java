import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String login ;
    String password;
    String conPass;
       do{  System.out.println("Enter your login: ");
             login=sc.next();
            System.out.println("Enter your password: ");
             password=sc.next();
            System.out.println("Enter your password again: ");
             conPass=sc.next();
       }while(CheckValidPass(login,password,conPass)==false);
    }
    public static boolean CheckValidPass(String login, String password, String conPass){
        try {
            if (!login.matches("[a-zA-Z0-9!@#$%^&*()_+\\-=\\[\\]{};':\\\"\\\\|,.<>\\/?~`]+")) {
                throw new WrongLoginException("Invalid characters in login");
            }
            if (login.length() < 8) {
                throw new WrongLoginException("Login must be at least 8 characters long");
            }
            if (!password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Invalid characters in password");
            }
            if (password.length() < 8) {
                throw new WrongPasswordException("Password must be at least 8 characters long");
            }
            if (!password.equals(conPass)) {
                throw new WrongPasswordException("Passwords do not match");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Your login and password valid.");
        return true;
        }
}