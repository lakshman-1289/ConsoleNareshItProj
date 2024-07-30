package com.courses;

import java.util.ArrayList;

import com.common.CommonToCourses;
import com.common.CourseListObject;
import com.common.LogObject;
import com.run.Main;
public interface FullStackDataScience extends CommonToCourses{
	static final String ds1 = "python and R Language";
	static final String ds2 ="DataBases";
	static final String ds3 = "Statistics and Computer Vision";
	static final String ds4= "NLP";
	static final String ds5= "Data Analytics";
	static final String ds6= "Machine Learning";
	static final String ds7= "Deep Learning";
	static final String[] fds = {ds1,ds2,ds3,ds4,ds5,ds6,ds7};	
		
	public static void openDs(LogObject user){
		String username = user.getUsername();
		ArrayList<CourseListObject> check_ar = new ArrayList<>();
		
		check_ar = CommonToCourses.check_user(username);
		
		Main.cnt = checkUser.get(username);  
		
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println("			FULL STACK DATA SCIENCE				");
		CommonToCourses.display_classes(fds);
		
		int chc = CommonToCourses.addOrDisplay(user);
		
		CommonToCourses.allCoursesMain(user, fds, chc, check_ar);
	}
	
}

