package programs;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=7;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=7;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=7;i>=1;i--){
			for(int k=7;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=7;i++){
			for(int k=7;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=7;i>=1;i--){
			for(int k=7;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=7;i++){
			for(int k=7;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}



	}

}
