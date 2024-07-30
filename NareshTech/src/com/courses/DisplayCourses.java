package com.courses;

import com.common.Common;
import com.run.Main;

//JUST FOR DISPLAY ABOUT EACH COURSES
public interface DisplayCourses extends Common{
	
		default void fullStackJava(){
			System.out.println( ">>>>>>>>FULL STACK JAVA DEVELOPMENT<<<<<<<< ");
			
			System.out.println("Java Modules			\r\n"
					+"-------------    		"+"Database\r\n"
					+ "CORE JAVA			---------\n"
					+ "ADV. JAVA 			ORACLE\r\n"
					+ "SPRING				(SQL&PL/SQL)\r\n"
					+ "SPRING BOOT\r\n"
					+ "MICROSERVICES");
			
			System.out.println("UI Modules\r\n"
					+"-----------\r\n"
					+ "HTML				"+"ReactJS\r\n"
					+ "CSS 				-------\r\n"
					+ "JAVASCRIPT			"+"AWS Basics\r\n"
					+ "BOOTSTRAP			-----------");
			
			System.out.println("DevSecOps Tools\r\n"
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
		
		default void fullStackDotNet(){
			System.out.println("\n\t>>>>>>>>>>Full Stack .NET CORE<<<<<<<<<<\t\n");
			
			System.out.println(".NET Modules\n"
					+"------------		"+"Database\r\n"
					+ "C#.NET			---------\n"
					+ "ASP.NET Core 		SQL Server\r\n"
					+ "ADO.NET	"
					+ "LINQ\r\n"
					+ "Entity Framework\n\n");
			System.out.println("UI Modules\r\n"
					+"------------\r\n"
					+ "HTML\n"
					+ "CSS 				--------------\r\n"
					+ "JAVASCRIPT			"+"| Angular 17|\r\n"
					+ "TYPESCRIPT			-------------\n\n");
			
			welcome();
			return;
		}
		
		default void fullStackPython(){
			System.out.println("\n>>>>>>>>>>>>>>FULL STACK PYTHON>>>>>>>>>>>>>>\n");
			System.out.println("----------			------------");
			System.out.println("| Python |"+"				"+"| Database |"); 
			System.out.println("----------			------------\n");
			System.out.println("UI Modules\r\n"
							+"------------\r\n"
					+ "HTML\n"
					+ "CSS 				-----------\r\n"
					+ "JAVASCRIPT			"+"| Angular |\r\n"
					+ "BOOTSTRAP			----------\n\n");
			System.out.println("----------			------------");
			System.out.println("| RestAPI |"+"				"+"| Djnago |"); 
			System.out.println("----------			------------");
			
			welcome();
			return;
		}
		
		default void fullStackWeb(){
			System.out.println("\n>>>>>>>>>>Full Stack Web Development<<<<<<<<<<");
			System.out.println("\t\twith UI Technologies\r\n"
					+"\t\t---------------------\n"
					+ "\tHTML, CSS HTML5, CSS3\r\n"
					+ "\tCore & Adv. Javascript\r\n"
					+ "\tJQuery\r\n"
					+ "\tBootstrap\r\n"
					+ "\tAjax, JSON, DHTML\n");
			System.out.println("\t\tBackend Technologies\n"
					+ "+\t---------------------\n"
					+"\tNode with ExpressJS \n"
					+ "\tMongoDB\r\n"
					+ "\tMySQL\r\n"
					+ "\tWeb Services");
			
			welcome();
			return;
		}
		
		default void fullStackDS(){
			System.out.println("\n>>>>>>>>>>FULL STACK DATA SCIENCE & AI<<<<<<<<<<");
			System.out.println("\t\t\tMODULES");
			System.out.println("\t\t-------");
			System.out.println("\t\tPython \r\n"
					+ "\t\tStatistics\r\n"
					+ "\t\tMachine Learning\r\n"
					+ "\t\tDeep Learning \r\n"
					+ "\t\tNLP Computer Vision\r\n"
					+ "\t\tR Language\r\n"
					+ "\t\tData Bases Data Analytics\n");
			
			System.out.println("\t\t\tExtra parallel skills");
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
		
		default void welcome(){
			System.out.println("\n<<Go Back to MAIN PAGE (only move) ");
			System.out.print("You should "+"PRESS - 1 :");
			boolean temp = true;
			while(temp) {
					switch(Common.choice_validation()){
						case 1: temp = false;
							Main.main(null);
							return;
						default: System.out.println("No other choice... You should "+"PRESS - 1"+" to Go Back");
					}
			}
		}
		
}
