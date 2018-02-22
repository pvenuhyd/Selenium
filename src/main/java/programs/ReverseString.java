package programs;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	String rev="";
	System.out.println("Enter name");
	String s1=s.nextLine();
	for(int i=s1.length()-1;i>=0;i--){
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);

	}

}
