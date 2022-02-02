package springboot.example.controlleradvice.service.impl;

import springboot.example.controlleradvice.Entity.Address;
import springboot.example.controlleradvice.Entity.Employee;
import springboot.example.controlleradvice.core.exception.NotFoundException;
import springboot.example.controlleradvice.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee findById(long id) throws NotFoundException {
        Employee emp = null;
        List<Employee> employeeList = getEmployeeList();
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                emp = employee;
            }
        }
        if (emp == null) {
            throw new NotFoundException("Not found details");
        }
        return emp;
    }

    private List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Address address= new Address(1, "address");
        employeeList.add(new Employee(1,"A", address));
        employeeList.add(new Employee(2, "B", address));

        return employeeList;
    }
}
