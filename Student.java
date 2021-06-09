public class Student extends Person {
    int studentID;
    String course;
    String teacherName;

    public Student (String firstName, String lastName, int studentID, String course, String teacherName) {
        super(firstName, lastName);

        this.studentID = studentID;
        this.course = course;
        this.teacherName = teacherName;
    }

    public String displayDetails(){
        return
            "\nSTUDENT\n" +
            "Name: " + firstName + " " + lastName + ".\n" +
            "Student ID: " + studentID + ".\n" +
            "Course: " + course + ".\n" +
            "Teacher: " + teacherName + ".";
    }
}
