/*
 WAP to print the following pattern
  1 2 3 4
  2 3 4 5
  3 4 5 6
  4 5 6 7

class Pattern{
        public static void main(String[] abhi){
                for(int i=0 ; i<4 ; i++){
                        int N=i+1;
                        for(int j=0 ; j<4 ; j++){
                                System.out.print(N+"  ");
                                N++;
                        }
                        System.out.println();
                }
        }
}
*/

class Pattern{
        public static void main(String[] abhi){
		int count=0;
		int x=0;
                for(int i=1 ; i<=4 ; i++){
                       if(count==4){
		       	break;
		       }else{
		       		System.out.print(i+x+" ");
				if(i==4){
					i=0;
					x++;
					count++;
					System.out.println();
				}

		       }
                }
        }
}

