package com.run;

import java.util.ArrayList;
import java.util.Date;

import com.common.Common;
import com.common.CourseListObject;
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
	public static ArrayList<CourseListObject> out_ar ; //It acts as buffer to add phases of classes into each user's course list
	
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO NARESH i TECHNOLOGIES");
		System.out.println("You Can Visit Any Course Given Below");
		System.out.println("These are all available Long Term courses in our Institution..");
		System.out.println("PRESS - 1 :"+"FULLSTACK JAVA DEVELOPER\r\n"
							+"PRESS - 2 :"+ "FULLSTACK .NET DEVELOPER\r\n"
							+"PRESS - 3 :"+"FULLSTACK PYTHON\n"
							+"PRESS - 4 :"+"FULLSTACK WEB DEVELOPMENT(MERN)\n"
							+"PRESS - 5 :"+"FULLSTACK DATASCIENCE\n"
							+"PRESS - 11 :"+"GET INTO SIGN UP PAGE.. \n"
		);
		System.out.println("What do you want to Visit"+"??");
		boolean temp = true;
		while(temp) {
				switch(Common.choice_validation()) {
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
						System.out.println("Invalid choice!!!..."+"Choose only available courses"+"??");
				}
		}
	}
}
