/*
 Print the following pattern
 A 1 B 2
 C 3 D
 E 4
 F

 */

class Pattern{
        public static void main(String[] abhi){
                int N=4;
		char ch='A';
		int num=1;
                for(int i=1 ; i<=N ; i++){
                        for(int j=1 ; j<=N-i+1 ; j++){
                                if(j%2==1){
                                        System.out.print(ch+" ");
					ch++;
				}else{
                                        System.out.print(num+" ");
					num++;
				}
                        }
                        System.out.println();
                }
        }
}


