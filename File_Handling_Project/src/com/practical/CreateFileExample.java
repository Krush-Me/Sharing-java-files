package com.practical;

import java.io.File;

public class CreateFileExample {

	public static void main(String[] args) {

		File f = new File("example.txt");

		try {
			if( f.createNewFile()) {
				System.out.println("File Created Successfully...");
			} else {
				System.out.println("File already exists...");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
