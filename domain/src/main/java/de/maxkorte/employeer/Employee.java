package de.maxkorte.employeer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String lastName;
    private String firstName;
    private String role;
    private String mail;
    private String phone;
    private int weeklyWorkingHours;
    private Unit unit;
}
