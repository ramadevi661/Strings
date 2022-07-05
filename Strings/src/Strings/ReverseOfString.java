package Strings;

public class ReverseOfString {

	public static void main(String[] args) {
	
	String name ="hello all";
	String reverse="";
	char ch;
	for(int i=0; i<name.length();i++)
	{
		ch=name.charAt(i);
		reverse=ch+reverse;
	}
System.out.println(reverse);
}
}