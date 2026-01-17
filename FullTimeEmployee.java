package oops;


public class FullTimeEmployee extends Employee {
    private double salary;
    private double bonus;

    public FullTimeEmployee(int id, String name, String department, double salary, double bonus) {
        super(id, name, department);
        setSalary(salary);
        setBonus(bonus);
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { if (salary >= 0) this.salary = salary; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { if (bonus >= 0) this.bonus = bonus; }

    @Override
    public double calculateSalary() {
        return salary + bonus; // Polymorphism
    }

    @Override
    public void displayInfo() {
        System.out.println("Full-Time Employee: " + getName() + " | Dept: " + getDepartment() +
                           " | Base: $" + salary + " | Bonus: $" + bonus +
                           " | Total Salary: $" + calculateSalary());
    }
}

