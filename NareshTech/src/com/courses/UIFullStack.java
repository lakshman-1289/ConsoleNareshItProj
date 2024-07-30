package com.courses;

import java.util.ArrayList;

import com.common.CommonToCourses;
import com.common.CourseListObject;
import com.common.LogObject;
import com.run.Main;
public interface UIFullStack extends CommonToCourses{
	static final String web1 = "UI basics(HTML,CSS,JS)";
	static final String web2 = "Database(mysql & MongoDB)";
	static final String web3 = "JQuery and Bootstrap";
	static final String web4 = "React and Angular";
	static final String web5 = "Node With ExpressJS";
	static final String web6 = "Web Services";
	static final String[] wfs = {web1,web2,web3,web4,web5,web6};
		
	public static void openWeb(LogObject user){
		String username = user.getUsername();
		ArrayList<CourseListObject> check_ar = new ArrayList<>();
		
		check_ar = CommonToCourses.check_user(username);
		
		Main.cnt = checkUser.get(username);  
		
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println("			FULL STACK WEB DEVELOPMENT				");
		CommonToCourses.display_classes(wfs);
		
		int chc = CommonToCourses.addOrDisplay(user);
		
		CommonToCourses.allCoursesMain(user, wfs, chc, check_ar);
	}

}

