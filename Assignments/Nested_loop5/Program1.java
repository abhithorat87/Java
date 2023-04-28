/*
write a program to print the following pattern
Take the input from user (use bufferedReader)

D4 C3 B2 A1
A1 B2 C3 D4
D4 C3 B2 A1
A1 B2 C3 D4

*/

import java.io.*;
class Pattern{
	public static void main(String[] abhi)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1 ; i<=row ; i++){
			int num=row;
			char ch=(char)(64+row);
			char ch1='A';
			int num1=1;
			for(int j=1;j<=row ; j++){
				if(i%2!=0){
					System.out.print(ch);
					System.out.print(num);
					System.out.print(" ");
					ch--;
					num--;
				}else{
					System.out.print(ch1);
					System.out.print(num1);
					System.out.print(" ");
					ch1++;
					num1++;
				}
			}
			System.out.println();
		}
	}
}
