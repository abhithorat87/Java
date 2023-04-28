/*
write a program to print the following pattern
Row =4
0
1 1
2 3 5
8 13 21 34

 */

import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter rows : ");
                int row=Integer.parseInt(br.readLine());

		int a=0,b=1;
		for(int i=1 ; i<=row ; i++){
			for(int j=1 ; j<=i ; j++){
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}

