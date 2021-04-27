package assignment8;

public class Question15 {

	public static void main(String[] args) {

		System.out.println(validateTask(true, 2, 1));
		System.out.println(validateTask(true, 3, 1));
		System.out.println(validateTask(false, 3, 2));

	}

	public static boolean validateTask(boolean a, int nextId, int currentId) {
		if (a == true && (nextId == currentId + 1))
			return true;
		else
			return false;

	}

}
