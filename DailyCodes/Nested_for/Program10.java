/*
 Print the following pattern
 * 
 * #
 * # *
 * # * #
 * # * # *
 
 */

class Pattern{
        public static void main(String[] abhi){
                int N=5;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                if(j%2==1)
					System.out.print("* ");
				else
					System.out.print("# ");
                        }
                        System.out.println();
                }
        }
}
