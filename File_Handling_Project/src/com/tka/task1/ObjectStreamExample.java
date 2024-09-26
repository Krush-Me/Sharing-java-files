package com.tka.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {

	
	FileOutputStream fo = null;
	ObjectOutputStream foo = null;
	
	FileInputStream fi = null;
	ObjectInputStream foi = null;
	
	String path = "C:\\Users\\hp\\OneDrive\\Desktop\\Core Java Projects\\File_Handling_Project\\files_handle\\ObjectStreamEx.txt";
	
	Student s1 = new Student(1, "jay", 23,"Aws", 1742541226);
	
	public void writeFile() {
		
		try {
			
			fo = new FileOutputStream(path);
			
			foo = new ObjectOutputStream(fo);
			
			foo.writeObject(s1);
			
			
			System.out.println("Object Created...");
		} catch(Exception e) {
			System.out.println("Invalid file name or path");
			e.printStackTrace();
		} finally {
			
			try {
				if(foo != null) foo.close();
				if(fo != null) fo.close();
//				foo.close();
//				fo.close();
				//System.out.println("File closed...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}	
	}
	
	
	public void readFile() {
		try {
			fi = new FileInputStream(path);
			
			foi = new ObjectInputStream(fi);
			
			//foi.readObject();
			
			s1 = (Student) foi.readObject();

			System.out.println(s1);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if((fi != null && foi != null)) {
				try {
					fi.close();
					foi.close();
					System.out.println("File closed Successfully...");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
}
