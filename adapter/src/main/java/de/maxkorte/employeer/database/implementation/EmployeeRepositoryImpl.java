package de.maxkorte.employeer.database.implementation;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.database.dataaccess.EmployeeDAO;
import de.maxkorte.employeer.database.mapper.EmployeeMapper;
import de.maxkorte.employeer.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final EmployeeDAO employeeDAO;
    private final EmployeeMapper employeeMapper;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeMapper.toDomain(employeeDAO.save(employeeMapper.toDTO(employee)));
    }

    @Override
    public Employee getEmployeeById(UUID id) {
        return employeeMapper.toDomain(employeeDAO.findById(id).orElse(null));
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeMapper.toDomain(employeeDAO.save(employeeMapper.toDTO(employee)));
    }

    @Override
    public void removeEmployee(UUID id) {
        employeeDAO.deleteById(id);
    }
}
