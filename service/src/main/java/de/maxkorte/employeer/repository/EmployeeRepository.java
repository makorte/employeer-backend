package de.maxkorte.employeer.repository;

import de.maxkorte.employeer.Employee;

import java.util.UUID;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Employee findById(UUID id);
    Employee update(Employee employee);
    void delete(UUID id);
}
