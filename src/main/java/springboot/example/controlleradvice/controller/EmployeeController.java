package springboot.example.controlleradvice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.example.controlleradvice.Entity.Employee;
import springboot.example.controlleradvice.core.exception.NotFoundException;
import springboot.example.controlleradvice.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable long id) throws NotFoundException {
        return employeeService.findById(id);
    }
}
