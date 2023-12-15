package Inheritance;

public class HourlyEmployee extends Employee {
    private double working_hours;
    private double hour_rate;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, double age, String address, String nationality, double salary,
            double working_hours, double hour_rate) {
        super(name, age, address, nationality, salary);
        this.working_hours = working_hours;
        this.hour_rate = hour_rate;

    }
    // Getters & Setters

    public double getWorking_hours() {
        return this.working_hours;
    }

    public void setWorking_hours(double working_hours) {
        this.working_hours = working_hours;
    }

    public double getHour_rate() {
        return this.hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }
@Override
public double getSalary() {
    return working_hours * hour_rate;
    }
}
