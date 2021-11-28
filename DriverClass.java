package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {
	
	public static void main(String[] args) {
		Employee employee1  = new Employee("Kapil" , "Kumar");
		String generatedEmail;
		char[] generatedPassword;
		CredentialService cService = new CredentialService();
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("Please Enter the Department from the Following");
		System.out.println("1.Technical Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Human Resource Department");
		System.out.println("4.Legal Department");
		 
		choice = scan.nextInt();
		
		if (choice==1){
			generatedEmail = cService.generatedEmailaddress(employee1.getFirstName(), employee1.getLastName(), "Technical");
			generatedPassword = cService.generatedPassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 2){
			generatedEmail = cService.generatedEmailaddress(employee1.getFirstName(), employee1.getLastName(), "Admin" );
			generatedPassword = cService.generatedPassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 3){
			generatedEmail = cService.generatedEmailaddress(employee1.getFirstName(), employee1.getLastName(), "HumanResource" );
			generatedPassword = cService.generatedPassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 4) {
			generatedEmail = cService.generatedEmailaddress(employee1.getFirstName(), employee1.getLastName4(), "Legal" );
			generatedPassword = cService.generatedPassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else {
			System.out.println("invalid entry");
		}
		

	}

}
