package org.example;

import junit.framework.Assert;
import org.example.model.Department;
import org.example.model.Manager;
import org.example.model.TaskManager;
import org.example.model.Worker;
import org.junit.Test;

import java.util.HashMap;

public class SalaryTest {
    @Test
    public void calculateBasicSalary()
    {
        Department department = new Department(1,"Phuc");
        Worker worker = new Worker("a1", "Phuc", 5, 12, "IT","c");
        double salary = worker.calculateBasicSalary();
        Assert.assertEquals(950,0.1);
        Manager manager = new Manager("a2", "Duong", 7, 14, "Dev",0.25);
        double salary2 = manager.calculateBasicSalary();
        Assert.assertEquals();

    }
}
