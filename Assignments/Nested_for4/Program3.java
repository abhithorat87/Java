/*
 10
 10 9
 9  8 7
 7  6  5 4
 */

class Pattern{
        public static void main(String[] abhi){
                int N=5;
		int num=10;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(num+"  ");
				num--;
                        }
			num++;
                        System.out.println();
                }
        }
}

