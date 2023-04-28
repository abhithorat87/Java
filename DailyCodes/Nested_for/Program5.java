/*
 Print the following pattern
 10
 9 8 
 7 6 5
 4 3 2 1

 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
		int Num=10;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(Num+" ");
				Num--;
                        }
                        System.out.println();
                }
        }
}

