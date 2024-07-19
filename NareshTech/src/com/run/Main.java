package com.run;

import java.util.ArrayList;
import java.util.Date;

import com.common.Common;
import com.courses.DisplayCourses;
import com.courses.TrainersData;

//Main class to run the project..
public class Main implements SignUp,DisplayCourses{
	static Main mobj=new Main();
	static Date dt = new Date();
	final static String start;
	static {
		start = dt.toString();
		new TrainersData();
	}

	static int reg =0;  //Use it for only 1st user in SignUp page for each session
	
	//Below 2 are flow updatable variables to every user..
	public static int cnt; //It always pointing an INDEX of classes in each user's course list
	public static ArrayList<ArrayList<String>> out_ar ; //It acts as buffer to add phases of classes into each user's course list
	
	public static void main(String[] args) throws Exception
	{
		System.out.println(YELLOW_BACKGROUND+BLACK+"WELCOME TO NARESH i TECHNOLOGIES"+ANSI_RESET);
		System.out.println(BLACK_BACKGROUND+BLUE+"You Can Visit Any Course Given Below"+ANSI_RESET);
		System.out.println(YELLOW+"These are all available Long Term courses in our Institution.."+ANSI_RESET);
		System.out.println(YELLOW+"PRESS - 1 :"+ANSI_RESET+"FULLSTACK JAVA DEVELOPER\r\n"
							+YELLOW+"PRESS - 2 :"+ANSI_RESET+ "FULLSTACK .NET DEVELOPER\r\n"
							+YELLOW+"PRESS - 3 :"+ANSI_RESET+"FULLSTACK PYTHON\n"
							+YELLOW+"PRESS - 4 :"+ANSI_RESET+"FULLSTACK WEB DEVELOPMENT(MERN)\n"
							+YELLOW+"PRESS - 5 :"+ANSI_RESET+"FULLSTACK DATASCIENCE\n"
							+YELLOW+"PRESS - 11 :"+PURPLE+BLACK_BACKGROUND+ "GET INTO SIGN UP PAGE.. \n"+ANSI_RESET	
		);
		System.out.println("What do you want to Visit"+RED_BACKGROUND+"??"+ANSI_RESET);
		boolean temp = true;
		while(temp) {
			String choice = sc.next();
			if(Common.isNumeric(choice)) {
				switch(Integer.parseInt(choice)) {
					case 1:
						mobj.fullStackJava();
						break;
					case 2:
						mobj.fullStackDotNet();
						break;
					case 3:
						mobj.fullStackPython();
						break;
					case 4:
						mobj.fullStackWeb();
						break;
					case 5:
						mobj.fullStackDS();
						break;
					case 11:
						SignUp.Entry();
						break;
					default:
						System.out.println("Invalid choice!!!");
						System.out.println("please choose only available courses"+RED_BACKGROUND+"??"+ANSI_RESET);
				}
			}else {
				System.out.println("Invalid input!!!!!");
				System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
			}
			
		}
	}
}
