package edu.smg;

public class Staff extends Employee {

    private String title;

    public Staff(String n, String a, String p, String e, String o, double s, String t) {
        super(n, a, p, e, s, o);
        setTitle(t);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   
    public String toString() {
        return super.toString()+ " Title: "+ title;
    }
}
