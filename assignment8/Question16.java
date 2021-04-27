package assignment8;

public class Question16 {

	public static void main(String[] args) {
		System.out.println(simpleRoomBook(false, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 7, 2, 2018));

	}

	public static boolean simpleRoomBook(boolean a, int month, int day, int year) {
		if (a == true) {
			if (year == 2018 && month == 7 && day > 0 && day < 9)
				return false;
			else
				return true;
		} else
			return false;

	}

}
