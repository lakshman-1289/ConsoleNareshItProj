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
public interface SignUp extends Common{
		static void Entry() throws Exception {
			System.out.println(BLACK_BACKGROUND+BLUE+"HAVE YOU INTEREST TO JOIN ANY COURSE.. "+ANSI_RESET);
			System.out.println("First register and then Login with your credentials...");
			System.out.println(GREEN+"PRESS 1 :"+ANSI_RESET+"Register Course");
			System.out.println(GREEN+"PRESS 2 :"+ANSI_RESET+" Login");
			System.out.println(YELLOW+"PRESS 3 : >>GO BACK"+ANSI_RESET);
			//System.out.println(G+"PRESS 100 :"+D+"ADMIN EXIT");   //---------only for admin 
			while(true) {
				String choice = sc.next();
				if(Common.isNumeric(choice)) {
					switch(Integer.parseInt(choice)) {
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
				}else {
					System.out.println("Invalid input!!!!!");
					System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
				}
			}
		}

		//VALIDATIONS
				//g-mail validation
				static void gmail(ArrayList<String> reg) {
					System.out.print("Enter your gmail: ");
					String gmail = sc.next();
					if(Character.isAlphabetic(gmail.charAt(0)) && gmail.endsWith("gmail.com") && gmail.toLowerCase().equals(gmail)) 
						reg.add(gmail); 
					else {
						System.out.println(RED_BACKGROUND+"Invalid gmail address!!"+ANSI_RESET);
						gmail(reg);
					}
					return;
				}
				
				//mobile number validation
				static void number(ArrayList<String> reg) {
					System.out.print("Enter your Phone Number: ");
					String n = sc.next();
					if(n.length() == 10) {
						if(!(Common.isNumeric(n))) {
							System.out.println(RED_BACKGROUND+"Invalid phone number!"+ANSI_RESET);
							number(reg);
							return;
						}
						reg.add(n);
					}
					else {
						System.out.println(RED_BACKGROUND+"Invalid phone number!!"+ANSI_RESET);
						number(reg);
						return;
					}
					return;
				}
				
				//name validation
				static void nameCheck(ArrayList<String> reg,ArrayList<String> log) {
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
								log.add(nm1);//log_details[i][0]
								reg.add(nm1);//0
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
				}
				
				//state validation
				static void state(ArrayList<String> reg) {
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
								reg.add(st);//4
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
				}
				
		//Registration Method
		static void register() throws Exception 
		{
			ArrayList<String> reg=new ArrayList<>();
			ArrayList<String> log = new ArrayList<>();
			System.out.println("			    "+BLACK_BACKGROUND+BLUE+"Register for Course!\n"+ANSI_RESET
					+YELLOW+ "				Learn from the Real-Time Experts"+ANSI_RESET);
			System.out.print("Enter your surname: ");
			String nm2 = null;
			while(true) {
				nm2 = sc.next();
				if(Common.isNotAlpha(nm2))
					System.out.print("Enter valid surname : ");
				else
					break;
			}
			nameCheck(reg,log);//0
			reg.add(nm2);//1
			gmail(reg);//2
			number(reg);//3
			state(reg); //4
			System.out.println("In Which Course Do You Want To Join???????");
			System.out.println("Choose Your Course: "); //5
			System.out.println(YELLOW+"PRESS - 1 :"+ANSI_RESET+"FULLSTACK JAVA DEVELOPMENT\r\n"
					+YELLOW+"PRESS - 2 :"+ANSI_RESET+ "FULLSTACK .NET DEVELOPMENT\r\n"
					+YELLOW+"PRESS - 3 :"+ANSI_RESET+"FULLSTACK PYTHON\n"
					+YELLOW+"PRESS - 4 :"+ANSI_RESET+"FULLSTACK WEB DEVELOPMENT(MERN)\n"
					+YELLOW+"PRESS - 5 :"+ANSI_RESET+"FULLSTACK DATASCIENCE"
					);
			boolean temp=true;
			while(temp) {
				String choice = sc.next();
				if(Common.isNumeric(choice)) {
					switch(Integer.parseInt(choice)) {  
						case 1:                         
							reg.add(java);
							log.add(java); //log_details[i][1]
							temp=false;
							break;
						case 2:
							reg.add(net);
							log.add(net);
							temp=false;
							break;
						case 3:
							reg.add(python);
							log.add(python);
							temp=false;
							break;
						case 4:
							reg.add(web);
							log.add(web);
							temp=false;
							break;
						case 5:
							reg.add(ds);
							log.add(ds);
							temp=false;
							break;
						default:
							System.out.println("Invalid choice!!!");
							System.out.println("please choose available course?");
					}
				}else {
					System.out.println("Invalid input!!!!!");
					System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
				}
			}
			
			System.out.print("Select your Mode of Training:"+GREEN+" 1-Online\t 2-Offline: "+ANSI_RESET); //6
			temp=true;
			while(temp) {
				String choice = sc.next();
				if(Common.isNumeric(choice)) {
					switch(Integer.parseInt(choice)) {
					case 1:
						reg.add("Online");temp=false;
						break;
					case 2:
						reg.add("Offline");temp=false;
						break;
					default:
						System.out.println("Invalid Choice!!");
						System.out.println("Choose once Again?");
					}
				}else {
					System.out.println("Invalid input!!!!!");
					System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
				}
			}
			reg_details.add(reg);
			display_reg(reg.get(0));
			
			Main.reg++;
			
			//generate user id and password(note)
			System.out.println("--------------------------------");
			System.out.println(BLACK_BACKGROUND+PURPLE+"| Note the userid and password |"+ANSI_RESET);
			System.out.println("--------------------------------");
			String userid =reg.get(0).split(" ")[0]+Math.round(Math.random()*1000);
			System.out.println(" userid  :"+userid);
			log.add(userid); //user_details[i][2]
			String password = reg.get(2).substring(0,reg.get(2).indexOf("gmail.com"))
					+reg.get(3).substring(5);
			System.out.println(" password :"+password);
			System.out.println("--------------------------------");
			
			System.out.println(YELLOW+"PRESS - 1:"+ANSI_RESET+ "To change your password\n or Else");
			System.out.println(YELLOW+"PRESS- 2:"+ANSI_RESET+ "LogIn");
			while(true) {
				String choice = sc.next();
				if(Common.isNumeric(choice)) {
					switch(Integer.parseInt(choice)) {
					case 1:
						//change password
						temp = true;
						while(temp) {
							System.out.println("Enter your password : ");
							boolean inner =true;
							while(inner) {
								password = sc.next();
								if(password.length() <=5)
									System.out.println("Your password should have atleast 6 characters...");
								else
									inner = false;
							}
							System.out.println("Confirm password : ");
							if(password.equals(sc.next())) {
								System.out.println("Password updated..");
								System.out.println("--------------------------------");
								System.out.println(BLACK_BACKGROUND+PURPLE+"| Note the userid and password |"+ANSI_RESET);
								System.out.println("--------------------------------");
								System.out.println(" userid  :"+userid+ANSI_RESET);
								System.out.println(" password :"+password+ANSI_RESET);
								System.out.println("--------------------------------");
								log.add(password);//log_details[i][3]
								log_details.add(log); 
								temp=false;
								login(0);
							}
							else 
								System.out.println("Password MisMatched........Try Again..");
						}
						break;
					case 2:
						log.add(password);  //log_details[i][3]
						log_details.add(log);
						login(0);
						break;
					default:
						System.out.println("Invalid Choice!!");
						
					}
				}else {
					System.out.println("Invalid input!!!!!");
					System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
				}
			}
		}
			
				//display all registration data of student
				static void display_reg(String name) {
					for(ArrayList<String> ele : reg_details) {
						if(ele.get(0) == name) {
							System.out.println("================================================================");
							System.out.println("|			"+BLACK_BACKGROUND+PURPLE+" Your Details "+ANSI_RESET+"					|");
							System.out.println("|		"+"Name :"+ele.get(0)+" "+ele.get(1)+"				|");
							System.out.println("|		"+"Gmail :"+ele.get(2) +"				|");
							System.out.println("|		"+"Mobile No :"+ ele.get(3)+"				|");
							System.out.println("|		"+"State :"+ ele.get(4)+"					|");
							System.out.println("|		"+"Selected Course :"+ ele.get(5)+"		|");
							System.out.println("|		"+"Attended in :"+ele.get(6)+" mode" +"			|");
							System.out.println("================================================================");
						}
					}
				}

		//Login or SignIn Method
		static void login(int admin_check) throws Exception{
			System.out.println("			    "+BLACK_BACKGROUND+BLUE+"Welcome to Login Page!!"+ANSI_RESET);
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
						System.out.println(BLACK_BACKGROUND+RED_BACKGROUND+"Invalid ADMIN Details.."+ANSI_RESET);
						Entry();
					}
				}
				
				int count =0;
				//checking the user presence in log_details
				for(int i=0;i<log_details.size(); i++) {
					if(log_details.get(i).contains(uid) && log_details.get(i).contains(pwd)) {
//						--------------------------
						CommonToCourses.intoCourse(log_details.get(i));  //CARRY THE PARTICULAR USER DATA
						count++;
					}
				}
				//if not found 
				if(count == 0) {
						System.out.println(BLACK_BACKGROUND+RED_BACKGROUND+"Invalid User Details....First Register Course.."+ANSI_RESET);
						System.out.println(PURPLE+"Press 1:"+ANSI_RESET+" If you wanna Register\n"+
						GREEN+"Press 2:"+ANSI_RESET+" Try once again\n"
						+YELLOW+"PRESS 3 : >>GO BACK"+ANSI_RESET);
						boolean temp = true;
						while(temp) {
							String choice = sc.next();
							if(Common.isNumeric(choice)) {
								switch(Integer.parseInt(choice)) {
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
							}else {
							System.out.println("Invalid input!!!!!");
							System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
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
						System.out.println(BLACK_BACKGROUND+RED_BACKGROUND+"Invalid ADMIN Details.."+ANSI_RESET);
						Entry();
					}
				}
				else {
					System.out.println(RED_BACKGROUND+"First, You need to Register your Course!!\n"+ANSI_RESET);
					Entry();
				}
			}
			return;
		}

			
			//Display Session Data when Exit by Admin
			static void displayAllData() {
				System.out.println("		"+BLACK_BACKGROUND+PURPLE+"All login students and their course lists in this Entire Session..."+ANSI_RESET);
				 Iterator<Entry<String,ArrayList<ArrayList<String>>>> i = all_users_courselist.entrySet().iterator();
				while(i.hasNext()) {
					 Map.Entry<String,ArrayList<ArrayList<String>>> each= (Map.Entry<String,ArrayList<ArrayList<String>>>) i.next();
					 String key = each.getKey();
					 System.out.println("===================================================================================");
						System.out.println("				"+BLACK_BACKGROUND+BLUE+key+"'s"+" COURSE LIST"+ANSI_RESET+"							");
						ArrayList<ArrayList<String>> value = each.getValue();
						if(all_users_courselist.get(key) == null) {    //overcome exception "java.util.ArrayList.size()"
							System.out.println("				"+"No classes Added yet");
						}
						else {
							for(int j=0; j<value.size(); j++) {
								System.out.printf(" 		%-25s%-25s%-25s\n",value.get(j).get(0),value.get(j).get(1),value.get(j).get(2));
							}
						}
						System.out.println("===================================================================================");
						System.out.println();
				}
			}

			static void StoreSessionData() throws IOException 
			{
				FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\git\\CoreJavaProj\\NareshTech\\src\\com\\data\\sessions",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("\n\n");
				String heading = "Session starts on " + Main.start;
				bw.write(heading);
				bw.write("\n============================================");
				for(ArrayList<String> i : reg_details) {
					String name = "\nName : " +i.get(1)+" "+ i.get(0);
					bw.write(name);
					String gmail = "\nGMail Adress : "+ i.get(2);
					bw.write(gmail);
					String no = "\nMobile Number : "+ i.get(3);
					bw.write(no);
					String state = "\nState : "+i.get(4);
					bw.write(state);
					String course = "\nCourse : "+i.get(5);
					bw.write(course);
					String mode = "\nTraining Mode : "+i.get(6);
					bw.write(mode);
					
					bw.write("\n\t\t\tCOURSE LIST\n");
					bw.write("\t\t\t------------\n");
					String user = i.get(0);
					if(all_users_courselist.get(user) != null) {
						@SuppressWarnings("unchecked")
						ArrayList<ArrayList<String>> list = (ArrayList<ArrayList<String>>) all_users_courselist.get(user).clone();
						for(ArrayList<String> ele : list) {
							String e = ele.get(0)+"\t"+ele.get(1)+"\t"+ele.get(2)+"\n";
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

}
