package String;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Output: ");
	
//String:- Collection of Characters
		String a="VaibhavKalubarme";
		String b="Tester";
		String s=" Java ";
		
		System.out.println("Name of the String A= "+a);
		System.out.println("Name of the String B= "+b);
		
//Length of String:- length is used to find the length of given type no.of characters return type int.
		int l=a.length();
		System.out.println("Length of a is "+l);
		System.out.println(b.length());
		
//Join 2 String:-
		String concat =a+b;
		System.out.println(concat);
		
//Compare:-
		String al="VaibhavKalubarme";
		System.out.println(a.equals(al));
		
//charAt:- it is used to find charater in the given string.return type char
		System.out.println(b.charAt(0));
		
//equalsIgnoreCase:-
		System.out.println(a.equalsIgnoreCase(a));
	
//toLowerCase:- coverting string to lowercase
		System.out.println(a.toLowerCase());
		
//toUpperCase:- Coverting string to UpperCase
		System.out.println(a.toUpperCase());
		
//trim:- deleting starting spaces in the string
		System.out.println(s);
		System.out.println(s.trim());
		
//index of:- used to find the index of the give charater.return integer value
		System.out.println(a.indexOf('a'));
		
//last index of:- last  of string.return int value
		System.out.println(a.lastIndexOf('a'));
		
//replace:- replacing string to given string
		System.out.println(a.replace('a', '*'));

	}

}
