/*
 F
 E F
 D E F
 C D E F
 B C D E F
 A B C D E F
 */

class Pattern{
        public static void main(String[] abhi){
                int N=8;
                for(int i=1 ; i<=N ; i++){
			int num=64+N-i+1;
			char ch=(char)(num);
                        for(int j=1 ; j<=i ; j++){
                                System.out.print(ch+" ");
				ch++;
                        }
                        System.out.println();
                }
        }
}

