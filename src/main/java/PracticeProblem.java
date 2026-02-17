/**
	* Lesson: Input
	* Author: Owais Ali Khan
	* Date Created: February 9, 2023
	* Date Last Modified: February 17, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = input.nextLine();
	    //input.nextLine();
		System.out.println(name);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a whole number: ");
		int num = input.nextInt();
		System.out.println(num*2+2);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		double radius = input.nextDouble();
		System.out.println(radius*2*3.14);
		System.out.println(radius*radius*3.14);

	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a first name: ");
		String firstName = input.nextLine();
		//input.nextLine();
		System.out.print("Input a last name: ");
		String lastName = input.nextLine();
		//input.nextLine();
		System.out.print("Input an age: ");
		int age = input.nextInt();
		//input.nextLine();
		System.out.println(lastName + ", " + firstName + " - " + age);

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a name: ");
		String name = input.nextLine();
		System.out.print("Input an age: ");
		int age = input.nextInt();
		int iq = age;
		age = age+3;
		System.out.println(name+age);
		System.out.println(iq);
		
		
	}

}
