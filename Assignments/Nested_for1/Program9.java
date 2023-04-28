/*
 WAP to print the following pattern

  C B A
  C B A
  C B A
 */

class Pattern{
        public static void main(String[] abhi){
                for(int i=0 ; i<3 ; i++){
                        char ch='C';
                        for(int j=0 ; j<3 ; j++){
                                System.out.print(ch+"  ");
                                ch--;
                        }
                        System.out.println();
                }
        }
}

