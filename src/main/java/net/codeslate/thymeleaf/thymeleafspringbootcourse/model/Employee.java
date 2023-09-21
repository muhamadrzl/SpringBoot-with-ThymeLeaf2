package net.codeslate.thymeleaf.thymeleafspringbootcourse.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Employee {

    private long id;
    @NotEmpty(message="This field can not be empty")
    @Size(min=4, max=25)
    private String name;
    private String department;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
