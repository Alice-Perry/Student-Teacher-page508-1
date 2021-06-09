public class Teacher extends Person{
    int salary;
    String courseName;

    public Teacher (String firstName, String lastName, int salary, String courseName) {
        super(firstName, lastName);
        this.salary = salary;
        this.courseName = courseName;
    }

    public String displayDetails(){
        return
            "\nTEACHER\n" +
            "Name: " + firstName + " " + lastName + ".\n" +
            "Salary: E" + salary + ".\n" + 
            "tTeaches the course: " + courseName + ".";
    }
}
