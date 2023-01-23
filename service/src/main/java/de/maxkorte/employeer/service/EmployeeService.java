package de.maxkorte.employeer.service;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(UUID id) {
        return employeeRepository.findById(id);
    }

    public Employee update(Employee employee) {
        return employeeRepository.update(employee);
    }

    public void delete(UUID id) {
        employeeRepository.delete(id);
    }
}
