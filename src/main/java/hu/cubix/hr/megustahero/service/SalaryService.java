package hu.cubix.hr.megustahero.service;

import hu.cubix.hr.megustahero.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    private EmployeeService employeeService;

    public SalaryService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setEmployeePayRaise(Employee employee) {
        employee.setSalary((int)(employee.getSalary() / 100.0 * (100 + employeeService.getPayRaisePercent(employee))));
    }
}
