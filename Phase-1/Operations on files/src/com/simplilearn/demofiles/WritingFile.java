package com.simplilearn.demofiles;
import java.io.FileWriter;
import java.io.IOException; 
public class WritingFile {
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("Writefile.txt");    
	           fw.write("FileWriter class together with its write() method to write some text to the file.");    
	           fw.close();  
	           System.out.println("Successfully wrote to the file.");
	          }catch (IOException e) {
	              System.out.println("An error occurred.");
	              e.printStackTrace();
	            }   
	     }    
	}  

