/*
 Print the following pattern
 1 
 4  3 
 16 5 36
 49 8 81 10

 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
		int Num=1;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                if(j%2==1)
					System.out.print(Num*Num+"  ");
				else
					System.out.print(Num+"  ");
				Num++;
                        }
                        System.out.println();
                }
        }
}
