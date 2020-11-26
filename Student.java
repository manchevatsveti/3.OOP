package edu.smg;

public class Student extends Person {

    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String n, String a, String p, String e, String status) {
        super(n,a,p,e);
        this.status = status;
    }

    
    public String toString() {
        return super.toString() + " Status: "+ status;
    }
}
