package com.tka.sept26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example {

	//ObjectOutputStream foo = null;
	
	String path = "C:\\Users\\hp\\OneDrive\\Desktop\\Core Java Projects\\File_Handling_Project\\src\\com\\tka\\sept26\\stdDB.txt";
	
	public void writeFile() {
		
		try (ObjectOutputStream foo = new ObjectOutputStream(new FileOutputStream(path))) {
			//foo = new ObjectOutputStream(new FileOutputStream(path));
			
			foo.writeObject(new Student(1, "jay", "abc@gmail.com", "1234"));
			foo.writeObject(new Student(2, "viru", "xyz@gmail.com", "0000"));
			foo.writeObject(new Student(3, "naman", "jkl@gmail.com", "7896"));
			foo.writeObject(new Student(4, "tejas", "blank@gmail.com", "4521"));
			
			System.out.println("Data inserted Successfully...");
			if(foo != null) {
				try {
					foo.close();
					System.out.println("File Closed...");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		} catch(Exception e) {
			System.out.println("Invalid file or path...");
			e.printStackTrace();
		} 
	}
	
	
	public void readFile() {
		try(ObjectInputStream fii = new ObjectInputStream(new FileInputStream(path))){
			
			Object obj = fii.readObject();
			Student s1 = (Student)obj;
			System.out.println("File Opened Successfully...");
			System.out.println(s1);
			
			if(fii != null) {
				try {
					fii.close();
					System.out.println("File Closed...");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		} catch(Exception e) {
			System.out.println("Invalid path or file...");
			e.printStackTrace();
		}
	}
	
//	public void readAllFile() {
//		try(ObjectInputStream fii = new ObjectInputStream(new FileInputStream(path))){
////			Object obj = fii.readObject();
////			Student s1 = (Student)obj;
//			
//			Object i = 0;
//			while((i = fii.readObject()) != null) {
//				Student s1 = (Student)i;
//				System.out.println(s1);
//			}
//			
//			if(fii != null) {
//				try {
//					fii.close();
//					System.out.println("File Closed...");
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//		} catch(Exception e) {
//			System.out.println("Invalid path or file...");
//			e.printStackTrace();
//		}
//	}
	
	public void readFileTransient() {
		try(ObjectInputStream fii = new ObjectInputStream(new FileInputStream(path))){
			
			Object obj = fii.readObject();
			Student s1 = (Student)obj;
			System.out.println("File Opened Successfully...");
			System.out.println(s1);
			
			if(fii != null) {
				try {
					fii.close();
					System.out.println("File Closed...");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		} catch(Exception e) {
			System.out.println("Invalid path or file...");
			e.printStackTrace();
		}
	}
	
}
