package com.simplilearn.filemanagenment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.io.*;

// MyFilenameFilter class implements FilenameFilter
// interface
class MyFilenameFilter implements FilenameFilter {
	
	String initials;
	
	// constructor to initialize object
	public MyFilenameFilter(String initials)
	{
		this.initials = initials;
	}
	
	// overriding the accept method of FilenameFilter
	// interface
	public boolean accept(File dir, String name)
	{
		return name.startsWith(initials);
	}
}
public class FileManagement {
	 public static void main(String[] arg){
		
		 int k=0;
		 while(k!=1)
		 {
		 System.out.println("Enter your choice which you want to select: \n 1.Retrive current files in ascending order. \n 2.Bussiness level Operation Menu. \n 3.Exit from the application.");
		 Scanner sc= new Scanner(System.in);
		 int ch=sc.nextInt();
         switch(ch)
         {
         case 1:
        	 File fileDir = new File("C:\\Users\\Sharvani\\eclipse-workspace\\Final Project");
               if(fileDir.isDirectory()){
 			       List listFile = Arrays.asList(fileDir.list());
 			  	Collections.sort(listFile);
 				System.out.println("---------------------------------------");
 				System.out.println("Sorting by filename in ascending order");
 				for(int i=0;i<listFile.size();i++){
 					String s=(String) listFile.get(i);
 					if(s.matches("(.*).txt"))
 	    			{
 				    System.out.println(listFile.get(i));
 	    			}
 				} 
               }
       		else{
       			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
       		}System.out.println("Do you want repeat the ");
               break;
       		
            
         case 2:int l=0;
        	 while(l!=1) {
        	 System.out.println("Enter your choice for bussiness: \n 1.Add a file and its content to a directory. \n 2.Delete a file from a directory. \n 3.Searching a file and showing its content. \n 4.Exit from Bussiness level operation menu.");
         
                 int ch1=sc.nextInt();
                 switch(ch1)
                 {
                 case 1: try {
                	 System.out.print("Enter the file name to be created: "); 
                	 Scanner s= new Scanner(System.in);
                	 String n=s.nextLine();              //variable name to store the file name  
                	 FileOutputStream fos=new FileOutputStream(n, true);  // true for append mode  
                	 System.out.print("Enter file content: "); 
             
                	 String str=s.nextLine()+"\n";      //str stores the string which we have entered  
                	 byte[] b= str.getBytes();       //converts string into bytes  
                	 fos.write(b);           //writes bytes into file  
                	 fos.close();            //close the file  
                	 System.out.println("file saved."); }  
                 catch(Exception e)  
                 {  
                 e.printStackTrace();          
                 }  
                	  break;
                 case 2:try  
                      {  
                	 System.out.print("Enter the file name to be deleted: ");  
                	 Scanner sc1= new Scanner(System.in);
                	 String nm=sc1.nextLine();              //variable name to store the file name          
                	 File f= new File(nm);           //file to be delete  
                	 if(f.delete())                      //returns Boolean value  
                	 {  
                	 System.out.println(f.getName() + " deleted");   //getting and printing the file name  
                	 }  
                	 else  
                	 {  
                	 System.out.println("failed");  
                	 }  
                	 }  
                	   
                	 catch(Exception e)  
                	 {  
                	 e.printStackTrace();          
                	 } break;
                 case 3:File directory = new File("C:\\Users\\Sharvani\\eclipse-workspace\\Final Project");
                 Scanner sc2= new Scanner(System.in);
                 System.out.print("Enter the file name to be searched: "); 
			   			 String st=sc2.nextLine();
			   			// Create an object of Class MyFilenameFilter
			   			// Constructor with name of file which is being
			   			// searched
			   			MyFilenameFilter filter
			   				= new MyFilenameFilter(st);
			
			   			// store all names with same name
			   			// with/without extension
			   			String[] flist = directory.list(filter);
			               int p=0;
			   			// Empty array
			   			if (flist == null) {
			   				System.out.println(
			   					"Empty directory or directory does not exists.");
			   			}
			   			else {
			
			   				// Print all files with same name in directory
			   				// as provided in object of MyFilenameFilter
			   				// class
			   				for (int i = 0; i < flist.length; i++) {
			   					p=1;
			   					System.out.println(flist[i]+" found");
			   					String line = null;
			   			        try
			   			        {
			   			            FileReader fileReader = new FileReader(flist[i]);
			   			            
			   			            // always wrap the FileReader in BufferedReader
			   			            BufferedReader bufferedReader = new BufferedReader(fileReader);
			   			            
			   			            while((line = bufferedReader.readLine()) != null)
			   			            {
			   			                System.out.println(line);
			   			            }
			   			            
			   			            // always close the file after its use
			   			            bufferedReader.close();
			   			        }
			   			        catch(IOException ex)
			   			        {
			   			            System.out.println("\nError occurred");
			   			            System.out.println("Exception Name: " +ex);
			   			        }
			   				}
			   				if(p==0)
			   				{
			   					System.out.println("Not found");
			   				}
			   			}break;
                 case 4:l=1;
                        break;
                 default:
          	        System.out.println("Invalid operation!");
          	        break;        
               }
        	 }System.out.println("BLO Application closed");
        	 break;
         case 3: k=1;
                 break;
         default:
 	        System.out.println("Invalid operation!");
 	        break;        
         }
	 }
		 System.out.println("Application closed");
	 }
}
