/*
 C2W10
 C2W9  C2W8 
 C2W7  C2W6  C2W5
 C2W4  C2W3  C2W2 C2W1

 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
		int num=10;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=i ; j++){
                                System.out.print("C2W");
                                System.out.print(num);
                                System.out.print("   ");
				num--;
                        }
                        System.out.println();
                }
        }
}

