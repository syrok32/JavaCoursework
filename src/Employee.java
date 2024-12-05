public class Employee {
    public static int countId = 1;
    private int id;
    private int departments;
    private double salary;
    private String firstName;
    private String secondName;
    private String lastName;


    public Employee(int departments, int salary, String firstName, String secondName, String lastName) {

        id = countId++;
        this.departments = departments;
        this.salary = salary;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return departments;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", departments=" + departments +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
