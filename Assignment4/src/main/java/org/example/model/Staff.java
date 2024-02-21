package org.example.model;

public class Staff extends Employee {
    // attributes: position: vi tri lam viec
    private String position;

    // constructor k tham so
    public Staff() {
    }

    // constructor co tham so
    public Staff(String position) {
        this.position = position;
    }

    public Staff(String empId, String fullName, int yearsOfService, double salary, String department, String position) {
        super(empId, fullName, yearsOfService, salary, department);
        this.position = position;
    }
    // getter va setter

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Position: " + position);
        super.displayInfo();
    }
}
