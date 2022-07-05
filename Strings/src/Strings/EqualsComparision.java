package Strings;

public class EqualsComparision {

	public static void main(String[] args)
	{

String s="ramadevi";
String s1="ramadevi";
System.out.println(s1==s);//it will  refer to the existed one instead of creating new reference//reference comparison
String s3=new String("umadevi");
String s4=new String("umadevi");
System.out.println(s3.equals(s4));//every time it will new object//content comparison

	}

}

//== operator: it should be used  during reference comparison
//== checks if both references points to same location or not
//operator cannot be overridden


//equal(): is a method of object class
//equals() method should be used for content comparison. 
//equals() method evaluates the content to check the equality.
//equals() method if not present and Object.equals() method is utilized, otherwise it can be overridden.