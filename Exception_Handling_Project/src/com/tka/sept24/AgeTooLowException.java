package com.tka.sept24;

public class AgeTooLowException extends RuntimeException {

	AgeTooLowException(){
		super();
	}
	
	AgeTooLowException(String s){
		super(s);
	}


}
