package CharMethod;

import java.util.Scanner;

public class CharMethod {

	public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the String");
	String text=scanner.nextLine();
	
	System.out.println(Second(text));
}	

	public static String Second( String word){
	
		char first=word.charAt(0);
		
		int almost=word.length()-2;
		
		char AlmostLast=word.charAt(almost);
		
		String fnl= first + " " +AlmostLast;
		
		return fnl;
}
}