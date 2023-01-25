package de.maxkorte.employeer.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity(name = "employee")
@Data
public class EmployeeEntity {
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
