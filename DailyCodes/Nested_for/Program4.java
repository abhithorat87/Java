/*
 Print the following pattern
 1
 1 2
 1 2 3 
 1 2 3 4

 */

class Pattern{
        public static void main(String[] abhi){
           	int N=4;
                for(int i=1 ; i<=N ; i++){
			int Num=1;
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(Num+" ");
				Num++;
                        }
                        System.out.println();
                }
        }
}

