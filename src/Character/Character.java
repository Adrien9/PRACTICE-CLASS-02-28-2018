package Character;
import java.util.Scanner;
public class Character {

	public static void main(String[]args){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String s=scanner.nextLine();
		
		int count=s.length();
		System.out.println("The count is " + count);
		
		int last=count-1;
		
		String text=s;
		char c1=text.charAt(last);
		System.out.println(c1);
		
		
	}
}
