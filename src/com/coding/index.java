package com.coding;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		  System.out.println("***************Welcome to LIBRARY MANAGEMENT***********");
		 System.out.println("1.ADMIN LOGIN");
		 System.out.println("2.STUDENT LOGIN");
		 System.out.println("3.REGISTER STUDENT");
		 System.out.println("4.EXIT");
		 System.out.println("Enter a choice: ");
		 int choice =sc.nextInt();
		 switch(choice) {
		 case 1 :
			 User.AdminLogin(sc);
			 break;
		 
		 case 2 :
			 User.Login(sc);
			 break; 
		
		case 3 :
			User.AddUser(sc);
			break;
	
	case 4:
	System.out.println("\n Thank you!");
    System.exit(0);
    break;
}
}}}