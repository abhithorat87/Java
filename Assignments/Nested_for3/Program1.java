/*
 WAP to print the following pattern
 C2W
 C2W C2W
 C2W C2W C2W
 C2W C2W C2W C2W
 */

class Pattern{
	public static void main(String[] abhi){
		int N=4;
		for(int i=1 ; i<=N ; i++){
			for(int j=1 ; j<=i ; j++){
				System.out.print("C2W  ");
			}
			System.out.println();
		}
	}
}
