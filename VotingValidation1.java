package com.programs.day5;

import java.util.Scanner;
class PinValidationException extends Exception{
	PinValidationException(){
		super("Incorrect pin number");
	}
	PinValidationException(String message1){
		super(message1);
	}
	
}

class UnderAgeException extends Exception{
	UnderAgeException(){
		super("You are under age");
	}
	UnderAgeException(String message){
	    super(message);	
	}	
}
public class VotingValidation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		String pin1;
		int age;
		pin1=c.next();
	    age=c.nextInt();

		try {
		
		//Scanner c = new Scanner(System.in);
		String pindigits = "Pin is more than 4 digits";
		
		
		if(pin1.equals(pindigits)) {
			throw new PinValidationException();
		}
		else {
			System.out.println("Correct pin");
		}
		}
		catch(PinValidationException e) {
			e.printStackTrace();
			
		}
		
		//**********************
		try {
		age = c.nextInt();
		if(age<18) {
			throw new UnderAgeException();
		}
		else {
			System.out.println("Voted !");
		}
		}
		catch(UnderAgeException e1) {
			e1.printStackTrace();
			
		}
	}
}
