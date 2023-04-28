/*
 J
 I H
 G F E
 D C B A

 */
class Pattern{
        public static void main(String[] abhi){
                int N=4;
		int x=(64+((N*N+N)/2));
		char ch=(char)(x);
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(ch+"  ");
				ch--;
                        }
                        System.out.println();
                }
        }
}

