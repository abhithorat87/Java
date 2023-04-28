//Check the number is palindrome or not

class Palindrome{
        public static void main(String[] abhi){
		int N=121;
		int temp=N;
		int rev=0;
		while(N!=0){
			rev=rev*10+(N%10);
			N=N/10;
		}
		if(temp==rev)
			System.out.println(temp+" is a palindrome number");
		else
			System.out.println(temp+" is not a palindrome number");
        }
}

