package com.ulyanovcompany.task1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        int finalSalary = this.salary + this.salary * percent / 100;
        return finalSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", salary=" + salary +
                ']';
    }
}
