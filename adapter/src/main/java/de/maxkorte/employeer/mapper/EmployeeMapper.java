package de.maxkorte.employeer.mapper;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.dto.EmployeeDTO;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper
public interface EmployeeMapper {
    EmployeeDTO toDTO(Employee employee);
    Set<EmployeeDTO> toDTOSet(Set<Employee> employees);
    Employee toDomain (EmployeeDTO employeeDTO);
    Set<Employee> toDomainSet (Set<EmployeeDTO> employeeDTOs);
}
