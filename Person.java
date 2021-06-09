public class Person {
    String firstName;
    String lastName;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String displayDetails(){
        return "Your name is: " + firstName + " " + lastName;
    }
}
