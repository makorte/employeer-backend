package de.maxkorte.employeer.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    @Schema(
            description =
                    "The database generated company ID. "
                            + "This has to be null when creating a new company. "
                            + "This has to be set when updating a company.")

    private UUID id;
    private String lastName;
    private String firstName;
    private String role;
    private String mail;
    private String phone;
    private int weeklyWorkingHours;
}
