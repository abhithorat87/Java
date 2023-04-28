//WAP to print the Factorial of given number

class Factorial{
        public static void main(String[] abhi){
		int N=5;
		int fact=1;
		while(N!=0){
			fact=fact*N;
			N--;
		}
		System.out.println("Factorial of number : "+fact);
        }
}

