package com.courses;

import java.util.ArrayList;

import com.common.CommonToCourses;
import com.common.CourseListObject;
import com.common.LogObject;
import com.run.Main;
public interface JavaFullStack extends CommonToCourses{
	static final String java1 = "core java";
	static final String java2 = "Oracle";
	static final String java3 = "UI(HTML,CSS,JS)";
	static final String java4 = "Advance Java";
	static final String java5 = "React";
	static final String java6 = "Spring";
	static final String java7 = "DevSecOps tools";
	static final String[] jfs = {java1,java2,java3,java4,java5,java6,java7};
		
	//java full stack all processing method
	public static void openJava(LogObject user){
		String username = user.getUsername();
		ArrayList<CourseListObject> check_ar = new ArrayList<>();
		
		check_ar = CommonToCourses.check_user(username);
		
		Main.cnt = checkUser.get(username);  
		
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println("			FULL STACK JAVA				");
		CommonToCourses.display_classes(jfs);
		
		int chc = CommonToCourses.addOrRemove(user);
		
		CommonToCourses.allCoursesMain(user, jfs, chc, check_ar);
		 
	}

}
