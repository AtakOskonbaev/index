public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student();

        newStudent.displayInfo();
        newStudent.canApplyForScholarship();


        Student student1 = new Student();

        student1.name = "Atak";
        student1.studentID = 123;
        student1.major = "COMCEH";
        student1.gpa = 5.0f;

        student1.displayInfo();
        student1.canApplyForScholarship();


        Student student2 = new Student();

        student2.name = "Adil";
        student2.studentID = 123;
        student2.major = "COMFCI";
        student2.gpa = 2.5f;

        student2.displayInfo();
        student2.canApplyForScholarship();

    }
}