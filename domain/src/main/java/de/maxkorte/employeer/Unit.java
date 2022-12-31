package de.maxkorte.employeer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Unit {
    private String id;
    private String name;
    private Manager manager;
    private Set<Employee> employees;
}
