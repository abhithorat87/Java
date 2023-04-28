//Print sum of all even numbers and multiplication of odd numbers.

class Sum{
        public static void main(String[] abhi){
		int N=5673892;
		int sum=0;
		int multi=1;
		int rem=0;
		while(N!=0){
			rem=N%10;
			if(rem%2==0)
				sum+=rem;
			else
				multi*=rem;
			N=N/10;
		}
		System.out.println("Sum of even numbers : "+sum);
		System.out.println("Multiplication of odd numbers : "+multi);
        }
}

