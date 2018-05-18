package ok.lesson12;


public class User {

    private String firstName;
    private String lastName;
    private int salary;

    /**
     *
     * @param firstName
     * @param lastName
     * @param salary
     */
    public User(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }


    //    @Override
//    public int compareTo(User o) {
//        return this.lastName.compareTo(o.lastName);
//    }
}
