import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}
	
	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String input = in.nextLine();
		System.out.println(input);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int firstNum = in.nextInt();
		System.out.print("In: ");
		int secondNum = in.nextInt();
		in.nextLine();
		System.out.println(firstNum/secondNum);
		System.out.println(firstNum%secondNum);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String input = in.nextLine();
		System.out.println(input + " was the text you wrote");
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num = in.nextInt();
		in.nextLine();
		System.out.println(num*5);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean bool = in.nextBoolean();
		in.nextLine();
		System.out.println(bool + " is a boolean");
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double num = in.nextDouble();
		in.nextLine();
		System.out.println(num - 3.2);
	}
}
