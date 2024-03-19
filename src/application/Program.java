package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int a = scan.nextInt();
		
		for(int i = 0; i < a; i++) {
			System.out.println((i + 1)  + "º employee");
			System.out.println("Id: ");
			int id = scan.nextInt();

	        System.out.println("Name: ");
	        scan.nextLine();
	        String name = scan.nextLine();
	        	
	        System.out.println("Salary: ");
	        Double salary = scan.nextDouble();
	        
	        employee emp = new employee(id, name, salary);
	        
	        list.add(emp);
		}

	        System.out.println("Enter id employee that will have salary increase: ");
	        int idInc = scan.nextInt();
	        Integer pos = position(list, idInc);
	        if (pos == null) {
	        	System.out.println("Id dont exist!");
	        } else {
		        System.out.println("Enter the porcentage: ");
		        double pc = scan.nextDouble();
		        list.get(pos).increseSalary(pc);
	        }
	        
	    System.out.println("List of employees: ");
	    for (employee emp : list) {
	    	System.out.println(emp);
	    }
	    
		scan.close();
	}
	
		public static Integer position(List<employee> list, int id) {
			for (int i = 0; i < list.size(); i++) {	
				if(list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
	}
}