package com.courses;

import java.util.ArrayList;

import com.common.CommonToCourses;
import com.common.CourseListObject;
import com.common.LogObject;
import com.run.Main;
public interface DotNetFullStack extends CommonToCourses{
	static final String net1 = "C#.NET and ASP.NET Core";
	static final String net2 = "SQL Server";
	static final String net3 ="UI(HTML,CSS,JS)";
	static final String net4= "ADO.NET";
	static final String net5= "Angular and TypeScript";
	static final String net6= "LINQ";
	static final String net7= "Entity Framework";
	static final String[] dfs = {net1,net2,net3,net4,net5,net6,net7};
	
		
	public static void openNet(LogObject user){
		String username = user.getUsername();
		ArrayList<CourseListObject> check_ar = new ArrayList<>();
		
		check_ar = CommonToCourses.check_user(username);
		
		Main.cnt = checkUser.get(username);  
		
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println("			FULL STACK .NET				");
		CommonToCourses.display_classes(dfs);
		
		int chc = CommonToCourses.addOrRemove(user);
		
		CommonToCourses.allCoursesMain(user, dfs, chc, check_ar);
	}

}
