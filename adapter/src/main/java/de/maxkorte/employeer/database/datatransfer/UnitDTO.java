package de.maxkorte.employeer.database.datatransfer;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity(name = "unit")
@Data
public class UnitDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @OneToOne()
    @JoinColumn(name = "manager_id")
    private EmployeeDTO manager;
    @OneToMany(mappedBy = "unit")
    private Set<EmployeeDTO> employees;
}
