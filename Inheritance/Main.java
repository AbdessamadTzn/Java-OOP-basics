package Inheritance;

public  class Main {
    public static void main (String[] args) {

        Student student1 = new Student("Abdessamaad", 21, "Fez", "Moroccan", 4, "Software Engineering", 4);
        System.out.println("========================================");
        System.out.println("Student: "+student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Nationality: " + student1.getNationality());
        System.out.println("Address: "+student1.getAddress());
        System.out.println("Study Level: " + student1.getStudy_level());
        System.out.println("Speciality: " + student1.getSpeciality());
        System.out.println("GPA: " + student1.getGPA());
        //TODO: Overriding
        

    }
}
