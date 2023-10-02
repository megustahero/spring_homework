package hu.cubix.hr.megustahero;

import hu.cubix.hr.megustahero.model.Employee;
import hu.cubix.hr.megustahero.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

    @Autowired
    SalaryService salaryService;
    public static void main(String[] args) {
        SpringApplication.run(HrApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Employee emp1 = new Employee(1, "CEO", 123000, LocalDateTime.parse("2022-10-03T08:00:00"));
        salaryService.setEmployeePayRaise(emp1);
        System.out.println(emp1.getSalary());

        Employee emp2 = new Employee(1,"CTO", 1000, LocalDateTime.parse("2013-11-28T08:00:00"));
        salaryService.setEmployeePayRaise(emp2);
        System.out.println(emp2.getSalary());

    }

}
