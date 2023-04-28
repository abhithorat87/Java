/*
write a program to print the following pattern
Row =8
$
@ @
& & &
# # # #
$ $ $ $ $
@ @ @ @ @ @
& & & & & & &
# # # # # # # #
 */

import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter row : ");
                int row=Integer.parseInt(br.readLine());
		for(int i=1 ; i<=row ; i++){
			for(int j=1 ; j<=i ; j++){
				if(i%4==0){
					System.out.print("#"+" ");
				}
				else if(i%3==0){
					System.out.print("&"+" ");
				}
				else if(i%2==0){
					System.out.print("@"+" ");
				}else if(i%1==0){
					System.out.print("$"+" ");
				}
			}
			System.out.println();
		}
	}
}
