/*
 3C 3C 3C 3C
 3C 3C 3C
 3C 3C
 3C

 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
		int num=3;
		char ch='C';
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=N-i+1 ; j++){
                                System.out.print(num);
                                System.out.print(ch);
                                System.out.print(" ");
                        }
                        System.out.println();
                }
        }
}

