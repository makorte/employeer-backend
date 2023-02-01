package de.maxkorte.employeer.service;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;
    @InjectMocks
    private EmployeeService employeeService;

    @Test
    @DisplayName("save should call save method on repository and return saved employee")
    void saveTest1() {
        // arrange
        Employee employee = new Employee(UUID.randomUUID(), "lastName", "firstName", "role", "mail", "phone", 1);
        when(employeeRepository.save(employee)).thenReturn(employee);

        // act
        Employee result = employeeService.save(employee);

        // assert
        verify(employeeRepository, times(1)).save(employee);
        Assertions.assertEquals(employee, result);
    }

    @Test
    @DisplayName("getAll should call findAll method on repository and return all existing employees")
    void getAllTest1() {
        // arrange
        Employee employee = new Employee(UUID.randomUUID(), "lastName", "firstName", "role", "mail", "phone", 1);
        when(employeeRepository.findAll()).thenReturn(List.of(employee));

        // act
        List<Employee> result = employeeService.getAll();

        // assert
        verify(employeeRepository, times(1)).findAll();
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(employee, result.get(0));
    }

    @Test
    @DisplayName("getById should call getById method on repository and return employee with matching id")
    void getByIdTest1() {
        // arrange
        Employee employee = new Employee(UUID.randomUUID(), "lastName", "firstName", "role", "mail", "phone", 1);
        when(employeeRepository.findById(employee.getId())).thenReturn(employee);

        // act
        Employee result = employeeService.getById(employee.getId());

        // assert
        verify(employeeRepository, times(1)).findById(employee.getId());
        Assertions.assertEquals(employee, result);
    }

    @Test
    @DisplayName("update should call update method on repository and return updated employee")
    void updateTest1() {
        // arrange
        Employee employee = new Employee(UUID.randomUUID(), "lastName", "firstName", "role", "mail", "phone", 1);
        when(employeeRepository.update(employee)).thenReturn(employee);

        // act
        Employee result = employeeService.update(employee);

        // assert
        verify(employeeRepository, times(1)).update(employee);
        Assertions.assertEquals(employee, result);
    }

    @Test
    @DisplayName("delete should call delete method on repository")
    void deleteTest1() {
        // arrange
        Employee employee = new Employee(UUID.randomUUID(), "lastName", "firstName", "role", "mail", "phone", 1);

        // act
        employeeService.delete(employee.getId());

        // assert
        verify(employeeRepository, times(1)).delete(employee.getId());}
}
