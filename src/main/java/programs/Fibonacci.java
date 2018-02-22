package programs;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int x=1;
	int y=1;
	System.out.print(x+" "+y);
	for(int i=0;i<=n;i++){
		int z=x+y;
		System.out.print(" "+z);
		x=y;
		y=z;
	}
	System.out.println();
	// 2nd logic
	int f=1, se=1;
	System.out.print(f+" "+se);
	for(int i=1;i<=10;i++){
		int r=f+se;
		System.out.print(r+" ");
		f=se;
		se=r;
	}

	}

}
