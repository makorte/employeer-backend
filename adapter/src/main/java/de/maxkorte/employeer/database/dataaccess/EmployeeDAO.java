package de.maxkorte.employeer.database.dataaccess;

import de.maxkorte.employeer.Employee;
import de.maxkorte.employeer.database.datatransfer.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeDTO, UUID> {

}
