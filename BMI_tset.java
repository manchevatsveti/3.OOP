package eddu.smg;

public class BMI_tset {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("Tom",16,176.37,71.83);//80kg,185cm
		BMI bmi2 = new BMI("Sam", 143.3,59.05);//65kg,150cm
		BMI bmi3 = new BMI("Mark",19, 110.23,6,2.8);
		System.out.println(bmi1.getName());
		System.out.println(bmi1.getAge());
		System.out.println(bmi1.getHeight());
		System.out.println(bmi1.getWeight());
		System.out.println(bmi1.getBMI());
		System.out.println(bmi1.getStatus());
		
		System.out.println(bmi2.getName());
		System.out.println(bmi2.getAge());
		System.out.println(bmi2.getHeight());
		System.out.println(bmi2.getWeight());
		System.out.println(bmi2.getBMI());
		System.out.println(bmi2.getStatus());
		
		System.out.println(bmi3.getName());
		System.out.println(bmi3.getAge());
		System.out.println(bmi3.getHeight());
		System.out.println(bmi3.getWeight());
		System.out.println(bmi3.getBMI());
		System.out.println(bmi3.getStatus());
	}

}
