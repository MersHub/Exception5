import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            User();
        } catch (WrongUsernameException e) {
            System.out.println(e.getMessage());
        }

        try {
            Password();
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void User() throws WrongUsernameException{

        Scanner console = new Scanner(System.in);

        String username = console.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z_1-9]{5,15}");

        Matcher matcher = pattern.matcher(username);
        boolean b = matcher.matches();

        if (b == true)
            System.out.println("Username: " + matcher.matches());
        else
            throw new WrongUsernameException("WrongUsernameException");
    }

    public static void Password() throws WrongPasswordException {
        Scanner console = new Scanner(System.in);

        String password = console.nextLine();
        String confirmPassword = console.nextLine();

        Pattern pattern1 = Pattern.compile("[a-zA-Z1-9]{1,25}");

        Matcher matcher1 = pattern1.matcher(password);

        boolean b = matcher1.matches();

        if (b == true )
            System.out.println("Password : " + matcher1.matches());
        else
            throw new WrongPasswordException("WrongPasswordException");

        if((password.equals(confirmPassword)))
            System.out.println("Password: " + matcher1.matches());

        else {
            throw new WrongPasswordException("WrongPasswordException");
        }


    }
}
