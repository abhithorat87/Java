/*
write a program to print the following pattern
Row =5;
O
14  13
L   K   J 
9   8   7  6
E   D   C  B  A

Row = 4
10
I  H
7  6  5
D  C  B  A

*/

import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter rows : ");
                int row=Integer.parseInt(br.readLine());
		int num=((row*row)+row)/2;
		int num1=64+num;
		char ch=(char)(num1);

		for(int i=1 ; i<=row ; i++){
			for(int j=1 ; j<=i ; j++){
				if(i%2!=0){
					System.out.print(ch+"  ");
				}else{
					System.out.print(num+"  ");
				}
				ch--;
				num--;
			}
			System.out.println();
		}
	
	}
}
