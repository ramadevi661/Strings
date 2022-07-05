package Strings;

public class Palindrome {

	public static void main(String[] args) {
		 java.util. Scanner sc =new  java.util.Scanner (System.in);
	
		String name = sc.nextLine();
		String reverse = "";
		char ch ;
		for(int i=0; i<name.length();i++)
		{
			ch = name.charAt(i);
			reverse = ch+reverse;
		}
		if(reverse.equals(name))
		{
		
System.out.println("true");
	}
		else
		{
			System.out.println("false");
		}
}
}