package programs;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "abc";
		String s2= "cca"; 

		int b=0;
		if(s1.length()!=s2.length())
		   System.out.print("No");
		else {
		   for(int i=0;i<s1.length();i++) {
		      char s = s1.charAt(i);
		      for(int j=0;j<s2.length();j++) {
		         if(s==s2.charAt(j)){
		            b++;
		         } 
		      }
		      if(b==0)
		         break;
		   }
		   if(b==0)
		      System.out.print("No");
		   else 
		      System.out.print("YES");
		} 
		System.out.println("\n"+b);
	}

}
