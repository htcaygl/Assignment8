package assignment8;

public class Question13 {

	public static void main(String[] args) {

		System.out.println(waterTax(50));
		System.out.println(waterTax(55));
		System.out.println(waterTax(101));
		System.out.println(waterTax(151));

	}

	public static double waterTax(double units) {

		if (units <= 50)
			return units * 0.60;
		else if (units > 50 && units <= 100)
			return units * 0.90;
		else if (units > 100 && units <= 150)
			return 50 + (units * 0.90);
		else
			return 100 + (units * 0.90);

	}

}
