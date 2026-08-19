import java.util.Scanner;

public class dashboard {

    Scanner sc = new Scanner(System.in);

    employee Employee = new employee();
    animal Animal = new animal();
    feed Feed = new feed();
    milk Milk = new milk();
    income Income = new income();
    expense Expense = new expense();
    report Report = new report();

    public void menu() {

        while (true) {

            System.out.println("\n===================================");
            System.out.println("   DAILY FARM MANAGEMENT SYSTEM");
            System.out.println("===================================");
            System.out.println("1. Animal Management");
            System.out.println("2. Employee Management");
            System.out.println("3. Feed Management");
            System.out.println("4. Milk Management");
            System.out.println("5. Income Management");
            System.out.println("6. Expense Management");
            System.out.println("7. Reports");
            System.out.println("8. Exit");
            System.out.println("===================================");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Opening Animal Management...");
                    Animal.menu();
                    break;

                case 2:
                    System.out.println("Opening Employee Management...");
                    //Employee. displayEmployeeDetails();
                    break;

                case 3:
                    System.out.println("Opening Feed Management...");
                    Feed.menu();
                    break;

                case 4:
                    System.out.println("Opening Milk Management...");
                    Milk.menu();
                    break;

                case 5:
                    System.out.println("Opening Income Management...");
                    Income.menu();
                    break;

                case 6:
                    System.out.println("Opening Expense Management...");
                    Expense.menu();
                    break;

                case 7:
                    System.out.println("Opening Reports...");
                    Report.menu();
                    break;

                case 8:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice...");
            }

        }

    }

    public static void main(String[] args) {

        dashboard d = new dashboard();

        d.menu();

    }

}