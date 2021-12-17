package com.example.payrollrest.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

    private final Long id;

    public EmployeeNotFoundException(Long id) {
    this.id = id;
    }

    @Override
    public String getMessage() {
        return "Employee with id " + this.id + " does not exist!";
    }
}
