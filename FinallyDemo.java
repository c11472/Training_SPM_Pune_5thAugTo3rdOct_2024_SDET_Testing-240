package com.programs.day5;

import com.programs.day4.TestLib;

public class FinallyDemo  {
	
	public static void main(String args[]) {
		TestLib tl = new TestLib();
		int num=1000;
		try {
		System.out.println(1000/0);}
		finally {
			
			tl.testconcat(); 
			tl.testarr();
			
		}
	}

}
