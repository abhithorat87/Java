/*
 Print the following Pattern
 1
 2 3
 4 5 6 
 7 8 9 10
 11 12 13 14 15

 */

class Pattern{
        public static void main(String[] abhi){
                int N=5;
		int num=1;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(num+" ");
				num++;
                        }
                        System.out.println();
                }
        }
}
