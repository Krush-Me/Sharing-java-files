package com.tka.sept24;

public class AgeTooHighException extends RuntimeException{

	AgeTooHighException(){
		super();
	}
	
	AgeTooHighException(String s){
		super(s);
	}
}
