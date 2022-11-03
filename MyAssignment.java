package Childmotivation;
import java.util.*;

public class MyAssignment {

	public static void main(String[] args) {
// Motivating a young child to study programming specifically Java
		 Scanner sc = new Scanner(System.in);
		String name;
		int Age;
		String color;
		String gender;
		String response;
		
		System.out.println("Hello beautiful baby,\n");
		System.out.print("Are you a girl or a boy?\n Enter b for boy and g for girl:");
		gender = sc.nextLine();
		
		if(gender.equals("b")) {
			System.out.println("Welcome my boy");
		}else if(gender.equals("g")) {
			System.out.println("Welcome my girl!");
		}else {
			System.out.println("Oooooooooops, its just invalid");
		}
		System.out.println("What is your name?");
		name = sc.nextLine();
		
	System.out.println("Oh welcome here my dear friend\n"    +name);
	
	System.out.println("Can we have some fun now my dear?\n Enter Yes or No\t" +name);
	 response = sc.nextLine();
	if(response.equals("No")) {
 System.out.println(" Oooooooops, have a nice day!");
}else if(response.equals("Yes12"
		+ "")) {
	System.out.println("Great my young one, lets continue...");
}
else{
	System.out.println("Oughs, its invalid baby!");
	}
	System.out.println("How old are you baby?" +name);
	Age = sc.nextInt();
	
	if(Age >= 18) {
		System.out.println("Ooooooooops, your are not eligible to have fun with me!");
	}else{ System.out.println("Oh, great baby, lets start");
	}
	System.out.println("Should i ask you a question baby?\n Enter Yes or No\n" +name);
	if(response.equals("No")) {
		System.out.println("Ooooooooops, you have bad manners");
	}else {
	System.out.println("Wawoooooo....");	
	}
	System.out.println("What is your favourite color");
	color = sc.nextLine();
	if(color.equals("green")) {
		System.out.println("Oh, you gat it right baby" +name);
	}else {
		System.out.println("Ooooops try again beautiful child");
	}
	
	System.out.println("Did you know the tehnique i have been using for all these?" +name);
	response = sc.nextLine();
	if(response.equals("No")) {
		System.out.println("Oh, i have been using JAVA programming, you can as well start learning, its just fun as you have seen!");
	}else {
		System.out.println("Oh, great hope you have had a nice moment with me");
	}
	
	System.out.println("Have a nice stay my great beautiful young friend" +name);
}}