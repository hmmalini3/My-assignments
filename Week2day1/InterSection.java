

public class InterSection {
	public static void main(String[] args) {

		int[] num1 = { 3, 1, 5, 2, 7, 3, 2, 9 };

		int[] num2 = { 4, 2, 5, 3, 7, 8, 9 };
		for (int i = 0; i < num1.length; i++) {

			for (int j = 0; j < num2.length; j++) {

				
				if (num1[i] == num2[j]) {
					System.out.print(num1[i]+ " ");
					
				}

			}

		}

	}
}