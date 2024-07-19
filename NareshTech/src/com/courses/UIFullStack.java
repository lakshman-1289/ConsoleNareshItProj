package com.courses;

import java.util.ArrayList;

import com.common.Common;
import com.common.CommonToCourses;
import com.run.Main;
public interface UIFullStack extends CommonToCourses{
	static final String web1 = "UI basics(HTML,CSS,JS)";
	static final String web2 = "Database(mysql & MongoDB)";
	static final String web3 = "JQuery and Bootstrap";
	static final String web4 = "React and Angular";
	static final String web5 = "Node With ExpressJS";
	static final String web6 = "Web Services";
	
		
	 @SuppressWarnings("unchecked")
	public static void openWeb(ArrayList<String> user) throws Exception {
		ArrayList<ArrayList<String>> check_ar = new ArrayList<>();
		String username = user.get(0);
		if(checkUser.get(username)==null) {
			checkUser.put(username, 0);
			all_users_courselist.put(username,null);
		}
		if(checkUser.get(username) == 0) {
			Main.out_ar = new ArrayList<>();   
		}
		else {
			if(all_users_courselist.get(username).size() != 0) {
				Main.out_ar = all_users_courselist.get(username);   
				check_ar = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
			}
		}
		Main.cnt = checkUser.get(username);  
		System.out.println("\n\nName : "+username+"   		no of courses in your list:"+Main.cnt);
		System.out.println(BLACK_BACKGROUND+PURPLE+"				UI FULL STATCK 				"+ANSI_RESET);
		System.out.println("This complete course divided into 3 phases.............");
		System.out.println(YELLOW+"PRESS 1 :"+ANSI_RESET+" PHASE-01[FIRST 2 MONTHS]:\n"+web1+ "\n"+web2);
		System.out.println(YELLOW+"PRESS 2 :"+ANSI_RESET+" PHASE -02[NEXT 2 MONTHS]: \n"+web3+"\n"+web4);
		System.out.println(YELLOW+"PRESS 3 :"+ANSI_RESET+" PHASE -03[LAST 2 MONTHS]: \n"+web5+ "\n"+web6);
		System.out.println(YELLOW+"PRESS 4 :"+ANSI_RESET+" DISPLAY YOUR COURSE LIST");
		System.out.println("Which phase of Classes do you wanna Attend"+RED_BACKGROUND+"??"+ANSI_RESET);
		boolean temp=true;
		while(temp) {
			String choice = sc.next();
			if(Common.isNumeric(choice)) {
				switch(Integer.parseInt(choice)){
				case 1:
					CommonToCourses.check_course(user,web1); 
					
					CommonToCourses.facaulty_selection(username,course,web1);
					CommonToCourses.facaulty_selection(username,course,web2);
										
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
				
					CommonToCourses.display_list(user,2);
					CommonToCourses.addTimingToEachClass(username,web1);
					CommonToCourses.addTimingToEachClass(username,web2);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 2:
					CommonToCourses.check_course(user,web3);
					
				    CommonToCourses.facaulty_selection(username,course,web3);
				    CommonToCourses.facaulty_selection(username,course,web4);
			
				    CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
				
				    CommonToCourses.display_list(user,2);
				    CommonToCourses.addTimingToEachClass(username,web3);
				    CommonToCourses.addTimingToEachClass(username,web4);
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					temp=false;
					CommonToCourses.display_list(user);
					break;
				case 3:
					CommonToCourses.check_course(user,web5);
			
					CommonToCourses.facaulty_selection(username,course,web5);
					CommonToCourses.facaulty_selection(username,course,web6);
					
					CommonToCourses.display_iterations(iterator_timings,all_users_courselist.get(username),2);
				
					CommonToCourses.display_list(user,2);
					CommonToCourses.addTimingToEachClass(username,web5);
					CommonToCourses.addTimingToEachClass(username,web6);
					
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

