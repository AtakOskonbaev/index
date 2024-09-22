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

    public void canApplyForScholarship()
    {
        if (this.gpa >= 3.5f)
        {
            System.out.println("Can apply for scholarship");
        }
        else
        {
            System.out.println("Cannot apply for scholarship");
        }
    }
}
