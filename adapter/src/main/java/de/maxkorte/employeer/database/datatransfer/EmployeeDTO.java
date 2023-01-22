package de.maxkorte.employeer.database.datatransfer;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity(name = "employee")
@Data
public class EmployeeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String lastName;
    private String firstName;
    private String role;
    private String mail;
    private String phone;
    private int weeklyWorkingHours;
}
