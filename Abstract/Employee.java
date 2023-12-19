package Abstract;

public abstract class Employee {
    private String name;
    private String rank;
    protected double salary; //So subclass can access it

    public Employee() {

    }

    public Employee(String name, String rank, double salary){
        this.name = name;
        this.rank = rank;
        this.salary = salary;
    }

    // Getters & Setters


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /*for all previous methods, we don't actually need to change anything in sub-classes for them, 
    but for salary it's calculated based on the employee type; So we need to force them to change the body,
    for calculating the salary, to do so, we use the Abstract concept, and pay attention the class should be abstract!
    */
    public abstract double getSalary(); //Just set the method's prototype, and it's for 'em to set the body as needed

    

}
