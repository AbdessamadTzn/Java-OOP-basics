package Abstract;


public class SalariedEmployee extends Employee{
    private double bonus;
    private double deductions;

    public SalariedEmployee() {

    }
    // Rememeber it's a multilevel Inheritance!
    public SalariedEmployee(String name, String rank, double salary, double bonus, double deductions){
        super(name, rank, salary);
        this.bonus = bonus;
        this.deductions = deductions;
    }
    // Getters & Setters - remember we will have an overridding for the getsalry() mthod... Read the mustread.md!

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return this.deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

//For getting salary, rememebr it's an abstract method so we use the keyword override before setting it's body
@Override 
    public double getSalary() {
        return salary + bonus - deductions;
    }
    
    }

