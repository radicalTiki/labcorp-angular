package com.labcorp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public List<EmployeeImpl> getEmployee() {
        return (List<EmployeeImpl>) employeeRepository.findAll();
    }

    @PostMapping("/employee")
    void addUser(@RequestBody EmployeeImpl employee) {
        employeeRepository.save(employee);
    }
}
