import java.util.Scanner;

public class report {

    Scanner sc = new Scanner(System.in);

    public void dailyMilkReport() {

        System.out.println("\n========== Daily Milk Report ==========");
        System.out.println("Milk records will be displayed here.");
    }

    public void animalReport() {

        System.out.println("\n========== Animal Report ==========");
        System.out.println("Animal details will be displayed here.");
    }

    public void employeeReport() {

        System.out.println("\n========== Employee Report ==========");
        System.out.println("Employee details will be displayed here.");
    }

    public void feedReport() {

        System.out.println("\n========== Feed Report ==========");
        System.out.println("Feed details will be displayed here.");
    }

    public void incomeReport() {

        System.out.println("\n========== Income Report ==========");
        System.out.println("Income details will be displayed here.");
    }

    public void expenseReport() {

        System.out.println("\n========== Expense Report ==========");
        System.out.println("Expense details will be displayed here.");
    }

    public void profitReport() {

        System.out.println("\n========== Profit Report ==========");
        System.out.println("Profit = Income - Expense");
    }

    public void menu() {

        while (true) {

            System.out.println("\n========== REPORT MENU ==========");
            System.out.println("1. Daily Milk Report");
            System.out.println("2. Animal Report");
            System.out.println("3. Employee Report");
            System.out.println("4. Feed Report");
            System.out.println("5. Income Report");
            System.out.println("6. Expense Report");
            System.out.println("7. Profit Report");
            System.out.println("8. Back");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    dailyMilkReport();
                    break;

                case 2:
                    animalReport();
                    break;

                case 3:
                    employeeReport();
                    break;

                case 4:
                    feedReport();
                    break;

                case 5:
                    incomeReport();
                    break;

                case 6:
                    expenseReport();
                    break;

                case 7:
                    profitReport();
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
public static void main(String[] args) {
        report reportManagement = new report();
        reportManagement.menu();
    }
}