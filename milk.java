import java.util.Scanner;

public class milk {

    Scanner sc = new Scanner(System.in);

    int milkId;
    int animalId;
    String animalName;
    double morningMilk;
    double eveningMilk;
    double totalMilk;
    String date;

    // Add Milk Record
    public void addMilk() {

        System.out.println("\n===== Add Milk Record =====");

        System.out.print("Enter Milk ID: ");
        milkId = sc.nextInt();

        System.out.print("Enter Animal ID: ");
        animalId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Animal Name: ");
        animalName = sc.nextLine();

        System.out.print("Enter Morning Milk (Litres): ");
        morningMilk = sc.nextDouble();

        System.out.print("Enter Evening Milk (Litres): ");
        eveningMilk = sc.nextDouble();
        sc.nextLine();

        totalMilk = morningMilk + eveningMilk;

        System.out.print("Enter Date (DD/MM/YYYY): ");
        date = sc.nextLine();

        System.out.println("Milk Record Added Successfully!");
    }

    // Display Milk Record
    public void displayMilk() {

        System.out.println("\n===== Milk Details =====");
        System.out.println("Milk ID        : " + milkId);
        System.out.println("Animal ID      : " + animalId);
        System.out.println("Animal Name    : " + animalName);
        System.out.println("Morning Milk   : " + morningMilk + " L");
        System.out.println("Evening Milk   : " + eveningMilk + " L");
        System.out.println("Total Milk     : " + totalMilk + " L");
        System.out.println("Date           : " + date);
    }

    // Search Milk Record
    public void searchMilk(int id) {

        if (milkId == id) {
            displayMilk();
        } else {
            System.out.println("Milk Record Not Found!");
        }
    }

    // Update Milk Record
    public void updateMilk() {

        System.out.println("\n===== Update Milk Record =====");

        System.out.print("Enter New Morning Milk: ");
        morningMilk = sc.nextDouble();

        System.out.print("Enter New Evening Milk: ");
        eveningMilk = sc.nextDouble();
        sc.nextLine();

        totalMilk = morningMilk + eveningMilk;

        System.out.print("Enter New Date: ");
        date = sc.nextLine();

        System.out.println("Milk Record Updated Successfully!");
    }

    // Delete Milk Record
    public void deleteMilk() {

        milkId = 0;
        animalId = 0;
        animalName = null;
        morningMilk = 0;
        eveningMilk = 0;
        totalMilk = 0;
        date = null;

        System.out.println("Milk Record Deleted Successfully!");
    }

    // Milk Menu
    public void menu() {

        while (true) {

            System.out.println("\n========== Milk Management ==========");
            System.out.println("1. Add Milk Record");
            System.out.println("2. View Milk Record");
            System.out.println("3. Search Milk Record");
            System.out.println("4. Update Milk Record");
            System.out.println("5. Delete Milk Record");
            System.out.println("6. Back");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addMilk();
                    break;

                case 2:
                    displayMilk();
                    break;

                case 3:
                    System.out.print("Enter Milk ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    searchMilk(id);
                    break;

                case 4:
                    updateMilk();
                    break;

                case 5:
                    deleteMilk();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
public static void main(String[] args) {
        milk milkManagement = new milk();
        milkManagement.menu();
    }
}