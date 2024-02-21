package org.example.model;

public class Employee {
    // attributes: empId,fullName,yearsOfService,salary,department
    private String empId;
    private String fullName;
    private int yearsOfService;
    private double salary;
    private String department;

    // constructor k tham so
    public Employee() {
    }

    // constructor co tham so
    public Employee(String empId, String fullName, int yearsOfService, double salary, String department) {
        this.empId = empId;
        this.fullName = fullName;
        this.yearsOfService = yearsOfService;
        this.salary = salary;
        this.department = department;
    }

    // getter va setter
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // calculateBasicSalary(): calculateBasicSalary = salary * 0.95,
    public double calculateBasicSalary() {
        return salary * 0.95;
    }

    // Viết phương thức calculateBonusSalary(double bonus) để tính lương nhân viên cộng thêm khoảng phụ cấp.
    public double calculateBonusSalary(double bonus) {
        return salary + bonus;
    }


    // void displayInfo
    public void displayInfo() {
        System.out.println("empId: " + empId);
        System.out.println("fullName: " + fullName);
        System.out.println("yearsOfService: " + yearsOfService);
        System.out.println("salary: " + salary);
        System.out.println("department: " + department);
    }
}
