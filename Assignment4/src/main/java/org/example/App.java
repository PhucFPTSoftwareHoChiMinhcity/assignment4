package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // tao doi tuong cho department
        Department department = new Department(1, "Phuc");
        System.out.printf("Department: \ndepId:%d \nname:%s ", department.getDepId(), department.getName());
        // tao doi tuong cho nhan vien
        Employee employee = new Employee("a1", "phuc", 5, 12, "IT");
        System.out.printf("\nEmployee: \nempId:%s \nfullName:%s" +
                        "\nyearsOfService:%d \nsalary:%f \ndepartment:%s"
                , employee.getEmpId(), employee.getFullName(), employee.getYearsOfService(), employee.getSalary()
                , employee.getDepartment());
        // tao doi tuong cho Manager
        Manager manager = new Manager(5);
        System.out.printf("\nallowance:%f", manager.getAllowance());
        // tao doi tuong cho staff
        Staff staff = new Staff("Developer");
        System.out.printf(" \nStaff \nposition:%s", staff.getPosition());
        // tao doi tuong cho worker
        Worker worker = new Worker("All of days");
        System.out.printf("\nWorker \nshift:%s", worker.getShift());
        // tao doi tuong cho task

        Task task1 = new Task(2, "a", 4, employee);
        Task task2 = new Task(3, "b", 5, employee);
        Task task3 = new Task(4, "c", 6, employee);
        Task task4 = new Task(5, "d", 7, employee);
        Task task5 = new Task(6, "e", 8, employee);
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        TaskManager taskManager = new TaskManager(tasks);
        taskManager.displayTotalHoursWorked(employee);
    }
    // Viết phương thức calculateTotalHoursWorkedPerEmployee() hiển thị tổng số giờ làm việc
    //của tất cả nhân viên.
    // dung HashMap
    public HashMap<String,Double> calculateTotalHoursWorkedPerEmployee(){
        HashMap<String,Double> hashMap = new HashMap<>();
        for (Task task : taskList)
        {
            String empId = task.getEmployee().getEmpId();
            if (hashMap.containsKey(empId))
            {
                double hours = hashMap.get(empId);
                double totalHours = hours + task.getHours();
                hashMap.put(empId,totalHours);
            }else {
                hashMap.put(empId,task.getHours());
            }
        }
        return hashMap;
    }
}
