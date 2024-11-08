package com.employeemgmt;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // Constructor injection of the EmployeeRepository
    private final EmployeeRepository employeeRepository;

    // Constructor to inject EmployeeRepository dependency
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create multiple employees (Batch Handling)
    @PostMapping("/post")
    public String createEmployees(@RequestBody List<EmployeeData> employees) {
        employeeRepository.saveAll(employees);
        return "Employees created successfully!";
    }

    // Get all employees
    @GetMapping("/get")
    public List<EmployeeData> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    @GetMapping("/get/{id}")
    public EmployeeData getEmployeeById(@PathVariable int id) {
        return employeeRepository.findById(id).orElse(null); // Return null if not found
    }

    // Update an employee
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody EmployeeData employeeDetails) {
        EmployeeData employee = employeeRepository.findById(id).orElse(null);

        if (employee != null) {
            employee.setEmpName(employeeDetails.getEmpName());
            employee.setAge(employeeDetails.getAge());
            employee.setSalary(employeeDetails.getSalary());
            employee.setDesignation(employeeDetails.getDesignation());
            employee.setContactNo(employeeDetails.getContactNo());

            employeeRepository.save(employee);
            return "Employee updated successfully!";
        } else {
            return "Employee not found!";
        }
    }

    // Delete an employee
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully!";
        } else {
            return "Employee not found!";
        }
    }
    
    // Delete all employees
    @DeleteMapping("/deleteAll")
    public String deleteAllEmployees() {
        employeeRepository.deleteAll();
        return "All employees deleted successfully!";
    }

}
