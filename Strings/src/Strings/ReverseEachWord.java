package Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		
		String str ="this is java";//0123 01 0123
		
		String[] a= str.split(" ");
		String reverse="";
		
	for(int i=0;i<a.length;i++)
	{
		String word=a[i];
		String reverseWord="";
		for(int j = word.length()-1;j>=0;j--)
		{
			reverseWord=reverseWord+word.charAt(j);
		}
		reverse=reverse+reverseWord+" ";
		}
	System.out.println(reverse);
	}
}

		
		
		
