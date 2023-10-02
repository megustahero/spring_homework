package hu.cubix.hr.megustahero.config;

import hu.cubix.hr.megustahero.service.EmployeeService;
import hu.cubix.hr.megustahero.service.SmartEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("smart")
public class SmartEmployeeConfiguration {

    @Bean
    public EmployeeService employeeService() {
        return new SmartEmployeeService();
    }
}
