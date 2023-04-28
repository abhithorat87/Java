/* Print the following pattern
 
 *   *
 *   *
 *   *
 *   *
 
 */

class Pattern{
	public static void main(String[] abhi){
		int N=4;
		for(int i=1 ; i<=N ; i++){
			for(int j=1 ; j<=N ; j++){
				if(j==1 || j==4){
					System.out.print("*");
				}
				else
					System.out.print("_");
			}
			System.out.println();
		}
	}

}
