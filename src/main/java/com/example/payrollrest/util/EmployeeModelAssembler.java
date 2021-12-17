package com.example.payrollrest.util;

import com.example.payrollrest.models.Employee;
import com.example.payrollrest.web.EmployeeRestController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        return EntityModel.of(employee, //
                linkTo(methodOn(EmployeeRestController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeRestController.class).all()).withRel("employees"));
    }
}
