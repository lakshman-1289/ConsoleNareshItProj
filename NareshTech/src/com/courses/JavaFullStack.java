package com.courses;

import java.util.ArrayList;

import com.common.Common;
import com.common.CommonToCourses;
import com.run.Main;
public interface JavaFullStack extends CommonToCourses{
	static final String java1 = "core java";
	static final String java2 = "Oracle";
	static final String java3 = "UI(HTML,CSS,JS)";
	static final String java4 = "Advance Java";
	static final String java5 = "React";
	static final String java6 = "Spring";
	static final String java7 = "DevSecOps tools";
		
	//java full stack all processing method
	@SuppressWarnings("unchecked")
	public static void openJava(ArrayList<String> user) throws Exception {
		ArrayList<ArrayList<String>> check_ar = new ArrayList<>();
		String username = user.get(0);
		if(checkUser.get(username)==null) {
			checkUser.put(username, 0);
			all_users_courselist.put(username,null);
		}
		if(checkUser.get(username) == 0) {
			Main.out_ar = new ArrayList<>();    //logic here------------new object initialization to new user 
		}
		else {
			if(all_users_courselist.get(username).size() != 0) {
				Main.out_ar = all_users_courselist.get(username);   //-----------common array used to store with existed courses and update later for each user 
				/*
				//to store data(actually need copy data)
				check_ar = user_list.get(username);  				//-------call by reference ---trail-1 wrong
				for(ArrayList<String> ele : user_list.get(username))   //-------call by value(copy data) ---trail-2 correct
				{  
					ArrayList<String> t = ele;
					check_ar.add(t);
				}
				*/
				check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();//copy data using clone method ---trail-3 simple way					
			}
		}
		Main.cnt = checkUser.get(username);  
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);//----------------------------------
		System.out.println(BLACK_BACKGROUND+PURPLE+"				FULL STATCK JAVA				"+ANSI_RESET);
		System.out.println("This complete course divided into 3 phases.............");
		System.out.println(YELLOW+"PRESS 1 :"+ANSI_RESET+" PHASE-01[FIRST 2 MONTHS]:"+"\n"+java1+ "\n"+java2+"\n"+java3);
		System.out.println(YELLOW+"PRESS 2 :"+ANSI_RESET+" PHASE -02[NEXT 2 MONTHS]:"+"\n"+java4+ "\n"+java5);
		System.out.println(YELLOW+"PRESS 3 :"+ANSI_RESET+" PHASE -03[LAST 2 MONTHS]: "+"\n"+java6+"\n"+java7);
		System.out.println(YELLOW+"PRESS 4 :"+ANSI_RESET+" DISPLAY YOUR COURSE LIST");
		System.out.println("Which phase of Classes do you wanna Attend"+RED_BACKGROUND+"??"+ANSI_RESET);
		boolean temp=true;
		while(temp) {
			String choice = sc.next();
			if(Common.isNumeric(choice)) {
				switch(Integer.parseInt(choice)){
				case 1:
					CommonToCourses.check_course(user,java1);  
					
					CommonToCourses.facaulty_selection(username,course,java1);
					CommonToCourses.facaulty_selection(username,course,java2);
					CommonToCourses.facaulty_selection(username,course,java3);
							
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username));  //user_facaulty
	
					CommonToCourses.display_list(user,3);
					CommonToCourses.addTimingToEachClass(username,java1);
					CommonToCourses.addTimingToEachClass(username,java2);
					CommonToCourses.addTimingToEachClass(username,java3);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 2:
					CommonToCourses.check_course(user,java4);
				    
				    CommonToCourses.facaulty_selection(username,course,java4);
				    CommonToCourses.facaulty_selection(username,course,java5);
		
				    CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
					
				    CommonToCourses.display_list(user,2);
				    CommonToCourses.addTimingToEachClass(username,java4);
				    CommonToCourses.addTimingToEachClass(username,java5);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 3:
					CommonToCourses.check_course(user,java6);
					
					CommonToCourses.facaulty_selection(username,course,java6);
					CommonToCourses.facaulty_selection(username,course,java7);
					
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
					
					CommonToCourses.display_list(user,2);
					CommonToCourses.addTimingToEachClass(username,java6);
					CommonToCourses.addTimingToEachClass(username,java7);
					
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
