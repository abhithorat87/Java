////Reverse the number

class Reverse{
        public static void main(String[] abhi){
		int N=123456;
		int rem=0;
		int rev=0;
		while(N!=0){
			rem=N%10;
			rev=rev*10+rem;
			N=N/10;
		}
		System.out.println("Reverse : "+rev);
        }
}

