package com.practical;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileExample {

	public static void main(String[] args) {

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))){
			bw.write("Hello World...@1199");
			bw.write("\nThis file is example.txt");
			
			
			System.out.println("Data inserted successfully...");
		} catch( Exception e) {
			e.printStackTrace();
		}
		
	}

}
