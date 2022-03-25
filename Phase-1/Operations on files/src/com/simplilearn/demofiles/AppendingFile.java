package com.simplilearn.demofiles;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.FileReader;
	import java.io.FileWriter;
	 
	public class AppendingFile {
	     public static void main(String a[]){
	    	 try {
	             String data = " I'm new content.";

	             FileWriter fileWritter = new FileWriter("Myfile.txt",true);
	             BufferedWriter bw = new BufferedWriter(fileWritter);
	             bw.write(data);
	             bw.close();
	            FileReader fr = new FileReader("Myfile.txt");
	 	        
	 	            int content;
	 	            while ((content = fr.read()) != -1) {
	 	                System.out.print((char) content);
	 	            }
	          } catch(IOException e){
	             e.printStackTrace();
	          }
	        }
	  }

