/*
 9
 9 8
 9 8 7
 9 8 7 6
 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
                for(int i=1 ; i<=N ; i++){
			int num=9;
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(num+" ");
				num--;
                  
                        }
                        System.out.println();
                }
        }
}

