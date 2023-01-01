package de.maxkorte.employeer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Unit {
    private UUID id;
    private String name;
    private Employee manager;
    private Set<Employee> employees;
}
