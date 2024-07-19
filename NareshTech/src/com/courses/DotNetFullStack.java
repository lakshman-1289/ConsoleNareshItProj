package com.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import com.common.Common;
import com.common.CommonToCourses;
import com.run.Main;
public interface DotNetFullStack extends CommonToCourses{
	static final String net1 = "C#.NET and ASP.NET Core";
	static final String net2 = "SQL Server";
	static final String net3 ="UI(HTML,CSS,JS)";
	static final String net4= "ADO.NET";
	static final String net5= "Angular and TypeScript";
	static final String net6= "LINQ";
	static final String net7= "Entity Framework";
	
		
	@SuppressWarnings("unchecked")
	public static void openNet(ArrayList<String> user) throws Exception {
		ArrayList<ArrayList<String>> check_ar = new ArrayList<>();
		String username = user.get(0);
		if(checkUser.get(username)==null) {
			checkUser.put(username, 0);
			all_users_courselist.put(username,null);
		}
		Main.cnt = checkUser.get(username);  
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println(BLACK_BACKGROUND+PURPLE+"				FULL STATCK JAVA				"+ANSI_RESET);
		System.out.println("This complete course divided into 3 phases.............");
		System.out.println(YELLOW+"PRESS 1 :"+ANSI_RESET+" PHASE-01[FIRST 2 MONTHS]:"+"\n"+net1+ "\n"+net2+"\n"+net3);
		System.out.println(YELLOW+"PRESS 2 :"+ANSI_RESET+" PHASE -02[NEXT 2 MONTHS]:"+"\n"+net4+ "\n"+net5);
		System.out.println(YELLOW+"PRESS 3 :"+ANSI_RESET+" PHASE -03[LAST 2 MONTHS]: "+"\n"+net6+"\n"+net7);
		System.out.println(YELLOW+"PRESS 4 :"+ANSI_RESET+" DISPLAY YOUR COURSE LIST");
		System.out.println("Which phase of Classes do you wanna Attend"+RED_BACKGROUND+"??"+ANSI_RESET);
		boolean temp=true;
		while(temp) {
			String choice = sc.next();
			if(Common.isNumeric(choice)) {
				switch(Integer.parseInt(choice)){
				case 1:
					CommonToCourses.check_course(user,net1); 
					
					if(checkUser.get(username) == 0) {
						Main.out_ar = new ArrayList<>();   
					}
					else {
						if(all_users_courselist.get(username).size() != 0) {
							Main.out_ar = all_users_courselist.get(username);    				
							check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
						}
					}
					
					CommonToCourses.facaulty_selection(username,course,net1);
					CommonToCourses.facaulty_selection(username,course,net2);
					CommonToCourses.facaulty_selection(username,course,net3);
							
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username));  //user_facaulty
					
					CommonToCourses.display_list(user,3);
					CommonToCourses.addTimingToEachClass(username,net1);
					CommonToCourses.addTimingToEachClass(username,net2);
					CommonToCourses.addTimingToEachClass(username,net3);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 2:
					CommonToCourses.check_course(user,net4);
					
				    if(checkUser.get(username) == 0) {
						Main.out_ar = new ArrayList<>();    
					}
				    else {
						if(all_users_courselist.get(username).size() != 0) {
							Main.out_ar = all_users_courselist.get(username);
							check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
						}
					}
				    
				    CommonToCourses.facaulty_selection(username,course,net4);
				    CommonToCourses.facaulty_selection(username,course,net5);
		
				    CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
					
				    CommonToCourses.display_list(user,2);
				    CommonToCourses.addTimingToEachClass(username,net4);
				    CommonToCourses.addTimingToEachClass(username,net5);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 3:
					CommonToCourses.check_course(user,net6);
					
					if(checkUser.get(username) == 0) {
						Main.out_ar = new ArrayList<>();    
					}
					else {
						if(all_users_courselist.get(username).size() != 0) {
							Main.out_ar = all_users_courselist.get(username);
							check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
						}
					}

					CommonToCourses.facaulty_selection(username,course,net6);
					CommonToCourses.facaulty_selection(username,course,net7);
					
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
					
					CommonToCourses.display_list(user,2);
					CommonToCourses.addTimingToEachClass(username,net6);
					CommonToCourses.addTimingToEachClass(username,net7);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 4:
					temp =false;
					CommonToCourses.display_list(user);
					break;
				default:
					System.out.println("Invalid choice!!");
			}
			}else {
				System.out.println("Invalid input!!!!!");
				System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
			}
		} 
	}

}
