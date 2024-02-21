package org.example.model;

public class Worker extends Employee {
    // attributes: shift: loai ca
    private String shift;

    // constructor k tham so
    public Worker() {
    }

    // constructor co tham so
    public Worker(String shift) {
        this.shift = shift;
    }

    public Worker(String empId, String fullName, int yearsOfService, double salary, String department, String shift) {
        super(empId, fullName, yearsOfService, salary, department);
        this.shift = shift;
    }
    // getter va setter

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shift: " + shift);
        super.displayInfo();
    }
}
