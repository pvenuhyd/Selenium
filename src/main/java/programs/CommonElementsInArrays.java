package programs;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1={5,9,0,2,9,4};
		int[] arr2={1,3,6,9,5,7,8,0,4};
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++){
			
			for(int j=0;j<arr2.length;j++){
				
				if(arr1[i]==arr2[j]){
					s.add(arr1[i]);
				}
			}
		}
		System.out.println(s);
		for(Integer i:s){
			System.out.print(i+" ");
		}

	}

}
