### README: `Student` Class

The `Student` class is designed to represent information about a student including their name, student ID, major, and GPA. It provides methods to display this information and determine scholarship eligibility based on GPA.

#### Class Structure

The `Student` class has the following attributes:

- `name` (String): Represents the name of the student.
- `studentID` (int): Represents the unique identifier for the student.
- `major` (String): Represents the student's major.
- `gpa` (float): Represents the student's Grade Point Average.

#### Constructors

1. **Parameterized Constructor**:
   ```java
   public Student(String name, int studentID, String major, float gpa)
   ```
   Initializes a `Student` object with provided values for `name`, `studentID`, `major`, and `gpa`.

2. **Default Constructor**:
   ```java
   public Student()
   ```
   Initializes a `Student` object with default values:
   - `name` is set to an empty string `""`.
   - `studentID` is set to `0`.
   - `major` is set to an empty string `""`.
   - `gpa` is set to `0.0`.

#### Methods

1. **`displayInfo()` Method**:
   ```java
   public void displayInfo()
   ```
   Prints out the details of the student:
   - Name
   - Student ID
   - Major
   - GPA

2. **`canApplyForScholarship()` Method**:
   ```java
   public void canApplyForScholarship()
   ```
   Checks if the student's GPA is 3.5 or higher and prints whether they can apply for a scholarship or not.
