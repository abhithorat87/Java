/*
Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}

Input: a p
Output: The difference between a and p is 15

 */

import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter char1 : ");
                char ch1=(char)br.read();
		br.skip(1);
                System.out.println("Enter char2 : ");
                char ch2=(char)br.read();
		int count=-1;
		if(ch1==ch2){
			System.out.print(ch1+" "+ch2);
		}else{
			for(int i=ch1 ; i<=ch2 ; i++){
				count++;
			}	
		}
		System.out.println("The difference between a and p is : "+count);
	}
}
