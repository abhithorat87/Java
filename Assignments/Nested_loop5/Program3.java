/*
 write a program to print the following pattern

5 4 3 2 1
8 6 4 2
9 6 3
8 4
5

 */


import java.io.*;
class Pattern{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter rows : ");
                int row=Integer.parseInt(br.readLine());
		for(int i=1 ; i<=row ; i++){
			int num=row;
			for(int j=1 ; j<=row-i+1 ; j++){
				if(i==1){
					System.out.print(num+" ");
					num--;
				}else{
					if(i%2==0){
						System.out.print(2*j);
						System.out.print(" ");
					}else{
						System.out.print(3*j);
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

        }
}

