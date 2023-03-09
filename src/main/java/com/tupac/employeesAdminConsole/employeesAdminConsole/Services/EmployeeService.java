package com.tupac.employeesAdminConsole.employeesAdminConsole.Services;

import com.tupac.employeesAdminConsole.employeesAdminConsole.Entities.Employee;
import com.tupac.employeesAdminConsole.employeesAdminConsole.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    // Repository in use
    EmployeeRepository employeeRepository;

    //Constructor - Dependency Injection
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Class services
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found"));
    }

    public Long updateEmployee(Long id, Employee employee) {
        Employee foundEmployee = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Resource not found"));
        employeeRepository.deleteById(id);
        foundEmployee.setName(employee.getName());
        foundEmployee.setLastName(employee.getLastName());
        employeeRepository.save(foundEmployee);
        return id;
    }

    public Long removeEmployee(Long id) {
        employeeRepository.deleteById(id);
        return id;
    }
}
