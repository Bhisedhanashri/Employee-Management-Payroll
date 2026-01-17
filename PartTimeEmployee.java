package oops;


public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, String department, double hourlyRate, int hoursWorked) {
        super(id, name, department);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { if(hourlyRate>=0) this.hourlyRate=hourlyRate; }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) { if(hoursWorked>=0) this.hoursWorked=hoursWorked; }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Polymorphism
    }

    @Override
    public void displayInfo() {
        System.out.println("Part-Time Employee: " + getName() + " | Dept: " + getDepartment() +
                           " | Hourly Rate: $" + hourlyRate + " | Hours: " + hoursWorked +
                           " | Total Salary: $" + calculateSalary());
    }
}
