package com.syntax.class07;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		String month="March";
		//If month is Dec, Jan, Feb: Winter
		//If month is Mar, Apr, May: Spring
		//etc .. 
				
		
		switch(month) {
		
		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
			
		case "March":
		case "April":
		case "May":	
			System.out.println("Spring");
			break;
			
		case "June":
		case "July":
		case "August":	
			System.out.println("Summer");
			break;
			
		case "September":
		case "October":
		case "November":	
			System.out.println("Fall");
			break;
		}
	}

}
