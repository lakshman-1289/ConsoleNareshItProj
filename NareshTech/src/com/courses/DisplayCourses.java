package com.courses;

import com.common.Common;
import com.run.Main;

//JUST FOR DISPLAY ABOUT EACH COURSES
public interface DisplayCourses extends Common{
	
		default void fullStackJava() throws Exception {
			System.out.println(BLACK_BACKGROUND +BLUE + ">>>>>>>>FULL STACK JAVA DEVELOPMENT<<<<<<<< "+ANSI_RESET);
			
			System.out.println(YELLOW+ "Java Modules			\r\n"+ANSI_RESET
					+"-------------    		"+YELLOW+"Database\r\n"+ANSI_RESET
					+ "CORE JAVA			---------\n"
					+ "ADV. JAVA 			ORACLE\r\n"
					+ "SPRING				(SQL&PL/SQL)\r\n"
					+ "SPRING BOOT\r\n"
					+ "MICROSERVICES");
			
			System.out.println(YELLOW+"UI Modules\r\n"+ANSI_RESET
					+"-----------\r\n"
					+ "HTML				"+YELLOW+"ReactJS\r\n"+ANSI_RESET
					+ "CSS 				-------\r\n"
					+ "JAVASCRIPT			"+YELLOW+"AWS Basics\r\n"+ANSI_RESET
					+ "BOOTSTRAP			-----------");
			
			System.out.println(YELLOW+"DevSecOps Tools\r\n"+ANSI_RESET
					+"----------------\r\n"
					+ "GIT			Sonarqube\r\n"
					+ "GitHub			SIF4J\r\n"
					+ "Jenkins			jUnit\r\n"
					+ "Maven			ELK\r\n"
					+ "Gradle			Mockito \r\n"
					+ "Jira			Jmeter\r\n"
					+ "Docker			Herouku \r\n"
					+ "Datadog			Chef\r\n");
			
			welcome();
			return;
		}
		
		default void fullStackDotNet() throws Exception {
			System.out.println(BLACK_BACKGROUND+BLUE+"\n\t>>>>>>>>>>Full Stack .NET CORE<<<<<<<<<<\t\n"+YELLOW);
			
			System.out.println(YELLOW+".NET Modules\n"+ANSI_RESET
					+"------------		"+YELLOW+"Database\r\n"+ANSI_RESET
					+ "C#.NET			---------\n"
					+ "ASP.NET Core 		SQL Server\r\n"
					+ "ADO.NET	"
					+ "LINQ\r\n"
					+ "Entity Framework\n\n");
			System.out.println(YELLOW+"UI Modules\r\n"+ANSI_RESET
					+"------------\r\n"
					+ "HTML\n"
					+ "CSS 				--------------\r\n"
					+ "JAVASCRIPT			"+YELLOW+"| Angular 17|\r\n"+ANSI_RESET
					+ "TYPESCRIPT			-------------\n\n");
			
			welcome();
			return;
		}
		
		default void fullStackPython() throws Exception {
			System.out.println(BLACK_BACKGROUND+BLUE+"\n>>>>>>>>>>>>>>FULL STACK PYTHON>>>>>>>>>>>>>>\n"+ANSI_RESET);
			System.out.println("----------			------------");
			System.out.println(YELLOW+"| Python |"+ANSI_RESET+"				"+YELLOW+"| Database |"+ANSI_RESET); 
			System.out.println("----------			------------\n");
			System.out.println(YELLOW+"UI Modules\r\n"+ANSI_RESET
							+"------------\r\n"
					+ "HTML\n"
					+ "CSS 				-----------\r\n"
					+ "JAVASCRIPT			"+YELLOW+"| Angular |\r\n"+ANSI_RESET
					+ "BOOTSTRAP			----------\n\n");
			System.out.println("----------			------------");
			System.out.println(YELLOW+"| RestAPI |"+ANSI_RESET+"				"+YELLOW+"| Djnago |"+ANSI_RESET); 
			System.out.println("----------			------------");
			
			welcome();
			return;
		}
		
		default void fullStackWeb() throws Exception {
			System.out.println(BLACK_BACKGROUND+BLUE+"\n>>>>>>>>>>Full Stack Web Development<<<<<<<<<<"+ANSI_RESET);
			System.out.println(YELLOW+"\t\twith UI Technologies\r\n"+ANSI_RESET
					+"\t\t---------------------\n"
					+ "\tHTML, CSS HTML5, CSS3\r\n"
					+ "\tCore & Adv. Javascript\r\n"
					+ "\tJQuery\r\n"
					+ "\tBootstrap\r\n"
					+ "\tAjax, JSON, DHTML\n");
			System.out.println(YELLOW+"\t\tBackend Technologies\n"+ANSI_RESET
					+ "+\t---------------------\n"
					+"\tNode with ExpressJS \n"
					+ "\tMongoDB\r\n"
					+ "\tMySQL\r\n"
					+ "\tWeb Services");
			
			welcome();
			return;
		}
		
		default void fullStackDS() throws Exception {
			System.out.println(BLACK_BACKGROUND+BLUE+"\n>>>>>>>>>>FULL STACK DATA SCIENCE & AI<<<<<<<<<<"+ANSI_RESET);
			System.out.println(YELLOW+"\t\t\tMODULES"+ANSI_RESET);
			System.out.println("\t\t-------");
			System.out.println("\t\tPython \r\n"
					+ "\t\tStatistics\r\n"
					+ "\t\tMachine Learning\r\n"
					+ "\t\tDeep Learning \r\n"
					+ "\t\tNLP Computer Vision\r\n"
					+ "\t\tR Language\r\n"
					+ "\t\tData Bases Data Analytics\n");
			
			System.out.println(YELLOW+"\t\t\tExtra parallel skills"+ANSI_RESET);
			System.out.println("\t\t----------------------");
			System.out.println("\t\t-Data structure and algorithm\r\n"
					+ "\t\t-Data visualization tools\r\n"
					+ "\t\t-PowerBl\r\n"
					+ "\t\t-Tableau\r\n"
					+ "\t\t-Mock interview\r\n"
					+ "\t\t-Interview preparation\r\n"
					+ "\t\t-Resume building after every module\r\n"
					+ "\t\t-Domain wise Project");
			
			welcome();
			return;
		}
		
		default void welcome() throws Exception{
			System.out.println("\n<<Go Back to MAIN PAGE (only move) ");
			System.out.print("You should "+YELLOW+"PRESS - 1 :"+ANSI_RESET);
			boolean temp = true;
			while(temp) {
				String choice = sc.next();
				if(Common.isNumeric(choice)) {
					switch(Integer.parseInt(choice)){
						case 1: temp = false;
							Main.main(null);
							return;
						default: System.out.println("No other choice... You should "+RED_BACKGROUND+"PRESS - 1"+ANSI_RESET+" to Go Back");
					}
				}else {
					System.out.println("Invalid input!!!!!");
					System.out.println("You should provide valid input"+RED_BACKGROUND+".."+ANSI_RESET);
				}
			}
		}
		
}
