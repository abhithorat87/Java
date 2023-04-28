/*
 WAP to print the following pattern

 12  12  12
 11  11  11
 10  10  10
 */

class Pattern{
        public static void main(String[] abhi){
                for(int i=0 ; i<3 ; i++){
                        int N=12-i;
                        for(int j=0 ; j<3 ; j++){
                                System.out.print(N+"  ");
                        }
                        System.out.print("\n");
                }
        }
}

