package oops;



import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        while(true) {
            System.out.println("\n===== COMPANY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Add Intern");
            System.out.println("4. View IT Department Employees");
            System.out.println("5. View HR Department Employees");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter ID: "); int id1 = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String name1 = sc.nextLine();
                    System.out.print("Department (IT/HR): "); String dept1 = sc.nextLine();
                    System.out.print("Salary: "); double salary = sc.nextDouble();
                    System.out.print("Bonus: "); double bonus = sc.nextDouble(); sc.nextLine();

                    FullTimeEmployee fte = new FullTimeEmployee(id1, name1, dept1, salary, bonus);
                    if(dept1.equalsIgnoreCase("IT")) itDept.addEmployee(fte);
                    else hrDept.addEmployee(fte);
                    System.out.println("Full-Time Employee added!");
                    break;

                case 2:
                    System.out.print("Enter ID: "); int id2 = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String name2 = sc.nextLine();
                    System.out.print("Department (IT/HR): "); String dept2 = sc.nextLine();
                    System.out.print("Hourly Rate: "); double rate = sc.nextDouble();
                    System.out.print("Hours Worked: "); int hours = sc.nextInt(); sc.nextLine();

                    PartTimeEmployee pte = new PartTimeEmployee(id2, name2, dept2, rate, hours);
                    if(dept2.equalsIgnoreCase("IT")) itDept.addEmployee(pte);
                    else hrDept.addEmployee(pte);
                    System.out.println("Part-Time Employee added!");
                    break;

                case 3:
                    System.out.print("Enter ID: "); int id3 = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String name3 = sc.nextLine();
                    System.out.print("Department (IT/HR): "); String dept3 = sc.nextLine();
                    System.out.print("Stipend: "); double stipend = sc.nextDouble();
                    System.out.print("Duration (months): "); int duration = sc.nextInt(); sc.nextLine();

                    Intern intern = new Intern(id3, name3, dept3, stipend, duration);
                    if(dept3.equalsIgnoreCase("IT")) itDept.addEmployee(intern);
                    else hrDept.addEmployee(intern);
                    System.out.println("Intern added!");
                    break;

                case 4:
                    itDept.showAllEmployees();
                    break;

                case 5:
                    hrDept.showAllEmployees();
                    break;

                case 6:
                    System.out.println("Exiting system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
