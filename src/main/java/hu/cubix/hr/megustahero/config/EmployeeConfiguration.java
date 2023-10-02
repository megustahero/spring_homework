package hu.cubix.hr.megustahero.config;

import hu.cubix.hr.megustahero.service.DefaultEmployeeService;
import hu.cubix.hr.megustahero.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!smart")
public class EmployeeConfiguration {

    @Bean
    public EmployeeService employeeService() {
        return new DefaultEmployeeService();
    }
}
