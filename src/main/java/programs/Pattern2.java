package programs;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=7;i>=1;i--){
			
			for(int j=7;j>=i;j--){
				 
				 System.out.print(" ");
			 }
			
			 
			 for(int k=1;k<=i;k++){
				 System.out.print(k+" ");
			 }
			 System.out.println();
			 
			 
			 
		 }
		
		System.out.println("------------------");
		
		for(int i=7;i>=1;i--){
			
			for(int j=7;j>=i;j--){
				 
				 System.out.print(" ");
			 } 
			 
			for(int k=1;k<=i;k++){
				 System.out.print(i+" ");
			 }
			 System.out.println();
			 
		 }
		for(int i=7;i>=1;i--){
			
			 for(int j=7;j>=i;j--){
				 
				 System.out.print(" ");
			 } 
	
			 
			for(int k=1;k<=i;k++){
				 System.out.print(1+" ");
			 }
			 System.out.println();
		 
		 }
		for(int i=7;i>=1;i--){
			 
			for(int j=7;j>=i;j--){
				 
				 System.out.print(" ");
			 } 
			 
			for(int k=1;k<=i;k++){
				 System.out.print("*"+" ");
			 }
			 System.out.println();
			 
		}

	}

}
