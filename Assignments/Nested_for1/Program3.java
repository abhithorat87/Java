/* WAP to print the following Pattern
 14  14  14  14
 15  15  15  15
 16  16  16  16
 17  17  17  17
*/

class Pattern{
        public static void main(String[] abhi){
                for(int i=0 ; i<4 ; i++){
			int N=14+i;
                        for(int j=0 ; j<4 ; j++){
                                System.out.print(N+"  ");
                      
                        }
                        System.out.print("\n");
                }
        }
}

