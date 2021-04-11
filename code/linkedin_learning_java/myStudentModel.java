public class myStudentModel {

    String firstName;
    String lastName;
    double studentGPA;
    int expectedGraduationYear;
    String studentMajor;
    
    public myStudentModel(String firstName,
    String lastName, double studentGPA,
    int expectedGraduationYear,
    String studentMajor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentGPA = studentGPA;
    this.expectedGraduationYear = expectedGraduationYear;
    this.studentMajor = studentMajor;
    }

    public int incrementYear() {
        return this.expectedGraduationYear + 1;
    }

}
