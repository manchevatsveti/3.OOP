package edu.smg;
import java.util.*;
public class Employee extends Person {

    private double salary;
    private String office;
    private Date dateHired = new Date();;

    public Employee(String n, String a, String p, String e, double salary, String office) {
    	super(n,a,p,e);
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

    public String toString() {
        return super.toString()+ " Salary: "+ salary+ " Office: "+ office+ " Date Hired: "+ dateHired;
    }
}
