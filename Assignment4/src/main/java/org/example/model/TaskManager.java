package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    // Viết phương thức displayTotalHoursWorked(Employee employee)
    // tao list de quan ly task
    public List<Task> tasks = new ArrayList<>();

    // construtor k tham so
    public TaskManager() {
    }

    // constructor co tham so
    public TaskManager(List<Task> tasks) {
        this.tasks = tasks;
    }

    // Viết phương thức displayTotalHoursWorked(Employee employee)
    public void displayTotalHoursWorked(Employee employee) {
        // dung vong lap for-each de xuat Task
        int totalHours = 0;
        for (Task task : tasks) {
            // dung vong lap if de check
            if (task.getEmployee().getEmpId() == employee.getEmpId()) {
                totalHours = totalHours + task.getHours();
            }

        }
        System.out.println("The total hour of employee: " + totalHours + "h");
    }

    // Viết phương thức calculateTotalHoursWorkedPerEmployee() hiển thị tổng số giờ làm việc
    //của tất cả nhân viên.
    public void calculateTotalHoursWorkedPerEmployee() {
        double totalHours = 0;
        // dung vong lap for de xuat task
        for (Task task : tasks) {
            totalHours = totalHours + task.getHours();
        }
        System.out.println("TotalHoursWorkedPerEmployee: " + totalHours + "h");
    }
}
