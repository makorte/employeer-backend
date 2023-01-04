package de.maxkorte.employeer.database.dto;

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
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private UnitDTO unit;
    @OneToOne(mappedBy = "manager")
    private UnitDTO managedUnit;
}
