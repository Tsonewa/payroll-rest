package com.example.payrollrest.models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Employee extends BaseEntity {

    private String name;
    private String role;

    public Employee(Long id, String name, String role) {
        super(id);
        this.name = name;
        this.role = role;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
