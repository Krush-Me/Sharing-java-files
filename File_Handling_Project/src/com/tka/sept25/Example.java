package com.tka.sept25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

	FileInputStream fi = null;
	FileOutputStream fo = null;
	String path = "D:\\Kiran Academy\\File_Handling_Files\\demo.txt";
	String path1 = "D:\\\\Kiran Academy\\\\File_Handling_Files\\\\demoCopy.txt";
	
	String path2 = "C:\\Users\\hp\\OneDrive\\Desktop\\Core Java Projects\\File_Handling_Project\\files_handle\\db.txt";
	String path3 = "C:\\Users\\hp\\OneDrive\\Desktop\\Core Java Projects\\File_Handling_Project\\files_handle\\dbCopy.txt";

	
	public void readFile() {
		try {
			fi = new FileInputStream(path2);
			fo = new FileOutputStream(path3);
			System.out.println("File Opened Successfully...");
			
//			int data = fi.read();
//			System.out.println(fi.read());  // this will print ASCII value of char
//			System.out.println((char)data);	// this will print characters or data -- but
//			System.out.println(fi.read());  // this will print next character and so on we have to write fi.read() methods

			
		
			int i = 0;
			while( (i = fi.read()) != -1 ) {
				// System.out.print((char)i); /**/
				fo.write(i);
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			System.out.println("Invalid file or path");
			e.printStackTrace();
		} finally {
			if(fi != null && fo != null) {
				try {
					fi.close();
					System.out.println("\nFile Closed...");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
} 

