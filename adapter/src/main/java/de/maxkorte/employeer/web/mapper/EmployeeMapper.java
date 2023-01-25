package de.maxkorte.employeer.web.mapper;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.web.dto.EmployeeDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, implementationName = "RestCompanyMapperImpl")
public interface EmployeeMapper {
    EmployeeDTO toDTO(Employee employee);
    List<EmployeeDTO> toDTOList(List<Employee> employees);
    Employee toDomain (EmployeeDTO employeeEntity);
    List<Employee> toDomainList (List<EmployeeDTO> employeeEntities);
}
