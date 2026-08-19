import java.util.Scanner;

public class login {

    Scanner sc = new Scanner(System.in);

    String username = "admin";
    String password = "1234";

    public boolean login() {

        System.out.println("=================================");
        System.out.println("    DAILY FARM MANAGEMENT");
        System.out.println("=================================");

        System.out.print("Enter Username : ");
        String user = sc.nextLine();

        System.out.print("Enter Password : ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful...");
            return true;

        } else {

            System.out.println("\nInvalid Username or Password...");
            return false;

        }
    }

    public static void main(String[] args) {

        login l = new login();

        if (l.login()) {

            dashboard d = new dashboard();
            d.menu();

        } else {

            System.out.println("Access Denied.");

        }

    }

}