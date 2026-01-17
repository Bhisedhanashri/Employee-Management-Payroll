package oops;



public abstract class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters → Encapsulation
    public int getId() { return id; }
    public void setId(int id) { if (id > 0) this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { if (!name.isEmpty()) this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { if (!department.isEmpty()) this.department = department; }

    // Abstract method → Abstraction + Polymorphism
    public abstract double calculateSalary();

    public abstract void displayInfo();
}
