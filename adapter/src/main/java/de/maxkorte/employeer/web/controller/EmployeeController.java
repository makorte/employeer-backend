package de.maxkorte.employeer.web.controller;

import de.maxkorte.employeer.service.EmployeeService;
import de.maxkorte.employeer.web.dto.EmployeeDTO;
import de.maxkorte.employeer.web.mapper.EmployeeMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @Operation(summary = "Create a new Employee.")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful creation of employee",
                            content = {
                                    @Content(
                                            mediaType = "application/json",
                                            schema = @Schema(implementation = EmployeeDTO.class),
                                            examples = @ExampleObject(value = "{\n" +
                                                    "  \"id\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\n" +
                                                    "  \"lastName\": \"Doe\",\n" +
                                                    "  \"firstName\": \"John\",\n" +
                                                    "  \"role\": \"Software Engineer\",\n" +
                                                    "  \"mail\": \"john.doe@company.com\",\n" +
                                                    "  \"phone\": \"0123456789\",\n" +
                                                    "  \"weeklyWorkingHours\": 40\n" +
                                                    "}"))
                            }),
                    @ApiResponse(responseCode = "400", description = "Invalid employee data", content = @Content),
            })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "The employee that should be created",
            content = @Content(
                    schema = @Schema(implementation = EmployeeDTO.class),
                    examples = @ExampleObject(value = "{\n" +
                            "  \"lastName\": \"Doe\",\n" +
                            "  \"firstName\": \"John\",\n" +
                            "  \"role\": \"Software Engineer\",\n" +
                            "  \"mail\": \"john.doe@company.com\",\n" +
                            "  \"phone\": \"0123456789\",\n" +
                            "  \"weeklyWorkingHours\": 40\n" +
                            "}")),
            required = true
    )
    @PostMapping({"", "/"})
    public EmployeeDTO save(@RequestBody EmployeeDTO employee) {
        return employeeMapper.toDTO(employeeService.save(employeeMapper.toDomain(employee)));
    }

    @Operation(summary = "Get all employees.")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful retrieval of all employees",
                            content = {
                                    @Content(
                                            mediaType = "application/json",
                                            array = @ArraySchema(schema = @Schema(implementation = EmployeeDTO.class)),
                                            examples = @ExampleObject(value = "[{\n" +
                                                    "  \"id\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\n" +
                                                    "  \"lastName\": \"Doe\",\n" +
                                                    "  \"firstName\": \"John\",\n" +
                                                    "  \"role\": \"Software Engineer\",\n" +
                                                    "  \"mail\": \"john.doe@company.com\",\n" +
                                                    "  \"phone\": \"0123456789\",\n" +
                                                    "  \"weeklyWorkingHours\": 40\n" +
                                                    "}]")
                                    )
                            }
                    )
            }
    )
    @GetMapping({"", "/"})
    public List<EmployeeDTO> getAll() {
        return employeeMapper.toDTOList(employeeService.getAll());
    }

    @Operation(summary = "Get an employee by its id.")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful retrieval of employee",
                            content = {
                                    @Content(
                                            mediaType = "application/json",
                                            schema = @Schema(implementation = EmployeeDTO.class),
                                            examples = @ExampleObject(value = "{\n" +
                                                    "  \"id\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\n" +
                                                    "  \"lastName\": \"Doe\",\n" +
                                                    "  \"firstName\": \"John\",\n" +
                                                    "  \"role\": \"Software Engineer\",\n" +
                                                    "  \"mail\": \"john.doe@company.com\",\n" +
                                                    "  \"phone\": \"0123456789\",\n" +
                                                    "  \"weeklyWorkingHours\": 40\n" +
                                                    "}"))
                            }),
            })
    @GetMapping({"/{id}", "/{id}/"})
    public EmployeeDTO getById(@PathVariable(name = "id") UUID id) {
        return employeeMapper.toDTO(employeeService.getById(id));
    }

    @Operation(summary = "Update an existing employee or create new employee if given id is not existing.")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful update or creation of employee",
                            content = {
                                    @Content(
                                            mediaType = "application/json",
                                            schema = @Schema(implementation = EmployeeDTO.class),
                                            examples = @ExampleObject(value = "{\n" +
                                                    "  \"id\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\n" +
                                                    "  \"lastName\": \"Doe\",\n" +
                                                    "  \"firstName\": \"John\",\n" +
                                                    "  \"role\": \"Software Engineer\",\n" +
                                                    "  \"mail\": \"john.doe@company.com\",\n" +
                                                    "  \"phone\": \"0123456789\",\n" +
                                                    "  \"weeklyWorkingHours\": 40\n" +
                                                    "}"))
                            }),
                    @ApiResponse(responseCode = "400", description = "Invalid employee data", content = @Content),
            })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "The new employee data with the id of the employee that should be updated",
            content = @Content(
                    schema = @Schema(implementation = EmployeeDTO.class),
                    examples = @ExampleObject(value = "{\n" +
                            "  \"id\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\n" +
                            "  \"lastName\": \"Doe\",\n" +
                            "  \"firstName\": \"John\",\n" +
                            "  \"role\": \"Software Engineer\",\n" +
                            "  \"mail\": \"john.doe@company.com\",\n" +
                            "  \"phone\": \"0123456789\",\n" +
                            "  \"weeklyWorkingHours\": 40\n" +
                            "}")),
            required = true
    )
    @PutMapping({"", "/"})
    public EmployeeDTO update(@RequestBody EmployeeDTO employee) {
        return employeeMapper.toDTO(employeeService.update(employeeMapper.toDomain(employee)));
    }

    @Operation(summary = "Delete an existing employee.")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Successful deletion of employee"),
                    @ApiResponse(responseCode = "404", description = "Invalid employee id"),
            })
    @DeleteMapping({"/{id}", "/{id}/"})
    public void delete(@PathVariable(name = "id") UUID id) {
        employeeService.delete(id);
    }
}
