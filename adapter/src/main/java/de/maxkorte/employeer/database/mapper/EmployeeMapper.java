package de.maxkorte.employeer.database.mapper;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.database.datatransfer.EmployeeDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmployeeMapper {
    EmployeeDTO toDTO(Employee employee);
    List<EmployeeDTO> toDTOList(List<Employee> employees);
    Employee toDomain (EmployeeDTO employeeDTO);
    List<Employee> toDomainList (List<EmployeeDTO> employeeDTOs);
}
