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
    public Employee save(Employee employee) {
        return employeeMapper.toDomain(employeeDAO.save(employeeMapper.toDTO(employee)));
    }

    @Override
    public Employee findById(UUID id) {
        return employeeMapper.toDomain(employeeDAO.findById(id).orElse(null));
    }

    @Override
    public Employee update(Employee employee) {
        return employeeMapper.toDomain(employeeDAO.save(employeeMapper.toDTO(employee)));
    }

    @Override
    public void delete(UUID id) {
        employeeDAO.deleteById(id);
    }
}
