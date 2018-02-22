package programs;

import java.util.StringTokenizer;

public class ReveseStringWords {
	
	String[] words;
	String s;
	 
	
public void reverse(){
		
String word = "I like this world"; 

String words[]=word.split(" ");


/* StringTokenizer st=new StringTokenizer(word," ");

      while(st.hasMoreTokens()){
    	  
    	  s=st.nextToken();
    	  
    	  for
      }
		
		System.out.println(s);*/
		for (int i = words.length - 1; i >= 0; i--) 
		{ 
		System.out.print(words[i]+"  "); 
		} 
		System.out.println("\n**********"); 

		for (int i = 0; i < words.length; i++) 
		{ 
		char[] chars = words[i].toCharArray();
		for (int j = chars.length - 1; j >= 0; j--) 
		{ 
			System.out.print(chars[j]+"  "); 
		} 
		
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReveseStringWords  r=new ReveseStringWords();
		
		r.reverse();

	}

}
