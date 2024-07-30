package com.courses;

import java.util.ArrayList;

import com.common.CommonToCourses;
import com.common.CourseListObject;
import com.common.LogObject;
import com.run.Main;
public interface PythonFullStack extends CommonToCourses{
	static final String python1 = "Python";
	static final String python2 = "UI(HTML,CSS,JS)";
	static final String python3 ="Database";
	static final String python4= "Django";
	static final String python5= "Angular";
	static final String python6= "RestAPI";
	static final String[] pfs = {python1,python2,python3,python4,python4,python5,python6};	
		
	public static void openPython(LogObject user){
		String username = user.getUsername();
		ArrayList<CourseListObject> check_ar = new ArrayList<>();
		
		check_ar = CommonToCourses.check_user(username);
		
		Main.cnt = checkUser.get(username);  
		
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println("			PYTHON FULL STACK 				");
		CommonToCourses.display_classes(pfs);
		
		int chc = CommonToCourses.addOrDisplay(user);
		
		CommonToCourses.allCoursesMain(user, pfs, chc, check_ar);
	}

}
