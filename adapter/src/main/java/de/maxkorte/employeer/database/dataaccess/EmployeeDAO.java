package de.maxkorte.employeer.database.dataaccess;

import de.maxkorte.employeer.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, UUID> {

}
