import java.util.Scanner;

public class PalindromMain {

	public static void main(String[]args)
	{	    
		Scanner sc = new Scanner(System.in);
		System.out.print("Wort eingeben: ");
		String string = sc.nextLine();
		String st = string.toLowerCase();
		if(istPalindrom(st) == true)
			System.out.println(string + " ist ein Palindrom");
		else
			System.out.println(string + " ist kein Palindrom");
		sc.close();
		
	}

	public static boolean istPalindrom(String s)
	{  
		if(s.length() == 0 || s.length() == 1) {
			return true; 
		}
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return istPalindrom(s.substring(1, s.length()-1));
		}
		return false;
	}

}
