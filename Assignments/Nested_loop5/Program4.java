/*
 WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.
Within a range. Take the start and end from user
Input: Enter start number - 2
Enter End number - 9
Output:
8 6 4 2
3 5 7 9

 */

import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Start : ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter End : ");
                int end=Integer.parseInt(br.readLine());
		int num=1;
		for(int i=end-1 ; i>=start ; i--){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		for(int i=start+1 ; i<=end ; i++){
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();

	}
}
