package com.kodilla.kodillapatterns2_2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    private final String peselId;
    private final String firstName;
    private final String lastName;
    private final BigDecimal baseSalary;

    public Employee(String peselId, String firstName, String lastName, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return getPeselId().equals(employee.getPeselId());
    }

    @Override
    public int hashCode() {
        return getPeselId().hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
