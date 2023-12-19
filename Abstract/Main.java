package Abstract;


public  class Main {
    public static void main(String[] args) {
        //If e try to instantiate the employee class we get an error, it's an abstract class
        // Employee e1 = new Employee(); 
        SalariedEmployee salariedEmp = new SalariedEmployee();
        salariedEmp.setSalary(45.8);
        salariedEmp.setBonus(78);
        salariedEmp.setDeductions(10);
        System.out.println("The salaried employee's salary is: " + salariedEmp.getSalary());

        HourlyEmployee HourlyEmp = new HourlyEmployee();
        HourlyEmp.setWorking_hours(45.8);
        HourlyEmp.setHour_rate(60);
        System.out.println("The hourly employee's salary is: " + HourlyEmp.getSalary());
        

    }
}
