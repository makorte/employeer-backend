package de.maxkorte.employeer.database.mapper;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.database.entity.EmployeeEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, implementationName = "DatabaseCompanyMapperImpl")
public interface EmployeeMapper {
    EmployeeEntity toEntity(Employee employee);
    List<EmployeeEntity> toEntityList(List<Employee> employees);
    Employee toDomain (EmployeeEntity employeeEntity);
    List<Employee> toDomainList (List<EmployeeEntity> employeeEntities);
}
