package eddu.smg;

public class BMI_tset {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("Tom",16,80,1.85);
		BMI bmi2 = new BMI("Sam", 65,1.50);
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
	}

}
