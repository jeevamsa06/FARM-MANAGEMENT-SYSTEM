import java.util.Scanner;

public class expense {

    Scanner sc = new Scanner(System.in);

    int expenseId;
    String expenseType;
    double amount;
    String date;

    public void addExpense() {

        System.out.println("\n===== Add Expense =====");

        System.out.print("Enter Expense ID: ");
        expenseId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Expense Type: ");
        expenseType = sc.nextLine();

        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Date (DD/MM/YYYY): ");
        date = sc.nextLine();

        System.out.println("Expense Added Successfully!");
    }

    public void displayExpense() {

        System.out.println("\n===== Expense Details =====");
        System.out.println("Expense ID   : " + expenseId);
        System.out.println("Expense Type : " + expenseType);
        System.out.println("Amount       : " + amount);
        System.out.println("Date         : " + date);
    }

    public void updateExpense() {

        System.out.println("\n===== Update Expense =====");

        System.out.print("Enter New Expense Type: ");
        expenseType = sc.nextLine();

        System.out.print("Enter New Amount: ");
        amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter New Date: ");
        date = sc.nextLine();

        System.out.println("Expense Updated Successfully!");
    }

    public void deleteExpense() {

        expenseId = 0;
        expenseType = null;
        amount = 0;
        date = null;

        System.out.println("Expense Deleted Successfully!");
    }

    public void searchExpense(int id) {

        if (expenseId == id) {
            displayExpense();
        } else {
            System.out.println("Expense Not Found!");
        }
    }

    public void menu() {

        while (true) {

            System.out.println("\n========== Expense Management ==========");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Search Expense");
            System.out.println("4. Update Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Back");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addExpense();
                    break;

                case 2:
                    displayExpense();
                    break;

                case 3:
                    System.out.print("Enter Expense ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    searchExpense(id);
                    break;

                case 4:
                    updateExpense();
                    break;

                case 5:
                    deleteExpense();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
public static void main(String[] args) {
        expense expenseManagement = new expense();
        expenseManagement.menu();
    }
}