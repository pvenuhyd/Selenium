package programs;

public class IsPrefectNumber {

	public void isPerfect(int number){
		
		int temp=0;
		
		for(int i=1;i<=number/2;i++){
			
			if(number%i==0){
				temp=temp+i;
				System.out.println(i);
			}
			
		}
		if(temp==number){
			System.out.println(number+" is perfect");
		}
		else
			System.out.println(number+" is not perfect");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsPrefectNumber p=new IsPrefectNumber();
		p.isPerfect(28);
		

	}

}
