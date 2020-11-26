package edu.smg;

public class TestPerson {

	   public static void main(String[] args) {

	        Person person = new Person("Tom", "Rakovski23", "0885678891", "tomm@abv.bg");
	        Student student = new Student("Tom", "Rakovski23", "0885678891", "tomm@abv.bg", Student.FRESHMAN);
	        Employee employee = new Employee("Tom", "Rakovski23", "0885678891", "tomm@abv.bg",4500,"Head Office");
	        Faculty faculty = new Faculty ("Tom", "Rakovski23", "0885678891", "tomm@abv.bg","Head Office",4500,54,"boss");
	        Staff staff = new Staff ("Tom", "Rakovski23", "0885678891", "tomm@abv.bg","Head Office",4500,"sanitor");

	        System.out.println(person.toString());
	        System.out.println(student.toString());
	        System.out.println(employee.toString());
	        System.out.println(faculty.toString());
	        System.out.println(staff.toString());

	    }

}
