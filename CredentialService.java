package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	public char[] generatedPassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()_+|<>?/";
		String value = capitalLetters + smallLetters + Numbers + specialCharacters;
		Random random = new Random();
		char[] Password = new char[8];
		
		for (int i=0 ;i<8 ; i++) {
			Password[i] = value.charAt(random.nextInt(value.length()));
			
		}
		return Password;
	}
	public String generatedEmailaddress(String FirstName, String LastName, String Department) {
		
		String generatedEmail = FirstName + LastName + "@" + Department + ".xyz.com";
		return generatedEmail;
		
	}
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		
		System.out.println("Hi" + employee.getFirstName()+ "your generated credentials are as follows");
		System.out.println("Email is" + email);
		System.out.println("Password is" +generatedPassword);
	}

}
