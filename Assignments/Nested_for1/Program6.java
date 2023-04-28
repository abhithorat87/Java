/*
 WAP to print the following Pattern

 9  8  7
 9  8  7
 9  8  7
 */

class Pattern{
        public static void main(String[] abhi){
                for(int i=0 ; i<3 ; i++){
                        int N=9;
                        for(int j=0 ; j<3 ; j++){
                                System.out.print(N+"  ");
                                N--;
                        }
                        System.out.print("\n");
                }
        }
}

