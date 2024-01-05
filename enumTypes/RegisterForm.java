package enumTypes;

//@author: Abdessamad Touzani
enum Gender {
    Male, Female
};

enum Course {
    UML, Python, dataVisualization
};

enum Semester {
    Fall, Spring
};

public class RegisterForm {
    String studentName;
    Gender studentGender;
    Course courseName;
    Semester semester;

    public RegisterForm() {
        studentName = "Abdessamad";
        studentGender = Gender.Male;
        courseName = Course.Python;
        semester = Semester.Spring;
    }


}
