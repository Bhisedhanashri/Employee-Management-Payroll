package oops;



public class Intern extends Employee {
    private double stipend;
    private int durationMonths;

    public Intern(int id, String name, String department, double stipend, int durationMonths) {
        super(id, name, department);
        setStipend(stipend);
        setDurationMonths(durationMonths);
    }

    public double getStipend() { return stipend; }
    public void setStipend(double stipend) { if(stipend>=0) this.stipend=stipend; }

    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { if(durationMonths>0) this.durationMonths=durationMonths; }

    @Override
    public double calculateSalary() {
        return stipend; // Polymorphism
    }

    @Override
    public void displayInfo() {
        System.out.println("Intern: " + getName() + " | Dept: " + getDepartment() +
                           " | Stipend: $" + stipend + " | Duration: " + durationMonths + " months");
    }
}
