package org.example.model;

public class Manager extends Employee {
    // attributes: allowance: phu cap
    private double allowance;

    // constructor k tham so
    public Manager() {
    }

    // constructor co tham so
    public Manager(double allowance) {
        this.allowance = allowance;
    }

    public Manager(String empId, String fullName, int yearsOfService, double salary, String department, double allowance) {
        super(empId, fullName, yearsOfService, salary, department);
        this.allowance = allowance;
    }
    // getter va setter

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double calculateBasicSalary() {
        return super.getSalary() * 0.95 + allowance;
    }

    @Override
    public double calculateBonusSalary(double bonus) {
        return calculateBasicSalary() + 0.2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Allowance: " + allowance);
        super.displayInfo();
    }
}
