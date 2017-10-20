package com.example.supers;

/**
 *
 * @author Student
 */
public class Worker extends Human{

    private Integer workingHours;
    
    private Double salary;

    public Worker(Integer workingHours, Double salary, String firstName, String lastName) {
        super(firstName, lastName);
        this.workingHours = workingHours;
        this.salary = salary;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" + "workingHours=" + workingHours + ", salary=" + salary + "} " + super.toString();
    }

    public String getWorkerSalary(){
        return String.valueOf(salary * workingHours);
    }
    
}
