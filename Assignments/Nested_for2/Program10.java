/*
 Print the following pattern
  F   5   D   3   B   1
  F   5   D   3   B   1
  F   5   D   3   B   1
  F   5   D   3   B   1
  F   5   D   3   B   1
  F   5   D   3   B   1
 */

class Pattern{
        public static void main(String[] abhi){
                int N=6;
                for(int i=1 ; i<=N ; i++){
			char ch='F';
			int num=N;
                        for(int j=1 ; j<=N ; j++){
                                if(j%2==1)
                                        System.out.print(ch+"   ");

				else
                                        System.out.print(num+"   ");
				ch--;
				num--;
                        }
                        System.out.println();
                }
        }
}


