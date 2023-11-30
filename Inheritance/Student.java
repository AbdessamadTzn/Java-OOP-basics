package Inheritance;

public class Student extends Person {
    private int study_level;
    private String speciality;
    private double GPA;

    public Student() {
    }

    public Student(String name, double age, String address, String nationality, int study_level, String speciality,
            double GPA) {
        super(name, age, address, nationality);
        this.study_level = study_level;
        this.speciality = speciality;
        this.GPA = GPA;
    }

    public int getStudy_level() {
        return this.study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }



}
