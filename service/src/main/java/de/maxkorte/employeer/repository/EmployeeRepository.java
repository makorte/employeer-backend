package de.maxkorte.employeer.repository;

import de.maxkorte.employeer.Employee;

import java.util.UUID;

public interface EmployeeRepository {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(UUID id);
    Employee getManagerByEmployeeId(UUID employeeId);
    Employee updateEmployee(Employee employee);
    void removeEmployee(UUID id);
}
