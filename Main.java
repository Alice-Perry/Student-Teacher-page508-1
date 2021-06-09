import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> listOfPersons = getListOfPersons();
        printPersonDetails(listOfPersons);
    }

    // dit gedeelte maakt een lijst met personen
    public static ArrayList<Person> getListOfPersons() {
        ArrayList<Person> persons = new ArrayList<Person>();

        do {
            Person person = createNewPerson();
            persons.add(person);
        } while (wantsAnotherPerson());

        return persons;
    }
    // tot hier

    public static boolean wantsAnotherPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to add another person? ");
        String wantNewPerson = scanner.nextLine();

        if (wantNewPerson.equalsIgnoreCase("yes")) {
            return true;
        } else {
            System.out.println("Thank you for your input.\n");
            return false;
        }
    }

    public static Person createNewPerson() {

        Scanner scanner = new Scanner(System.in);
        String personType;
        do {
            System.out.println("Do you want to add a teacher or a student? ");
            personType = scanner.nextLine();
        } while (personType == "");

        if (personType.equalsIgnoreCase("student")) {
            Person newStudent = createNewStudent();
            return newStudent;
        } else {
            Person newTeacher = createNewTeacher();
            return newTeacher;
        }
    }

    public static Person createNewStudent() {
        Scanner scanner = new Scanner(System.in);

        String firstName = getFirstName(scanner);
        String lastName = getLastName(scanner);
        int studentId = getStudentID(scanner);
        String course = getCourse(scanner);
        String teacherName = getTeacherName(scanner);

        return new Student(firstName, lastName, studentId, course, teacherName);
    }

    public static Person createNewTeacher() {
        Scanner scanner = new Scanner(System.in);

        String firstName = getFirstName(scanner);
        String lastName = getLastName(scanner);
        int salary = getSalary(scanner);
        String courseName = getCourseName(scanner);

        return new Teacher(firstName, lastName, salary, courseName);
    }

    public static void printPersonDetails(ArrayList<Person> listOfPersons) {
        for (Person p : listOfPersons) {
            System.out.println(p.displayDetails());
            System.out.println("_________________________");
            System.out.println();
        }
    }

    // GETTERS
    public static String getFirstName(Scanner scanner) {
        String firstName;
        do {
            System.out.println("What is your first name? ");
            firstName = scanner.nextLine();
        } while (firstName == "");

        return firstName;
    }

    public static String getLastName(Scanner scanner) {
        String lastName;

        do {
            System.out.println("What is your last name? ");
            lastName = scanner.nextLine();
        } while (lastName == "");
        return lastName;
    }

    public static int getStudentID(Scanner scanner) {
        int studentID = 0;

        do {
            System.out.println("What is your student ID? ");
            studentID = scanner.nextInt();
        } while (studentID == 0);
        scanner.nextLine();
        return studentID;
    }

    public static String getCourse(Scanner scanner) {
        String course;
        do {
            System.out.println("What course are you in? ");
            course = scanner.nextLine();
        } while (course == "");
        return course;
    }

    public static String getTeacherName(Scanner scanner) {
        String teacherName;
        do {
            System.out.println("Who is teaching this class? ");
            teacherName = scanner.nextLine();
        } while (teacherName == "");
        return teacherName;
    }

    public static int getSalary(Scanner scanner) {
        int salary = 0;
        do {
            System.out.println("What is your salary? ");
            salary = scanner.nextInt();
        } while (salary == 0);
        scanner.nextLine();
        return salary;
    }

    public static String getCourseName(Scanner scanner) {
        String courseName;
        do {
            System.out.println("What class do you teach? ");
            courseName = scanner.nextLine();
        } while (courseName == "");
        return courseName;
    }
}
