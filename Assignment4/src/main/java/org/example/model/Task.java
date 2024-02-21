package org.example.model;

public class Task {
    // attributes: taskId:int,desc:String,mapping: Employee employee
    private int taskId;
    private String desc;
    private int hours;
    private Employee employee;

    // constructor k tham so
    public Task() {
    }

    // constructor co tham so

    public Task(int taskId, String desc, int hours, Employee employee) {
        this.taskId = taskId;
        this.desc = desc;
        this.hours = hours;
        this.employee = employee;
    }

    // getter va setter

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
