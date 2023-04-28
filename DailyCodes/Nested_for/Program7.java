/*
 Print the following Pattern
  A B C D
  A B C
  A B
  A

 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
                for(int i=1 ; i<=N ; i++){
			char ch='A';
                        for(int j=1 ; j<=N-i+1 ; j++){
                                System.out.print(ch+" ");
				ch++;
                        }
                        System.out.println();
                }
        }
}
