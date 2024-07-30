package com.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import com.courses.DotNetFullStack;
import com.courses.FullStackDataScience;
import com.courses.JavaFullStack;
import com.courses.PythonFullStack;
import com.courses.UIFullStack;
import com.run.Main;

public interface CommonToCourses extends Common{
		HashMap<String,HashMap<String,List<String>>> course = new HashMap<String,HashMap<String,List<String>>>();
		//java
		HashMap<String,List<String>> cjf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> ojf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> hjf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> ajf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> rjf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> sjf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> djf = new HashMap<String,List<String>>();
		
		//python
		HashMap<String,List<String>> ppf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> hpf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> opf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> dpf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> apf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> rpf = new HashMap<String,List<String>>();
		
		//.net
		HashMap<String,List<String>> cdf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> odf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> hdf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> addf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> tdf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> ndf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> edf = new HashMap<String,List<String>>();
		
		//web
		HashMap<String,List<String>> huf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> duf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> juf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> ruf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> nuf = new HashMap<String,List<String>>();
		HashMap<String,List<String>> wuf = new HashMap<String,List<String>>();
		
		//Data Science
		HashMap<String,List<String>> pds = new HashMap<String,List<String>>();
		HashMap<String,List<String>> dds = new HashMap<String,List<String>>();
		HashMap<String,List<String>> sds = new HashMap<String,List<String>>();
		HashMap<String,List<String>> nds = new HashMap<String,List<String>>();
		HashMap<String,List<String>> ads = new HashMap<String,List<String>>();
		HashMap<String,List<String>> mds = new HashMap<String,List<String>>();
		HashMap<String,List<String>> dl = new HashMap<String,List<String>>();
		
		List<String> timings = (List<String>) Arrays.asList("7:30am","9:30am","11:30am","2:15pm","4:15pm","6:15pm","8:15pm");

		
		//Enter Into User's Course
		static void intoCourse(LogObject user){
				String s = user.getUserCourse();
				switch(s) {
					case java:
						JavaFullStack.openJava(user);break;
					case net:
						DotNetFullStack.openNet(user);break;
					case python:
						PythonFullStack.openPython(user);break;
					case web:
						UIFullStack.openWeb(user);break;
					case ds:
						FullStackDataScience.openDs(user);break;
				}
			}
		
		//It maintains list of timings of selected Trainers (used for display all combinations)..
		List<List<String>> iterator_timings = new ArrayList<>();
		
		//Maintain size of user's course list and update "cnt variable" everytime
		HashMap<String,Integer> checkUser = new HashMap<>();
		
		
		@SuppressWarnings("unchecked")
		static ArrayList<CourseListObject> check_user(String username) {
			ArrayList<CourseListObject> check_ar = new ArrayList<>();
			if(checkUser.get(username)==null) {
				checkUser.put(username, 0);
				all_users_courselist.put(username,null);
			}
			if(checkUser.get(username) == 0) {
				Main.out_ar = new ArrayList<>();   
			}
			else {
				//do you want to attend some more classes
				Main.out_ar = all_users_courselist.get(username);   
				check_ar = (ArrayList<CourseListObject>) all_users_courselist.get(username).clone();
				return check_ar;
			}
			return check_ar;
		}
		
		static void display_classes(String[] fds) {
			for(int i=0; i<fds.length; i++)
				System.out.println("			"+fds[i]);
			System.out.println();
		}
		
		static int addOrRemove(LogObject user){
			System.out.println("Enter D for DISPLAY YOUR COURSE LIST");
			System.out.println("Enter A for ADD CLASSES INTO YOUR COURSE LIST");
			System.out.println("?????????????????????????????????????????????");
			int chc = 100;
			boolean flag = true;
			while(flag) {
				String choice = sc.next().toLowerCase();
				switch(choice) {
					case "d":
						flag =false;
						CommonToCourses.display_list(user);
						break;
					case "a":flag =false;
						System.out.println("No of Classes...Do you Wanna Attend??");
						chc = Common.choice_validation();
						boolean flag1 =true;
						while(flag1) {
							if(chc>4) {
								System.out.println("At a Time, We can add Atmost 4 classes into your courseList....");
								System.out.println("If you want to Attend more...Try once again after adding 4 classes..");
								chc =Common.choice_validation();
							}
							else {
								flag1= false;
							}
						}
						break;
					default:System.out.println("Invalid choice....only 'd' or 'a' only accepts as input..");
				}
			}
			return chc;
		}
		
		static void allCoursesMain(LogObject user,String[] fds,int chc,ArrayList<CourseListObject> check_ar ){
			String username = user.getUsername();
			LinkedHashSet<String> sel_list = new LinkedHashSet<String>();
			if(fds.length == 7)
				sel_list = CommonToCourses.select_courses(fds,chc);
			else
				sel_list = CommonToCourses.select_courses(fds, chc, 6);
				
			ArrayList<String> list = new ArrayList<String>(sel_list);
			
			int n = list.size();
			
			switch(n) {
				case 1:
					CommonToCourses.check_course(user,list.get(0));
					CommonToCourses.facaulty_selection(username,list.get(0));
					CommonToCourses.display_iterations(username);
					CommonToCourses.display_list(user,1);
					CommonToCourses.addTimingToEachClass(username,list.get(0));
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					CommonToCourses.display_list(user);
					break;
				case 2:
					for(int i=0; i<n; i++) {
						CommonToCourses.check_course(user,list.get(i));
					}
					
					for(int i=0; i<n; i++) {
						CommonToCourses.facaulty_selection(username,list.get(i));
					}
					
				    CommonToCourses.display_iterations(username,2);
					
				    CommonToCourses.display_list(user,2);
				    
				    for(int i=0; i<n; i++) {
				    	CommonToCourses.addTimingToEachClass(username,list.get(i));
				    }
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					CommonToCourses.display_list(user);
					break;
					
				case 3:
					for(int i=0; i<n; i++) {
						CommonToCourses.check_course(user,list.get(i));
					}
					
					for(int i=0; i<n; i++) {
						CommonToCourses.facaulty_selection(username,list.get(i));
					}
					
				    CommonToCourses.display_iterations(username,3.3F);
					
				    CommonToCourses.display_list(user,3);
				    
				    for(int i=0; i<n; i++) {
				    	CommonToCourses.addTimingToEachClass(username,list.get(i));
				    }
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					CommonToCourses.display_list(user);
					break;
					
				case 4:
					for(int i=0; i<n; i++) {
						CommonToCourses.check_course(user,list.get(i));
					}
					
					for(int i=0; i<n; i++) {
						CommonToCourses.facaulty_selection(username,list.get(i));
					}
					
				    CommonToCourses.display_iterations(username,"dummy");
					
				    CommonToCourses.display_list(user,4);
				    
				    for(int i=0; i<n; i++) {
				    	CommonToCourses.addTimingToEachClass(username,list.get(i));
				    }
					
					CommonToCourses.check_timings(user,check_ar);
					checkUser.put(username,Main.cnt);
					CommonToCourses.display_list(user);
					break;
			}
		}
		
		static LinkedHashSet<String> select_courses(String[] fullStack,int no) {
			LinkedHashSet<String> res = new LinkedHashSet<>();
				System.out.println("PRESS-01: "+fullStack[0]);
				System.out.println("PRESS-02: "+fullStack[1]);
				System.out.println("PRESS-03: "+fullStack[2]);
				System.out.println("PRESS-04: "+fullStack[3]);
				System.out.println("PRESS-05: "+fullStack[4]);
				System.out.println("PRESS-06: "+fullStack[5]);
				System.out.println("PRESS-07: "+fullStack[6]);
			
				System.out.println("Which classes do you wanna attend...Choose Below??");
				for(int i=0; i<no; i++) {
					System.out.print("Class-0"+(i+1)+": ");
					switch(Common.choice_validation()) {
					case 1: res.add(fullStack[0]) ;break;
					case 2: res.add(fullStack[1]) ;break;
					case 3: res.add(fullStack[2]) ;break;
					case 4: res.add(fullStack[3]) ;break;
					case 5: res.add(fullStack[4]) ;break;
					case 6: res.add(fullStack[5]) ;break;
					case 7: res.add(fullStack[6]) ;break;
					default:System.out.println("Invalid choice!!");i--;
					}
				}
				
			return res;
		}
		
		static LinkedHashSet<String> select_courses(String[] fullStack,int no,int dummy) {
			LinkedHashSet<String> res = new LinkedHashSet<>();
				System.out.println("PRESS-01: "+fullStack[0]);
				System.out.println("PRESS-02: "+fullStack[1]);
				System.out.println("PRESS-03: "+fullStack[2]);
				System.out.println("PRESS-04: "+fullStack[3]);
				System.out.println("PRESS-05: "+fullStack[4]);
				System.out.println("PRESS-06: "+fullStack[5]);
			
				System.out.println("Which classes do you wanna attend...Choose Below??");
				for(int i=0; i<no; i++) {
					System.out.print("Class-0"+(i+1)+": ");
					switch(Common.choice_validation()) {
					case 1: res.add(fullStack[0]) ;break;
					case 2: res.add(fullStack[1]) ;break;
					case 3: res.add(fullStack[2]) ;break;
					case 4: res.add(fullStack[3]) ;break;
					case 5: res.add(fullStack[4]) ;break;
					case 6: res.add(fullStack[5]) ;break;
					default:System.out.println("Invalid choice!!");i--;
					}
				}
				
			return res;
		}
	
		//Checking the phase of classes already existed or not in the user's course list
		static void check_course(LogObject user,String cls){
			String uname = user.getUsername();
			String c = user.getUserCourse();
			if(all_users_courselist.get(uname) == null)
				return;
			ArrayList<CourseListObject> temp = new ArrayList<>();
			temp = all_users_courselist.get(uname);
			for(CourseListObject ele : temp) {
				if(ele.getSubject().equals(cls)) {
					System.out.println("ALREADY EXISTED CLASSES ");
					System.out.println("REMINDER");
					System.out.println("Everytime While adding classes,check already existed CLASSES AND THEIR TIMINGS in your COURSE LIST(By pressing 'D')");
					switch(c) {
						case java:
							JavaFullStack.openJava(user);break;
						case net:
							DotNetFullStack.openNet(user);break;
						case python:
							PythonFullStack.openPython(user);break;
						case web:
							UIFullStack.openWeb(user);break;
						case ds:
							FullStackDataScience.openDs(user);break;
					}

				}
			}
		 }
		
		//Trainer Selection and store in user's course list
		static void facaulty_selection(String username,String cls){
			System.out.println("Available Trainers to "+cls); 
			HashMap<String,List<String>> val = course.get(cls);
			for(Map.Entry m : val.entrySet()){    
			    //System.out.println(m.getKey()); 
			    System.out.printf("%-30s==>%-50s\n",m.getKey(),m.getValue());
			}  

			CourseListObject cobj = new CourseListObject();
			cobj.setSubject(cls);
			System.out.print("Select and Enter your Trainer name: ");
			String trainer =null;
			boolean flag = true;
			while(flag) {
				int count =0;
				trainer = sc.nextLine().trim();
				for(Map.Entry m : val.entrySet()){    
				    if(trainer.equalsIgnoreCase(m.getKey().toString())) {
				    	trainer=m.getKey().toString();
				    	count++;
				    	break;
				    }
				}
				if(trainer != "") {
					if(count>0) {
						cobj.setTrainer(trainer);
						flag = false;
					}
					else {
						System.out.print("Choose only available Trainer : ");
					}
				}else {
					System.out.print("You should enter your Trainer name :");
				}
			}
			Main.out_ar.add(cobj);
			
			all_users_courselist.put(username,Main.out_ar);
			iterator_timings.add(course.get(cls).get(trainer));
		}
		
		//Method to Displays all possible combinational set of timings of phase having 3 classes
		static void display_iterations(String username) {
			List<List<String>> it1 = iterator_timings;
			System.out.println("				All available set of timings..				");
			System.out.println("			Choose your comfortable timing 		");
			System.out.println("=======================================");
				for(int m=0;m<it1.get(0).size(); m++) {
					System.out.println(all_users_courselist.get(username).get(Main.cnt).getSubject() +" : "+it1.get(0).get(m)+"\t\t");
				}
				System.out.println("=======================================");
			it1.clear();//----------------------------
		}
		
		//Method to Displays all possible combinational set of timings of phase having 2 classes
		static void display_iterations(String username,int dummy) {
			List<List<String>> it2 = iterator_timings;
			System.out.println("				All available set of timings..				");
			System.out.println("			Choose your comfortable timing set		");
			System.out.println("==========================================================================================");
			for(int i=0; i<it2.get(0).size(); i++)
			{
				ArrayList<String> temp =new ArrayList<String>();
				temp.add(it2.get(0).get(i));
				for(int j=0; j<it2.get(1).size(); j++)
				{
					if(temp.contains(it2.get(1).get(j)))
						continue;
					temp.add(it2.get(1).get(j));
					System.out.println("-------------------------------------------------------------------------------------------");
						for(int l=Main.cnt,m=0; l<all_users_courselist.get(username).size(); l++,m++) {
							System.out.print(all_users_courselist.get(username).get(l).getSubject() +" : "+temp.get(m)+"\t\t");
						}
						System.out.println();
						
					temp.remove(temp.indexOf(it2.get(1).get(j)));
				}
				temp.clear();
			}
			System.out.println("\n==========================================================================================");
			it2.clear();//---------------------
			
			System.out.println("REMINDER");
			System.out.println("You must choose ALL class timings from"+" ONLY ONE "+" of the displayed sets above");
		}
		
		//Method to Displays all possible combinational set of timings of phase having 3 classes
		static void display_iterations(String username,float x) {
			List<List<String>> it3 = iterator_timings;
			System.out.println("				All available set of timings..				");
			System.out.println("			Choose your comfortable timing set		");
			System.out.println("==========================================================================================");
			for(int i=0; i<it3.get(0).size(); i++)
			{
				ArrayList<String> temp =new ArrayList<String>();
				temp.add(it3.get(0).get(i));
				for(int j=0; j<it3.get(1).size(); j++)
				{
					if(temp.contains(it3.get(1).get(j)))
						continue;
					temp.add(it3.get(1).get(j));
					for(int k=0; k<it3.get(2).size(); k++)
					{
						if(temp.contains(it3.get(2).get(k)))
							continue;
						temp.add(it3.get(2).get(k));
						System.out.println("-------------------------------------------------------------------------------------------");
						for(int l=Main.cnt,m=0; l<all_users_courselist.get(username).size(); l++,m++) {
							System.out.print(all_users_courselist.get(username).get(l).getSubject() +" : "+temp.get(m)+"\t\t");
						}
						System.out.println();
						temp.remove(temp.indexOf(it3.get(2).get(k)));
					}
					temp.remove(temp.indexOf(it3.get(1).get(j)));
				}
				temp.clear();
			}
			System.out.println("\n==========================================================================================");
			it3.clear();//----------------------------
			
			System.out.println("REMINDER");
			System.out.println("You must choose ALL class timings from"+" ONLY ONE "+" of the displayed sets above");
		}
		
		//Method to Displays all possible combinational set of timings of phase having 4 classes
		static void display_iterations(String username,String s) {
			List<List<String>> it4 = iterator_timings;
			System.out.println("				All available set of timings..				");
			System.out.println("			Choose your comfortable timing set		");
			System.out.println("==============================================================================================================");
			for(int i=0; i<it4.get(0).size(); i++)
			{
				ArrayList<String> temp =new ArrayList<String>();
				temp.add(it4.get(0).get(i));
				for(int j=0; j<it4.get(1).size(); j++)
				{
					if(temp.contains(it4.get(1).get(j)))
						continue;
					temp.add(it4.get(1).get(j));
					for(int h=0; h<it4.get(2).size(); h++)
					{
						if(temp.contains(it4.get(2).get(h)))
							continue;
						temp.add(it4.get(2).get(h));
						for(int k=0; k<it4.get(3).size(); k++)
						{
							if(temp.contains(it4.get(3).get(k)))
								continue;
							temp.add(it4.get(3).get(k));
							System.out.println("---------------------------------------------------------------------------------------------------------------");
							for(int l=Main.cnt,m=0; l<all_users_courselist.get(username).size(); l++,m++) {
								System.out.print(all_users_courselist.get(username).get(l).getSubject() +" : "+temp.get(m)+"\t\t");
							}
							System.out.println();
							temp.remove(temp.indexOf(it4.get(3).get(k)));
						}
						temp.remove(temp.indexOf(it4.get(2).get(h)));
					}
					temp.remove(temp.indexOf(it4.get(1).get(j)));
				}
				temp.clear();
			}
			System.out.println("\n==============================================================================================================");
			it4.clear();//----------------------------
			
			System.out.println("REMINDER");
			System.out.println("You must choose ALL class timings from"+" ONLY ONE "+" of the displayed sets above");
		}
		
		
		//Timings Selection
		static void addTimingToEachClass(String username,String c) {
			System.out.print("Enter your timing for "+c+" class: ");
			boolean flag = true;
			while(flag) {
				String time =sc.next().trim();
				if(timings.contains(time)) {
					all_users_courselist.get(username).get(Main.cnt++).setTimeSlot(time);;
					flag = false;
				}
				else {
					System.out.print("Choose only available Timings of "+c+": ");
				}
				
			}
		 }
		
				
		//method used to display existed course list of user every time before getting timings to new phase of classes into course list
		static void display_list(LogObject user,int x){
			String username = user.getUsername();
			System.out.println("===================================================================================");
			System.out.println("							DEAR STUDENT,"+username.toUpperCase());
			System.out.println("				"+"YOUR COURSE LIST"+"							");
			ArrayList<CourseListObject> all = all_users_courselist.get(username);
			if(all_users_courselist.get(username) == null) { 
				System.out.println("				"+"No Phase of classes Added yet");
			}
			else {
				@SuppressWarnings("unchecked")
				ArrayList<CourseListObject> temp = (ArrayList<CourseListObject>) all_users_courselist.get(username).clone();
				if(temp.get(0).getTimeSlot() == null) {
					System.out.println("				"+"No Phase of classes Added yet");
				}
				else {
					for(int i=0; i<all.size()-x; i++) {
						System.out.printf(" 		%-25s%-25s%-25s\n",all.get(i).getSubject(),all.get(i).getTrainer(),all.get(i).getTimeSlot());
					}
				}
			}
			System.out.println("===================================================================================");
		}
		
		//Checking the new phase of timings collapse with existed timings or not
		@SuppressWarnings("unchecked")
		static void check_timings(LogObject user,ArrayList<CourseListObject> check_ar)
		{
			String uname = user.getUsername();
			String c = user.getUserCourse();
			if(all_users_courselist.get(uname) == null)
				return;
			ArrayList<CourseListObject> temp = new ArrayList<>();
			temp = (ArrayList<CourseListObject>) all_users_courselist.get(uname).clone();
			for(int i=0; i<temp.size()-1; i++) {
				for(int j=i+1; j<temp.size(); j++) {
					if(temp.get(i).getTimeSlot().equals(temp.get(j).getTimeSlot())) {
						all_users_courselist.put(uname,check_ar);//-----------------------------------------------
						System.out.println("Timings Overlapped!!");
						System.out.println("REMINDER");
						System.out.println("Everytime While adding classes,check already existed CLASSES AND THEIR TIMINGS in your COURSE LIST(By pressing D)");
						switch(c) {
							case java:
								JavaFullStack.openJava(user);break;
							case net:
								DotNetFullStack.openNet(user);break;
							case python:
								PythonFullStack.openPython(user);break;
							case web:
								UIFullStack.openWeb(user);break;
							case ds:
								FullStackDataScience.openDs(user);break;
						}

					}
				}
			}
		}
		

		
		//This is used to display course list of user after adding phase successfully and also when calls manually(pressing-4)
		static void display_list(LogObject user)
		{
			String username = user.getUsername();
			System.out.println("===================================================================================");
			System.out.println("							DEAR STUDENT,"+username.toUpperCase());
			System.out.println("				"+"YOUR COURSE LIST"+"							");
			ArrayList<CourseListObject> all = all_users_courselist.get(username);
			if(all_users_courselist.get(username) == null) {    //overcome exception "java.util.ArrayList.size()"
				System.out.println("				"+"No Phase of classes Added yet");
			}
			else {
				@SuppressWarnings("unchecked")
				ArrayList<CourseListObject> temp = (ArrayList<CourseListObject>) all_users_courselist.get(username).clone();
				if(temp.get(0).getTimeSlot() == null) {
					System.out.println("				"+"No Phase of classes Added yet");
				}
				else {
					for(int i=0; i<all.size(); i++) {
						System.out.printf(" 		%-25s%-25s%-25s\n",all.get(i).getSubject(),all.get(i).getTrainer(),all.get(i).getTimeSlot());
					}
				}
			}
			System.out.println("===================================================================================");
			System.out.println();
			System.out.println("Choose your Option Again");
			System.out.println(" If You Wanna Attend some more classes then "+"PRESS 1:");
			System.out.println("For LOG OUT"+" PRESS 2:");
			boolean temp = true;
				while(temp) {
						switch(Common.choice_validation()) {
						case 1: 
							String s = user.getUserCourse();
							switch(s) {
								case java:
									JavaFullStack.openJava(user);break;
								case net:
									DotNetFullStack.openNet(user);break;
								case python:
									PythonFullStack.openPython(user);break;
								case web:
									UIFullStack.openWeb(user);break;
								case ds:
									FullStackDataScience.openDs(user);break;
							}

							temp=false;
							break;
						case 2: temp=false;
							System.out.println("Thanks for Your Visit!!");
							System.out.println("YOU LOGGED OUT SUCCESSFULLY!!!\n\n");
							Main.main(null);
						default:
							System.out.println("Invalid choice!!!");
						}
				}
			return;
		}
		
}
