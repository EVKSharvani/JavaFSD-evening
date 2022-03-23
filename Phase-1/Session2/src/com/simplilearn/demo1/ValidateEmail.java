package com.simplilearn.demo1;
import java.util.*;
import java.io.*;
public class ValidateEmail {

	public static void main(String[] args) {
		 ArrayList<String> emailID = new ArrayList<String>();
		 int num;
		 int k=0;
		 String str;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter list of emailId's:");
		    num = sc.nextInt();
	        for(int i=0;i<=num;i++)
	        {
	        	 str=sc.nextLine();
	        	 emailID.add(str);
	        }
	        
	        System.out.println("Enter emailId to be searched:");
	        String searchElement =sc.nextLine();
	        
	                for(int i=0; i<emailID.size(); i++) {
	                    
	                    
	                    if(searchElement.matches(emailID.get(i))) {
	                    	k=1;
	                        
	                        System.out.println("email ID " + searchElement + " found");
	                        
	                        break;
	                        
	                    }
	                }
	                if(k==0)
	                {
	                	System.out.println("email ID " + searchElement + " not found");
	                }

	}
}

