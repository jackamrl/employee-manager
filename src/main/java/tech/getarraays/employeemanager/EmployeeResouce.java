package tech.getarraays.employeemanager;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarraays.employeemanager.model.Employee;
import tech.getarraays.employeemanager.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResouce {
    private final EmployeeService employeeService;

    public EmployeeResouce(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK)
    }
}
