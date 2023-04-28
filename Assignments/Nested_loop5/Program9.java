/*

Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.
Input: 1234
Output: Addition of factorials of each digit from 1234 = 33

 */

import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number : ");
                int num=Integer.parseInt(br.readLine());
		int sum=0;
		while(num!=0){
			int rem=num%10;
			int fact=1;
			for(int i=1 ; i<=rem ; i++){
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println("Total sum : "+sum);

	}
}
