package de.maxkorte.employeer.service;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.createEmployee(employee);
    }

    public Employee getEmployee(UUID id) {
        return employeeRepository.getEmployeeById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.updateEmployee(employee);
    }

    public void removeEmployee(UUID id) {
        employeeRepository.removeEmployee(id);
    }
}
