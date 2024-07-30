package com.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public interface Common {

	final static Scanner sc=new Scanner(System.in);

	//ANSI_COLORNAME AND ANSI_RESET
//	select the all instances of variable - Alt-Shift-R (used while renaming variable)
//	public static final String BLACK_BACKGROUND = "\u001B[40m"; 
//	public static final String YELLOW_BACKGROUND = "\u001B[43m";
//	public static final String BLUE = "\u001B[34m"; 
//	public static final String YELLOW = "\u001B[33m";
//	public static final String GREEN = "\u001B[32m";
//	public static final String PURPLE = "\u001B[35m"; 
//	public static final String RED_BACKGROUND = "\u001B[41m"; 
//	public static final String RED = "\u001B[31m";
//	public static final String BLACK = "\u001B[30m";
//	public static final String ANSI_RESET = "\u001B[0m";  
	
	//COURSE VARIABLES
	String java = "Full Stack Java";
	String net ="Full Stack .NET";
	String python = "Full Stack Python";
	String web = "Full Stack Web Development";
	String ds = "Full Stack Data Science";
		
	List<RegisterObject> reg_details = new ArrayList<>();  //registration details
	List<LogObject> log_details = new ArrayList<>();  //login credentials
	
	HashMap<String,ArrayList<CourseListObject>> all_users_courselist = new HashMap<>();  //user's course list
	
	//Checks the String is Complete Numeric or not
	static boolean isNumeric(String str){
        return str != null && str.matches("[0-9]+");
    }
	
	//It checks the String contains NonAlphabetic characters or not
	static boolean isNotAlpha(String name) {
		boolean temp = false;
		for(int i=0; i<name.length(); i++) {
			if(!(Character.isAlphabetic(name.charAt(i)) || (name.charAt(i) == ' ') )) {
				temp =true;
			}
		}
		return temp;
	}
	
	//EveryTime checking while taking input for switch cases
	static int choice_validation() {
		boolean flag=true;
		while(flag) {
			String choice = sc.next();
			if(Common.isNumeric(choice)) {
				flag = false;
				return Integer.parseInt(choice);
			}else {
				System.out.println("Invalid input!!!...Try again with valid input?");
			}
		}
		return 1000;
	}

}
