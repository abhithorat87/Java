/*
 WAP to print the following pattern

  d d d d
  c c c c
  b b b b
  a a a a
 */

class Pattern{
        public static void main(String[] abhi){
		char ch='d';
                for(int i=0 ; i<4 ; i++){
                        for(int j=0 ; j<4 ; j++){
                                System.out.print(ch+"  ");
                                
                        }
			ch--;
                        System.out.println();
                }
        }
}

