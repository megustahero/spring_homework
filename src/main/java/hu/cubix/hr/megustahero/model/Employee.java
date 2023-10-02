package hu.cubix.hr.megustahero.model;

import java.time.LocalDateTime;

public class Employee {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getposition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDateTime getEnterance() {
        return enterance;
    }

    public void setEnterance(LocalDateTime enterance) {
        this.enterance = enterance;
    }

    public Employee(long id, String position, int salary, LocalDateTime enterance) {
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.enterance = enterance;
    }

    private long id;
    private String position;
    private int salary;
    private LocalDateTime enterance;


}
