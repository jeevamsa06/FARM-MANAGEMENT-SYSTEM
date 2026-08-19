import java.util.Scanner;

public class feed {

    Scanner sc = new Scanner(System.in);

    int feedId;
    String feedName;
    double quantity;
    double price;
    String date;

    // Add Feed
    public void addFeed() {

        System.out.println("\n===== Add Feed =====");

        System.out.print("Enter Feed ID: ");
        feedId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Feed Name: ");
        feedName = sc.nextLine();

        System.out.print("Enter Quantity (kg): ");
        quantity = sc.nextDouble();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Date (DD/MM/YYYY): ");
        date = sc.nextLine();

        System.out.println("Feed Added Successfully!");
    }

    // Display Feed
    public void displayFeed() {

        System.out.println("\n===== Feed Details =====");
        System.out.println("Feed ID       : " + feedId);
        System.out.println("Feed Name     : " + feedName);
        System.out.println("Quantity      : " + quantity + " kg");
        System.out.println("Price         : " + price);
        System.out.println("Date          : " + date);
    }

    // Search Feed
    public void searchFeed(int id) {

        if (feedId == id) {
            displayFeed();
        } else {
            System.out.println("Feed Not Found!");
        }
    }

    // Update Feed
    public void updateFeed() {

        System.out.println("\n===== Update Feed =====");

        System.out.print("Enter New Feed Name: ");
        feedName = sc.nextLine();

        System.out.print("Enter New Quantity: ");
        quantity = sc.nextDouble();

        System.out.print("Enter New Price: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter New Date: ");
        date = sc.nextLine();

        System.out.println("Feed Updated Successfully!");
    }

    // Delete Feed
    public void deleteFeed() {

        feedId = 0;
        feedName = null;
        quantity = 0;
        price = 0;
        date = null;

        System.out.println("Feed Deleted Successfully!");
    }

    // Feed Menu
    public void menu() {

        while (true) {

            System.out.println("\n========== Feed Management ==========");
            System.out.println("1. Add Feed");
            System.out.println("2. View Feed");
            System.out.println("3. Search Feed");
            System.out.println("4. Update Feed");
            System.out.println("5. Delete Feed");
            System.out.println("6. Back");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addFeed();
                    break;

                case 2:
                    displayFeed();
                    break;

                case 3:
                    System.out.print("Enter Feed ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    searchFeed(id);
                    break;

                case 4:
                    updateFeed();
                    break;

                case 5:
                    deleteFeed();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
public static void main(String[] args) {
        feed feedManagement = new feed();
        feedManagement.menu();
    }
}