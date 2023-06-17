package IF_ELSE_CONDITION;

public class Quiz_3 {

	public static void main(String[] args) {
		//Write a program that solves this requirement : 
		/*Use If Else 
		If day value is 1 then print Monday 
		If day value is 2 then print Tuesday
		If day value is 3 then print Wednesday
		If day value is 4 then print Thursday
		If day value is 5 then print Friday
		If day value is 6 then print Saturday
		If day value is 7 then print Sunday
		else print Invalid Day in the console.

        */
		 int day;
		 day = 1;
		
		if(day==1) 
		 System.out.println("Monday");	

		else if(day==2) 
		 System.out.println("Tuesday");
		else if(day==3) 
		 System.out.println("Wednesday");		

		else if(day==4) 
		 System.out.println("Thursday");

		else if(day==5) 
		 System.out.println("Friday");

		else if(day==6) 
		 System.out.println("Saturday");
					
		else 
			System.out.println("invalid");
		
		
		
	}//main

}//class
