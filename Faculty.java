package edu.smg;

public class Faculty extends Employee {
	
    private double officeHours;
    private String rank;
   
    public Faculty( String n, String a, String p, String e, String o, double s, double oh, String r) {
    	super(n, a, p, e, s, o);
        setOfficeHours(oh);
        setRank(r);
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    
    public String toString() {
        return super.toString() + " Office hours: "+ officeHours+ " Rank: "+ rank;
    }
}

