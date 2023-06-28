import java.util.Scanner;
public class esercizi {

	public static void main(String[] args) {
		
		System.out.println("buongiorno");
		
		
		boolean bool = false;
		System.out.println(bool);
		int intero = 2;
		System.out.println(intero);
		double decimali = 3.5;
		System.out.println(decimali);
		System.out.println(intero + decimali);
		System.out.println(intero * decimali);
		
		byte byteNumber = (byte) -122;
		System.out.println(byteNumber);

		String a = "hi";
		System.out.println(a);
		String b = "man";
		System.out.println(a + " " + b);
		System.out.println("length of first string is: " + a.length()
				+ " , length of second string is: " + b.length()
				+ ".string's length is :" + (a.length() + b.length()));

		String[] array = { "hey", "dogs", "terrible" };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int result = sum(4, 2);
		System.out.println(result);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome:");
		String name = input.nextLine();
		System.out.println("il tuo nome è " + name);

		System.out.println("first number:");
		int num1 = input.nextInt();
		System.out.println("second number:");
		int num2 = input.nextInt();
		System.out.println("the sum is: " + sum(num1, num2));
		input.close();
	}


	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void printSum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println(sum);
	}

	

}
