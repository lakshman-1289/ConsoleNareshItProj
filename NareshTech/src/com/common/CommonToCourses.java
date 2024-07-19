package com.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
		static void intoCourse(ArrayList<String> user) throws Exception {
				String s = user.get(1);
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
	
		//Checking the phase of classes already existed or not in the user's course list
		static void check_course(ArrayList<String> user,String cls) throws Exception {
			String uname = user.get(0);
			String c = user.get(1);
			if(all_users_courselist.get(uname) == null)
				return;
			ArrayList<ArrayList<String>> temp = new ArrayList<>();
			temp = all_users_courselist.get(uname);
			for(ArrayList<String> ele : temp) {
				if(ele.get(0).equals(cls)) {
					System.out.println(RED_BACKGROUND+"ALREADY EXISTED CLASSES "+ANSI_RESET);
					System.out.println(RED+BLACK_BACKGROUND+"REMINDER"+ANSI_RESET);
					System.out.println(YELLOW+"Everytime While adding classes,check already existed CLASSES AND THEIR TIMINGS in your COURSE LIST(By pressing 4)"+ANSI_RESET);
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
		static void facaulty_selection(String username,HashMap<String,HashMap<String,List<String>>> course,String phase_class){
			System.out.println(BLACK_BACKGROUND+BLUE+"Available Trainers to "+phase_class+ANSI_RESET); 
			HashMap<String,List<String>> val = course.get(phase_class);
			for(Map.Entry m : val.entrySet()){    
			    System.out.println(m.getKey());    
			}  

			ArrayList<String> ar = new ArrayList<>();
			ar.add(phase_class);
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
						ar.add(trainer);
						flag = false;
					}
					else {
						System.out.print("Choose only available Trainer : ");
					}
				}else {
					System.out.print("You should enter your Trainer name :");
				}
			}
			Main.out_ar.add(ar);
			
			all_users_courselist.put(username,Main.out_ar);
			iterator_timings.add(course.get(phase_class).get(trainer));
		}
		
		
		//Method to Displays all possible combinational set of timings of phase having 3 classes
		static void display_iterations(List<List<String>> it3,ArrayList<ArrayList<String>> user_course) {
			System.out.println(BLACK_BACKGROUND+PURPLE+"				All available set of timings..				"+ANSI_RESET);
			System.out.println(YELLOW+"			Choose your comfortable timing set		"+ANSI_RESET);
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
						for(int l=Main.cnt,m=0; l<user_course.size(); l++,m++) {
							System.out.print(user_course.get(l).get(0) +" : "+temp.get(m)+"\t\t");
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
			
			System.out.println(RED+BLACK_BACKGROUND+"REMINDER -2 "+ANSI_RESET);
			System.out.println(YELLOW+"You must choose ALL class timings from"+RED+" ONLY ONE "+ANSI_RESET+YELLOW+" of the displayed sets above"+ANSI_RESET);
		}
		
		//Method to Displays all possible combinational set of timings of phase having 2 classes
		static void display_iterations(List<List<String>> it2,ArrayList<ArrayList<String>> user_course,int dummy) {
			System.out.println(BLACK_BACKGROUND+PURPLE+"				All available set of timings..				"+ANSI_RESET);
			System.out.println(YELLOW+"			Choose your comfortable timing set		"+ANSI_RESET);
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
						for(int l=Main.cnt,m=0; l<user_course.size(); l++,m++) {
							System.out.print(user_course.get(l).get(0) +" : "+temp.get(m)+"\t\t");
						}
						System.out.println();
						
					temp.remove(temp.indexOf(it2.get(1).get(j)));
				}
				temp.clear();
			}
			System.out.println("\n==========================================================================================");
			it2.clear();//---------------------
			
			System.out.println(RED+BLACK_BACKGROUND+"REMINDER"+ANSI_RESET);
			System.out.println(YELLOW+"You must choose ALL class timings from"+RED+" ONLY ONE "+ANSI_RESET+YELLOW+" of the displayed sets above"+ANSI_RESET);
		}
		
		//Timings Selection
		static void addTimingToEachClass(String username,String c) {
			System.out.print("Enter your timing for "+c+" class: ");
			boolean flag = true;
			while(flag) {
				String time =sc.next().trim();
				if(timings.contains(time)) {
					all_users_courselist.get(username).get(Main.cnt++).add(time);
					flag = false;
				}
				else {
					System.out.print("Choose only available Timings : ");
				}
				
			}
		 }
		
				
		//method used to display existed course list of user everytime before getting timings to new phase of classes into course list
		static void display_list(ArrayList<String> user,int x){
			String username = user.get(0);
			System.out.println("===================================================================================");
			System.out.println("							DEAR STUDENT,"+YELLOW+username.toUpperCase()+ANSI_RESET);
			System.out.println("				"+BLACK_BACKGROUND+BLUE+"YOUR COURSE LIST"+ANSI_RESET+"							");
			ArrayList<ArrayList<String>> all = all_users_courselist.get(username);
			if(all_users_courselist.get(username) == null) { 
				System.out.println("				"+"No Phase of classes Added yet");
			}
			else {
				@SuppressWarnings("unchecked")
				ArrayList<ArrayList<String>> temp = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
				if(temp.get(0).size() == 2) {
					System.out.println("				"+"No Phase of classes Added yet");
				}
				else {
					for(int i=0; i<all.size()-x; i++) {
						System.out.printf(" 		%-25s%-25s%-25s\n",all.get(i).get(0),all.get(i).get(1),all.get(i).get(2));
					}
				}
			}
			System.out.println("===================================================================================");
		}
		
		//Checking the new phase of timings collapse with existed timings or not
		static void check_timings(ArrayList<String> user,ArrayList<ArrayList<String>> check_ar) throws Exception 
		{
			String uname = user.get(0);
			String c = user.get(1);
			if(all_users_courselist.get(uname) == null)
				return;
			ArrayList<ArrayList<String>> temp = new ArrayList<>();
			temp = all_users_courselist.get(uname);
			for(int i=0; i<temp.size()-1; i++) {
				for(int j=i+1; j<temp.size(); j++) {
					if(temp.get(i).get(2).equals(temp.get(j).get(2))) {
						all_users_courselist.put(uname,check_ar);//-----------------------------------------------
						System.out.println(RED_BACKGROUND+"Timings Overlapped!!"+ANSI_RESET);
						System.out.println(RED+BLACK_BACKGROUND+"REMINDER"+ANSI_RESET);
						System.out.println(YELLOW+"Everytime While adding classes,check already existed CLASSES AND THEIR TIMINGS in your COURSE LIST(By pressing 4)"+ANSI_RESET);
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
		static void display_list(ArrayList<String> user) throws Exception
		{
			String username = user.get(0);
			System.out.println("===================================================================================");
			System.out.println("							DEAR STUDENT,"+YELLOW+username.toUpperCase()+ANSI_RESET);
			System.out.println("				"+BLACK_BACKGROUND+BLUE+"YOUR COURSE LIST"+ANSI_RESET+"							");
			ArrayList<ArrayList<String>> all = all_users_courselist.get(username);
			if(all_users_courselist.get(username) == null) {    //overcome exception "java.util.ArrayList.size()"
				System.out.println("				"+"No Phase of classes Added yet");
			}
			else {
				@SuppressWarnings("unchecked")
				ArrayList<ArrayList<String>> temp = (ArrayList<ArrayList<String>>) all_users_courselist.get(username).clone();
				if(temp.get(0).size() == 2) {
					System.out.println("				"+"No Phase of classes Added yet");
				}
				else {
					for(int i=0; i<all.size(); i++) {
						System.out.printf(" 		%-25s%-25s%-25s\n",all.get(i).get(0),all.get(i).get(1),all.get(i).get(2));
					}
				}
			}
			System.out.println("===================================================================================");
			System.out.println();
			System.out.println(BLACK_BACKGROUND+PURPLE+"Choose your Option Again"+ANSI_RESET);
			System.out.println(" If You Wanna Attend some more classes then "+GREEN+"PRESS 1:"+ANSI_RESET);
			System.out.println(RED+BLACK_BACKGROUND+"For LOG OUT"+" PRESS 2:"+ANSI_RESET);
			boolean temp = true;
				while(temp) {
					String choice = sc.next();
					if(Common.isNumeric(choice)) {
						switch(Integer.parseInt(choice)) {
						case 1: 
							String s = user.get(1);
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
							System.out.println(RED_BACKGROUND+BLACK+"YOU LOGGED OUT SUCCESSFULLY!!!\n\n"+ANSI_RESET);
							Main.main(null);
						default:
							System.out.println("Invalid choice!!!");
						}
					}else {
						System.out.println("Invalid input!!!!!");
						System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
					}
				}
			return;
		}
		
}
