/* WAP to print the following pattern
 14 15 16 17
 15 16 17 18
 16 17 18 19
 17 18 19 20
 */

class Pattern{
        public static void main(String[] abhi){
		int count=0;
		int x=0;
                for(int i=1 ; i<=4 ; i++){
                        if(count==4)
				break;
			else{
				System.out.print(13+i+x+"  ");
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

