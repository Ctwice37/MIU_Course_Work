package bookStorePackage;

public class Employee {
    private String firstName;
    private String lastName;
    private double empID;

    public Employee(String firstName, String lastName, double empID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empID = empID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getEmpID() {
        return empID;
    }
}
