package hu.cubix.hr.megustahero.service;

import hu.cubix.hr.megustahero.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService {

    @Value("${hr.payraise.default.percent}")
    private int defaultPercent = 0;

    @Override
    public int getPayRaisePercent(Employee employee) {
        return defaultPercent;
    }
}
