package basics;

import java.util.ArrayList;

import com.kenai.jffi.Array;

public class DecimalToBinary {
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	public void binary(int number){
		
		while(number>0){
		list.add(number%2);
		number = number/2;
		}
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalToBinary obj=new DecimalToBinary();
		obj.binary(21);
		
		
	}

}
