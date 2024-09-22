public class Student {

    public String name;
    public int studentID;
    public String major;
    public float gpa;

    public Student(String name, int studentID, String major, float gpa) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.gpa = gpa;
    }

    public Student() {
        this.name = "";
        this.studentID = 0;
        this.major = "";
        this.gpa = 0.0f;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}
