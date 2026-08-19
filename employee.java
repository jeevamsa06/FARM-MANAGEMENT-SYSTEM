import java.util.Scanner;
public class employee {
    int employeeId;
    String name;
    int age;
    String gender;
    String phone;
    String address;
    String workType;
    double salary;
    String joiningDate;
    Scanner sc=new Scanner(System.in);

void addEmployee(int employeeId, String name, int age, String gender, String phone, String address, String workType, double salary, String joiningDate) {
    this.employeeId = sc.nextInt();
    sc.nextLine();
    this.name = sc.nextLine();
    this.age = sc.nextInt();
    this.gender = sc.nextLine();
    this.phone = sc.nextLine();
    this.address = sc.nextLine();
    this.workType = sc.nextLine();
    this.salary = sc.nextDouble();
    this.joiningDate = sc.nextLine();
}
void updateEmployee(int employeeId, String name, int age, String gender, String phone, String address, String workType, double salary, String joiningDate) {
   System.out.println("Enter new employee details:");
   this.employeeId = sc.nextInt();
   System.out.print("Enter employee name: ");
   this.name = sc.nextLine();
    System.out.print("Enter employee age: ");        
    this.age = sc.nextInt();
    System.out.print("Enter employee gender: ");
    this.gender = sc.nextLine();
    System.out.print("Enter employee phone: ");
    this.phone = sc.nextLine();
    System.out.print("Enter employee address: ");
    this.address = sc.nextLine();
    System.out.print("Enter employee work type: ");
    this.workType = sc.nextLine();
    System.out.print("Enter employee salary: ");
    this.salary = sc.nextDouble();
    System.out.print("Enter employee joining date: ");
    this.joiningDate = sc.nextLine();
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Age: " + age);
    System.out.println("Employee Gender: " + gender);
    System.out.println("Employee Phone: " + phone);
    System.out.println("Employee Address: " + address);
    System.out.println("Employee Work Type: " + workType);
    System.out.println("Employee Salary: " + salary);
    System.out.println("Employee Joining Date: " + joiningDate);
}
void displayEmployeeDetails(String name, int age, String gender, String phone, String address, String workType, double salary, String joiningDate) {
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Age: " + age);
    System.out.println("Employee Gender: " + gender);
    System.out.println("Employee Phone: " + phone);
    System.out.println("Employee Address: " + address);
    System.out.println("Employee Work Type: " + workType);
    System.out.println("Employee Salary: " + salary);
    System.out.println("Employee Joining Date: " + joiningDate);
}
void deleteEmployee() {
    employeeId = 0;
    name = null;
    age = 0;
    gender = null;
    phone = null;
    address = null;
    workType = null;
    salary = 0.0;
    joiningDate = null;
}
void searchEmployee(int employeeId) {
    if (this.employeeId == employeeId) {
        displayEmployeeDetails(name, age, gender, phone, address, workType, salary, joiningDate);
    } else {
        System.out.println("Employee not found.");
    }
}
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();
    employee[] employees = new employee[n];
    int count = 0;
    do {
        System.out.println("Enter your choice: add, view, search, update, delete, exit");
        String user = sc.nextLine();
        boolean found = false;
        switch (user) {
            case "add":
                if (count >= employees.length) {
                    System.out.println("No space available for more employees.");
                    break;
                }
                employees[count] = new employee();
                employees[count].addEmployee(0, null, 0, null, null, null, null, 0.0, null);
                count++;
                break;
            case "view":
                if (count == 0) {
                    System.out.println("No employees to display.");
                    break;
                }
                for (int i = 0; i < count; i++) {
                    employees[i].displayEmployeeDetails(employees[i].name, employees[i].age, employees[i].gender, employees[i].phone, employees[i].address, employees[i].workType, employees[i].salary, employees[i].joiningDate);
                }
                break;
            case "search":
                System.out.print("Enter Employee ID to search: ");
                int searchId = sc.nextInt();
                for (int i = 0; i < count; i++) {
                    if (employees[i].employeeId == searchId) {
                        employees[i].displayEmployeeDetails(employees[i].name, employees[i].age, employees[i].gender, employees[i].phone, employees[i].address, employees[i].workType, employees[i].salary, employees[i].joiningDate);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found.");
                }
                break;
            case "update":
                System.out.print("Enter Employee ID to update: ");
                int updateId = sc.nextInt();
                for (int i = 0; i < count; i++) {
                    if (employees[i].employeeId == updateId) {
                        employees[i].updateEmployee(updateId, null, 0, null, null, null, null, 0.0, null);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found.");
                }
                break;
            case "delete":
                System.out.print("Enter Employee ID to delete: ");
                int deleteId = sc.nextInt();
                for (int i = 0; i < count; i++) {
                    if (employees[i].employeeId == deleteId) {
                        employees[i].deleteEmployee();
                        found = true;
                        System.out.println("Employee deleted.");
                        for (int j = i; j < count - 1; j++) {
                            employees[j] = employees[j + 1];
                        }
                        count--;
                        break;
                    }
                }   
            if (!found) {
                    System.out.println("Employee not found.");
                }
                break;
            case "exit":
                System.out.println("Exiting the program.");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    } while(true);

}
    
}