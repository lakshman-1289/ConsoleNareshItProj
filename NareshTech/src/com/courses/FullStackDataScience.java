package com.courses;

import java.util.ArrayList;
import java.util.HashMap;

import com.common.Common;
import com.common.CommonToCourses;
import com.run.Main;
public interface FullStackDataScience extends CommonToCourses{
	static final String ds1 = "python and R Language";
	static final String ds2 ="DataBases";
	static final String ds3 = "Statistics and Computer Vision";
	static final String ds4= "NLP";
	static final String ds5= "Data Analytics";
	static final String ds6= "Machine Learning";
	static final String ds7= "Deep Learning";
	
		
	@SuppressWarnings("unchecked")
	public static void openDs(ArrayList<String> user) throws Exception {
		ArrayList<ArrayList<String>> check_ar = new ArrayList<>();
		String username = user.get(0);
		if(checkUser.get(username)==null) {
			checkUser.put(username, 0);
			all_users_courselist.put(username,null);
		}
		Main.cnt = checkUser.get(username);  
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);//----------------------------------
		System.out.println(BLACK_BACKGROUND+PURPLE+"				FULL STATCK JAVA				"+ANSI_RESET);
		System.out.println("This complete course divided into 3 phases.............");
		System.out.println(YELLOW+"PRESS 1 :"+ANSI_RESET+" PHASE-01[FIRST 2 MONTHS]:"+"\n"+ds1+ "\n"+ds2+"\n"+ds3);
		System.out.println(YELLOW+"PRESS 2 :"+ANSI_RESET+" PHASE -02[NEXT 2 MONTHS]:"+"\n"+ds4+ "\n"+ds5);
		System.out.println(YELLOW+"PRESS 3 :"+ANSI_RESET+" PHASE -03[LAST 2 MONTHS]: "+"\n"+ds6+"\n"+ds7);
		System.out.println(YELLOW+"PRESS 4 :"+ANSI_RESET+" DISPLAY YOUR COURSE LIST");
		System.out.println("Which phase of Classes do you wanna Attend"+RED_BACKGROUND+"??"+ANSI_RESET);
		boolean temp=true;
		while(temp) {
			String choice = sc.next();
			if(Common.isNumeric(choice)) {
				switch(Integer.parseInt(choice)){
				case 1:
					CommonToCourses.check_course(user,ds1);  
					
					if(checkUser.get(username) == 0) {
						Main.out_ar = new ArrayList<>();   
					}
					else {
						if(all_users_courselist.get(username).size() != 0) {
							Main.out_ar = all_users_courselist.get(username);   
							check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
						}
					}
					
					CommonToCourses.facaulty_selection(username,course,ds1);
					CommonToCourses.facaulty_selection(username,course,ds2);
					CommonToCourses.facaulty_selection(username,course,ds3);
							
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username));  
	
					CommonToCourses.display_list(user,3);
					CommonToCourses.addTimingToEachClass(username,ds1);
					CommonToCourses.addTimingToEachClass(username,ds2);
					CommonToCourses.addTimingToEachClass(username,ds3);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 2:
					CommonToCourses.check_course(user,ds4);
					
				    if(checkUser.get(username) == 0) {
						Main.out_ar = new ArrayList<>();    
					}
				    else {
						if(all_users_courselist.get(username).size() != 0) {
							Main.out_ar = all_users_courselist.get(username);
							check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
						}
					}
				    
				    CommonToCourses.facaulty_selection(username,course,ds4);
				    CommonToCourses.facaulty_selection(username,course,ds5);
		
				    CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
					
				    CommonToCourses.display_list(user,2);
				    CommonToCourses.addTimingToEachClass(username,ds4);
				    CommonToCourses.addTimingToEachClass(username,ds5);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 3:
					CommonToCourses.check_course(user,ds6);
					
					if(checkUser.get(username) == 0) {
						Main.out_ar = new ArrayList<>();    
					}
					else {
						if(all_users_courselist.get(username).size() != 0) {
							Main.out_ar = all_users_courselist.get(username);
							check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
						}
					}

					CommonToCourses.facaulty_selection(username,course,ds6);
					CommonToCourses.facaulty_selection(username,course,ds7);
					
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
					
					CommonToCourses.display_list(user,2);
					CommonToCourses.addTimingToEachClass(username,ds6);
					CommonToCourses.addTimingToEachClass(username,ds7);
					
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

