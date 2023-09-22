package day5;

import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Gender: ");
		String gender = sc.next();
		
		System.out.println("Enter Your Income: ");
		double income = sc.nextDouble();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		TaxCalculation calc  = new TaxCalculation();
		calc.taxCalculation(person);
		System.out.println("Your Tax is: ");
		System.out.println(person.getTax());
		
		
		sc.close();
		
	}

}