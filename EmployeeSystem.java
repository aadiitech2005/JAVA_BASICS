// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class EmployeeSystem {

    Scanner sc = new Scanner(System.in);

    int Eid, age, salary;
    String gender = "", Name = "", Department = "";
    boolean isEmployee = false;
    void search()
    {
         if (isEmployee == false) {

            System.out.println("First Add Employee Details Then View");
         }
         else
         {
            int newID;
            System.out.println("Enter your Emplyee ID:");
            newID=sc.nextInt();
             if (Eid == newID) {
                view();
             }
             else{
            System.out.println("Employee not found :");
             }
         }
    }
    void UpdateEmployee()
    {
         if (isEmployee == false) {
            System.out.println("First Add Employee Details Then View");
         }
         else
         {
            int newID;
            System.out.println("Enter your Emplyee ID:");
            newID=sc.nextInt();
            if (Eid == newID) 
            {
                  System.out.println("Add Employee Id");
        Eid = sc.nextInt();

        System.out.println("Add Employee Salary");
        salary = sc.nextInt();

        System.out.println("Add Employee Name");
        sc.nextLine();
        Name = sc.nextLine();

        System.out.println("Add Employee Age");
        age = sc.nextInt();

        sc.nextLine();

        System.out.println("Add Employee Gender");
        gender = sc.nextLine();

        System.out.println("Add Employee Department");
        Department = sc.nextLine();
            }

         }
    }
    void view() {
        if (isEmployee == false) {
            System.out.println("First Add Employee Details Then View");
        } else {
            int newID;

            System.out.println("Enter your Employee id:");
            newID = sc.nextInt();

            if (Eid == newID) {
                System.out.println("Employee ID: " + Eid);
            
                System.out.println("Name: " + Name);
                System.out.println("Age: " + age);
                System.out.println("Salary: " + salary);
                System.out.println("Gender: " + gender);
                System.out.println("Department: " + Department);
            } else {
                System.out.println("Employee not Found");
            }
        }
    }

    void addemp() {
        System.out.println("Add Employee Details");

        System.out.println("Add Employee Id");
        Eid = sc.nextInt();

        System.out.println("Add Employee Salary");
        salary = sc.nextInt();

        System.out.println("Add Employee Name");
        sc.nextLine();
        Name = sc.nextLine();

        System.out.println("Add Employee Age");
        age = sc.nextInt();

        sc.nextLine();

        System.out.println("Add Employee Gender");
        gender = sc.nextLine();

        System.out.println("Add Employee Department");
        Department = sc.nextLine();

        isEmployee = true;
    }
    void delete()
    {
     if (isEmployee == false) {
            System.out.println("First Add Employee Details Then View");
        }
        else{
        int newID;

            System.out.println("Enter your Employee id:");
            newID = sc.nextInt();

            if (Eid == newID) 
            {
                Name="";
                  Eid =0;
               gender = "";
               Name = "";
               Department = "";
            
            System.out.println("Employee Deleted Sucessfully");
            }
            else
            {
                System.out.println("Employee not found");
            }
        }   
    }

    void mainMenu() {
        System.out.println("\nEmployee Management");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employees");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {

        EmployeeSystem obj = new EmployeeSystem();

        int choice;

        do {
            obj.mainMenu();

            System.out.println("Enter your choice:");
            choice = obj.sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addemp();
                    break;

                case 2:
                    obj.view();
                    break;
                case 3:
                    obj.UpdateEmployee();
                    break;
                case 4:
                    obj.delete();

                case 5:
                    System.out.println("Exit.......");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 6);
    }
}