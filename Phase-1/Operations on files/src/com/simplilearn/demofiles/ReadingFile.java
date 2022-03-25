package com.simplilearn.demofiles;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadingFile {
	
	 
	
	    public static void main(String[] args)
	    {
	        File file = new File("Readfile.txt");
	 
	        try (FileReader fr = new FileReader(file))
	        {
	            int content;
	            while ((content = fr.read()) != -1) {
	                System.out.print((char) content);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


