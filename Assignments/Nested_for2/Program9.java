/*
  Print the following pattern

  1C3   4B2   9A1
  16C3  25B2  36A1
  49C3  64B2  81A1
 */

class Pattern{
        public static void main(String[] abhi){
                int N=3;
		int num1=1;
                for(int i=1 ; i<=N ; i++){
			char ch='C';
			int num2=3;
                        for(int j=1 ; j<=N ; j++){
                                System.out.print(num1*num1);
                                System.out.print(ch);
                                System.out.print(num2);
                                System.out.print("   ");
				num1++;
				ch--;
				num2--;

                        }
                        System.out.println();
                }
        }
}


