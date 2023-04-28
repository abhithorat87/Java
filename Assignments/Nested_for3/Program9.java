/*
 1
 8  27
 64 125 216
 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
		int x=1;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(x*x*x+"  ");
				x++;
                        }
                        System.out.println();
                }
        }
}

