import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello! Please give me a number.");
		Scanner reader = new Scanner(System.in);
		int first = reader.nextInt();
		System.out.println("Now please give me a second number.");
		int second = reader.nextInt();
		reader.close();
		addition(first, second);
		subtraction(first, second);
		multiplication(first, second);
		division(first, second);
	}
	public static void addition(int first, int second) {
		int sum = first+second;
		System.out.println(first + " + " + second + " = " + sum);
	}
	
	public static void subtraction(int first, int second) {
		int difference = first-second;
		System.out.println(first + " - " + second + " = " + difference);
	}
	
	public static void multiplication(int first, int second) {
		int product = first*second;
		System.out.println(first + " * " + second + " = " + product);
	}
	
	public static void division(int first, int second) {
		int quotient = first / second;
		System.out.println(first + " / " + second + " = " + quotient);
	}

}
