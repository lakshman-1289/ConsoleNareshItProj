package com.run;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.common.Common;
import com.common.CommonToCourses;
import com.common.CourseListObject;
import com.common.LogObject;
import com.common.RegisterObject;
public interface SignUp extends Common{
	
		static void Entry(){
			System.out.println("HAVE YOU INTEREST TO JOIN ANY COURSE.. ");
			System.out.println("First register and then Login with your credentials...");
			System.out.println("PRESS 1 :"+"Register Course");
			System.out.println("PRESS 2 :"+" Login");
			System.out.println("PRESS 3 : >>GO BACK");
			//System.out.println(G+"PRESS 100 :"+D+"ADMIN EXIT");   //---------only for admin 
			while(true) 
			{
					switch(Common.choice_validation()) {
						case 1:
							register();
							break;
						case 2:
							login(0);
							break;
						case 3:
							Main.main(null);
							break;
						case 100: login(100);
								break;
						default:
							System.out.println("Invalid choice!!!");
							Entry();
					}
			}
		}

		//VALIDATIONS
				//g-mail validation
				static String gmail() {
					System.out.print("Enter your gmail: ");
					String gmail = sc.next();
					if(Character.isAlphabetic(gmail.charAt(0)) && gmail.endsWith("gmail.com") && gmail.toLowerCase().equals(gmail)) 
						return gmail;
					else {
						System.out.println("Invalid gmail address!!");
						gmail();
					}
					return gmail;
				}
				
				//mobile number validation
				static String number() {
					System.out.print("Enter your Phone Number: ");
					String n = sc.next();
					if(!(Common.isNumeric(n)) || !(n.length() == 10)) {
						System.out.println("Invalid phone number!");
						number();
					}
					return n;
				}
				
				//name validation
				static String nameCheck() {
					String nm1 = null;
					boolean flag = true;
					int cname = 0;
					while(flag) {
						nm1 = sc.nextLine().trim();
						if(nm1 != "") {
							if(nm1.length()<4 || Common.isNotAlpha(nm1) ) {
								System.out.print("Enter valid Name : ");
							}
							else {
								flag = false;
							}
						}else {
							if(cname == 0) {
								System.out.print("Enter your Name : ");
								cname++;
							}else {
								System.out.print("You should enter your Name :");
							}
						}
					}
					return nm1;
				}
				
				//state validation
				static String state() {
					String st = null;
					boolean flag = true;
					int cstate = 0;
					while(flag) {
						st = sc.nextLine().trim();
						if(st != "") {
							if(Common.isNotAlpha(st)) {
								System.out.print("Enter valid State : ");
							}
							else {
								flag = false;
							}
						}else {
							if(cstate == 0) {
								System.out.print("Enter your State : ");
								cstate++;
							}else {
								System.out.print("You should enter your State :");
							}
						}
					}
					return st;
				}
				
				//changing password validation
				static String change_password(String password) {
					boolean inner =true;
					while(inner) {
						password = sc.next();
						if(password.length() <=5)
							System.out.println("Your password should have atleast 6 characters...");
						else
							inner = false;
					}
					return password;
				}
				
				//print user id and password
				static void print_log_details(String userid,String password) {
					System.out.println("--------------------------------");
					System.out.println("| Note the userid and password |");
					System.out.println("--------------------------------");
					System.out.println(" userid  :"+userid);
					System.out.println(" password :"+password);
					System.out.println("--------------------------------");
				}
				
		//Registration Method
		static void register()
		{
			RegisterObject robj = new RegisterObject();
			LogObject lobj = new LogObject();
			System.out.println("			    "+"Register for Course!\n"
					+ "				Learn from the Real-Time Experts");
			System.out.print("Enter your surname: ");
			String nm2 = null;
			while(true) {
				nm2 = sc.next();
				if(Common.isNotAlpha(nm2))
					System.out.print("Enter valid surname : ");
				else
					break;
			}
			String nm1 = nameCheck();
			robj.setFullName(nm1);
			lobj.setUsername(nm1);
			robj.setSurName(nm2);
			robj.setGmail(gmail());
			robj.setPhno(number());
			robj.setState(state());
			System.out.println("In Which Course Do You Want To Join???????");
			System.out.println("Choose Your Course: "); //5
			System.out.println("PRESS - 1 :"+"FULLSTACK JAVA DEVELOPMENT\r\n"
					+"PRESS - 2 :"+ "FULLSTACK .NET DEVELOPMENT\r\n"
					+"PRESS - 3 :"+"FULLSTACK PYTHON\n"
					+"PRESS - 4 :"+"FULLSTACK WEB DEVELOPMENT(MERN)\n"
					+"PRESS - 5 :"+"FULLSTACK DATASCIENCE"
					);
			boolean temp=true;
			while(temp) {
					switch(Common.choice_validation()) {  
						case 1:                         
							robj.setCourse(java);
							lobj.setUserCourse(java);
							temp=false;
							break;
						case 2:
							robj.setCourse(net);
							lobj.setUserCourse(net);
							temp=false;
							break;
						case 3:
							robj.setCourse(python);
							lobj.setUserCourse(python);
							temp=false;
							break;
						case 4:
							robj.setCourse(web);
							lobj.setUserCourse(web);
							temp=false;
							break;
						case 5:
							robj.setCourse(ds);
							lobj.setUserCourse(ds);
							temp=false;
							break;
						default:
							System.out.println("Invalid choice!!!..."+"choose only available course?");
					}
			}
			
			System.out.print("Select your Mode of Training:"+" 1-Online\t 2-Offline: "); //6
			temp=true;
			while(temp) {
					switch(Common.choice_validation()) {
					case 1:
						robj.setMode("Online");temp=false;
						break;
					case 2:
						robj.setMode("Online");temp=false;
						break;
					default:
						System.out.println("Invalid Choice!!!..."+"Choose once Again?");
					}
			}
			reg_details.add(robj);
			display_reg(robj.getFullName());
			
			Main.reg++;
			
			//generate user id and password(note)
			String userid =robj.getFullName().split(" ")[0]+Math.round(Math.random()*1000);
			lobj.setUid(userid);
			String password = robj.getGmail().substring(0,robj.getGmail().indexOf("gmail.com"))
					+robj.getPhno().substring(5);
			print_log_details(userid,password);
			System.out.println("PRESS - 1:"+ "To change your password\n or Else");
			System.out.println("PRESS- 2:"+"LogIn");
			while(true) {
					switch(Common.choice_validation()) {
					case 1:
						//change password
						temp = true;
						while(temp) {
							System.out.println("Enter your password : ");
							password = change_password(password);
							System.out.println("Confirm password : ");
							if(password.equals(sc.next())) {
								System.out.println("Password updated..");
								lobj.setPassword(password);
								log_details.add(lobj); 
								temp=false;
								print_log_details(userid,password);
								Entry();
							}
							else 
								System.out.println("Password MisMatched........Try Again..");
						}
						break;
					case 2:
						lobj.setPassword(password);
						log_details.add(lobj);
						login(0);
						break;
					default:
						System.out.println("Invalid Choice!!");
						
					}
			}
		}
			
				//display all registration data of student
				static void display_reg(String name) {
					for(RegisterObject ele : reg_details) {
						if(ele.getFullName() == name) {
							System.out.println("================================================================");
							System.out.println("|			"+" Your Details "+"					|");
							System.out.println("|		"+"Name :"+ele.getFullName()+" "+ele.getSurName()+"				|");
							System.out.println("|		"+"Gmail :"+ele.getGmail() +"				|");
							System.out.println("|		"+"Mobile No :"+ ele.getPhno()+"				|");
							System.out.println("|		"+"State :"+ ele.getState()+"					|");
							System.out.println("|		"+"Selected Course :"+ ele.getCourse()+"		|");
							System.out.println("|		"+"Attended in :"+ele.getMode()+" mode" +"			|");
							System.out.println("================================================================");
						}
					}
				}

		//Login or SignIn Method
		static void login(int admin_check){
			System.out.println("			    "+"Welcome to Login Page!!");
			System.out.println("Please use your credentials to Login...");
			if(Main.reg>0) {
				System.out.print("Enter your USERID : ");
				String uid = sc.next();
				System.out.print("Enter your PASSWORD : ");
				String pwd = sc.next();
				//logout of admin
				if(admin_check ==100) {
					if(uid.equals("admin") && pwd.equals("password")) {
						displayAllData();
						StoreSessionData();
						System.exit(0);
					}else {
						System.out.println("Invalid ADMIN Details..");
						Entry();
					}
				}
				
				int count =0;
				//checking the user presence in log_details
				for(int i=0;i<log_details.size(); i++) {
					if(log_details.get(i).getUid().equals(uid) && log_details.get(i).getPassword().equals(pwd)) {
						CommonToCourses.intoCourse(log_details.get(i));  //CARRY THE PARTICULAR USER DATA
						count++;
					}
				}
				//if not found 
				if(count == 0) {
						System.out.println("Invalid User Details....First Register Course..");
						System.out.println("Press 1:"+" If you wanna Register\n"+
						"Press 2:"+" Try once again\n"
						+"PRESS 3 : >>GO BACK");
						boolean temp = true;
						while(temp) {
								switch(Common.choice_validation()) {
									case 1:
										register();
										break;
									case 2:
										login(0);
										break;
									case 3:
										Entry();
										break;
									default:
										System.out.println("Invalid Choice!");
								}
						}
				}
			}
			else {
				if(admin_check == 100) {
					System.out.println("Enter your USERID : ");
					String uid = sc.next();
					System.out.println("Enter your PASSWORD : ");
					String pwd = sc.next();
					if(uid.equals("admin") && pwd.equals("password")) {
						displayAllData();
						StoreSessionData();
						System.exit(0);
					}
					else {
						System.out.println("Invalid ADMIN Details..");
						Entry();
					}
				}
				else {
					System.out.println("First, You need to Register your Course!!\n");
					Entry();
				}
			}
			return;
		}

			
			//Display Session Data when Exit by Admin
			static void displayAllData() {
				System.out.println("		"+"All login students and their course lists in this Entire Session...");
				 Iterator<Entry<String,ArrayList<CourseListObject>>> i = all_users_courselist.entrySet().iterator();
				while(i.hasNext()) {
					 java.util.Map.Entry<String, ArrayList<CourseListObject>> each= (java.util.Map.Entry<String, ArrayList<CourseListObject>>) i.next();
					 String key = each.getKey();
					 System.out.println("===================================================================================");
						System.out.println("				"+key+"'s"+" COURSE LIST"+"							");
						ArrayList<CourseListObject> value = each.getValue();
						if(all_users_courselist.get(key) == null) {    //overcome exception "java.util.ArrayList.size()"
							System.out.println("				"+"No classes Added yet");
						}
						else {
							for(int j=0; j<value.size(); j++) {
								System.out.printf(" 		%-25s%-25s%-25s\n",value.get(j).getSubject(),value.get(j).getTrainer(),value.get(j).getTimeSlot());
							}
						}
						System.out.println("===================================================================================");
						System.out.println();
				}
			}

			static void StoreSessionData()
			{
				try {
					FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\git\\ConsoleNareshItProj\\NareshTech\\src\\com\\data\\sessions",true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("\n\n");
					String heading = "Session starts on " + Main.start;
					bw.write(heading);
					bw.write("\n============================================");
					for(RegisterObject i : reg_details) {
						String name = "\nName : " +i.getSurName()+" "+ i.getFullName();
						bw.write(name);
						String gmail = "\nGMail Adress : "+ i.getGmail();
						bw.write(gmail);
						String no = "\nMobile Number : "+ i.getPhno();
						bw.write(no);
						String state = "\nState : "+i.getState();
						bw.write(state);
						String course = "\nCourse : "+i.getCourse();
						bw.write(course);
						String mode = "\nTraining Mode : "+i.getMode();
						bw.write(mode);
						
						bw.write("\n\t\t\tCOURSE LIST\n");
						bw.write("\t\t\t------------\n");
						String user = i.getFullName();
						if(all_users_courselist.get(user) != null) {
							@SuppressWarnings("unchecked")
							ArrayList<CourseListObject> list = (ArrayList<CourseListObject>) all_users_courselist.get(user).clone();
							for(CourseListObject ele : list) {
								String e = ele.getSubject()+"\t"+ele.getTrainer()+"\t"+ele.getTimeSlot()+"\n";
								bw.write(e);
							}
						}else {
							bw.write(user + " does not attend any classes yet!!");
						}
					}	
					java.util.Date date = new java.util.Date();
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					bw.write("\n------------------------------------------------------");
					bw.write("\nSession Ends at " +sdf.format(date).toString());
					bw.write("\n================================================================================");
					bw.flush();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}

}
