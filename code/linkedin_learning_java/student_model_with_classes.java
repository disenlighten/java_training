public class student_model_with_classes {

    public static void main(String[] args) {
    
    myStudentModel student1 = new myStudentModel("Pagoda", "Lawrence", 3.25, 2024, "Animal Photography");
    myStudentModel student2 = new myStudentModel("Rafiki", "Londray", 4.00, 2023, "Surveillance Science");
    
    System.out.println(student1.firstName);

    student2.expectedGraduationYear = student2.incrementYear();

    System.out.println("STUDENT REPORT");
    System.out.println("Name: " + student1.firstName + " " + student1.lastName);
    System.out.println("GPA: " + student1.studentGPA);
    System.out.println("Expected Graduation Year: " + student1.expectedGraduationYear);
    System.out.println("Major:  " + student1.studentMajor);
    System.out.println("Name: " + student2.firstName + " " + student2.lastName);
    System.out.println("GPA: " + student2.studentGPA);
    System.out.println("Expected Graduation Year: " + student2.expectedGraduationYear);
    System.out.println("Major:  " + student2.studentMajor);

    }


}
