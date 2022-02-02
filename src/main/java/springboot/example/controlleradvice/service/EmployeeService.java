package springboot.example.controlleradvice.service;

import springboot.example.controlleradvice.Entity.Employee;
import springboot.example.controlleradvice.core.exception.NotFoundException;

public interface EmployeeService {
    Employee findById(long id) throws NotFoundException;
}
