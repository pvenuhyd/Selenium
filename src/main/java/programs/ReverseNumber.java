package programs;

public class ReverseNumber {

	public void reverseNumber(int number){
		
		int reverse=0;
		
		while(number!=0){
			
		reverse=reverse*10;
		reverse=reverse+number%10;
		number=number/10;
		}
		
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseNumber reverseNumber=new ReverseNumber();
		reverseNumber.reverseNumber(2537);

	}

}
