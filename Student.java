package edu.smg;

public class Student extends Person {

    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}
