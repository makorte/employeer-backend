package de.maxkorte.employeer.repository;

import de.maxkorte.employeer.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository {
    Employee save(Employee employee);
    List<Employee> findAll();
    Employee findById(UUID id);
    Employee update(Employee employee);
    void delete(UUID id);
}
