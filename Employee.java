package edu.smg;
import java.util.*;
public class Employee extends Person {

    private double salary;
    private String office;
    private Date dateHired = new Date();;

    public Employee(String name) {
        super(name);
        salary=0;
        office="none";
        dateHired=null;
    }

    public Employee(String name, double salary, String office, Date dateHired) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}