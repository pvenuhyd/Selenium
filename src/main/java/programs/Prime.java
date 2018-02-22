package programs;

public class Prime {
	
	public void prime(int number){
		
		boolean flag=false;
		for(int i=2; i <number; i++){
           
			if(number%i==0){
				flag=true;
				break;
			}
		}
			if(flag){
				System.out.println(number+" is not prime");
			}
			else{
				System.out.println(number+" is prime");
			}
           
    
	}
	
	public void generatePrime(int number){
		
        for(int i=1; i <number; i++){
            
            boolean isPrime = true;
           
            //check to see if the number is prime
            for(int j=2; j<i; j++){
                   
                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
            // print the number
            if(isPrime)
                    System.out.print(i + " ");
    }
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime prime=new Prime();
		prime.prime(23);
		prime.generatePrime(50);
		

	}

}
