

import java.util.*;
class Demo{
	static void sub(int a,int b){
		int sub=a-b;
		System.out.println("Subtraction : "+sub);
	}
	static void mult(int a,int b){
		int mult=a*b;
		System.out.println("Multiplication : "+mult);
	}
	static void div(int a,int b){
		int div=a/b;
		System.out.println("Division : "+div);
	}
	public static void main(String[] abhi){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1 : ");
		int a=sc.nextInt();
		System.out.println("Enter no 2 : ");
		int b=sc.nextInt();
		sub(a,b);
		mult(a,b);
		div(a,b);
	}
}
