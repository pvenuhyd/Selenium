package programs;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={5,8,2,7,8,8,6,9,5};
		
		for(int i=0;i<array.length;i++){
			
			boolean flag=false;
			
			for(int j=0;j<i;j++){
				
				if(array[i]==array[j]){
					
					flag=true;
					break;
				}
				
			}
			if(!flag)
				System.out.print(array[i]+" ");
		}

	}

}
