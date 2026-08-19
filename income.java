import java.util.Scanner;

public class income {

    Scanner sc = new Scanner(System.in);

    int incomeId;
    String incomeSource;
    double amount;
    String date;

    // Add Income
    public void addIncome() {

        System.out.println("\n===== Add Income =====");

        System.out.print("Enter Income ID: ");
        incomeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Income Source: ");
        incomeSource = sc.nextLine();

        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Date (DD/MM/YYYY): ");
        date = sc.nextLine();

        System.out.println("Income Added Successfully!");
    }

    // Display Income
    public void displayIncome() {

        System.out.println("\n===== Income Details =====");
        System.out.println("Income ID     : " + incomeId);
        System.out.println("Income Source : " + incomeSource);
        System.out.println("Amount        : " + amount);
        System.out.println("Date          : " + date);
    }

    // Search Income
    public void searchIncome(int id) {

        if (incomeId == id) {
            displayIncome();
        } else {
            System.out.println("Income Not Found!");
        }
    }

    // Update Income
    public void updateIncome() {

        System.out.println("\n===== Update Income =====");

        System.out.print("Enter New Income Source: ");
        incomeSource = sc.nextLine();

        System.out.print("Enter New Amount: ");
        amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter New Date: ");
        date = sc.nextLine();

        System.out.println("Income Updated Successfully!");
    }

    // Delete Income
    public void deleteIncome() {

        incomeId = 0;
        incomeSource = null;
        amount = 0;
        date = null;

        System.out.println("Income Deleted Successfully!");
    }

    // Menu
    public void menu() {

        while (true) {

            System.out.println("\n========== Income Management ==========");
            System.out.println("1. Add Income");
            System.out.println("2. View Income");
            System.out.println("3. Search Income");
            System.out.println("4. Update Income");
            System.out.println("5. Delete Income");
            System.out.println("6. Back");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addIncome();
                    break;

                case 2:
                    displayIncome();
                    break;

                case 3:
                    System.out.print("Enter Income ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    searchIncome(id);
                    break;

                case 4:
                    updateIncome();
                    break;

                case 5:
                    deleteIncome();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
public static void main(String[] args) {
        income incomeManagement = new income();
        incomeManagement.menu();
    }
}