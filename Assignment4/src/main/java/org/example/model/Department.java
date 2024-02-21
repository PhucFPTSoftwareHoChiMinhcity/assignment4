package org.example.model;

public class Department {
    // attributes: depId,name
    private int depId;
    private String name;

    // constructor k tham so
    public Department() {
    }

    // constructor co tham so
    public Department(int depId, String name) {
        this.depId = depId;
        this.name = name;
    }

    // getter va setter
    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
