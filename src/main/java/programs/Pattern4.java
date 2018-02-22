package programs;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=7;i++){
			
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			
			for(int j=7;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=7;i>=1;i--){
			
		for(int k=1;k<=i;k++){
			
			System.out.print(" ");
			
		}
			for(int j=7;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
