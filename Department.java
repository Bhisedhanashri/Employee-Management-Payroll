package oops;



import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { if(!name.isEmpty()) this.name = name; }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showAllEmployees() {
        System.out.println("\n--- Department: " + name + " ---");
        for (Employee e : employees) {
            e.displayInfo(); // Polymorphism
            System.out.println("-------------------");
        }
    }
}

