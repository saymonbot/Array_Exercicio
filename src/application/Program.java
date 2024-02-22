package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.emplyee;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<emplyee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int a = scan.nextInt();
		
		for(int i = 0; i < a; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.println("Id: ");
			int id = scan.nextInt();

	        System.out.println("Name: ");
	        scan.nextLine();
	        String name = scan.nextLine();
	        	
	        System.out.println("Salary: ");
	        Double salary = scan.nextDouble();
	        
	        
	        emplyee emp = new emplyee(id, name, salary);
	        
	        list.add(emp);
	        
	        System.out.println("Enter id employee that will have salary increase: ");
	        int idInc = scan.nextInt();
	        
	        System.out.println("Enter the porcentage: ");
	        int pc = scan.nextInt();
	        
	        list.set(inc, salary) = salary * pc;
		}

	}

}
