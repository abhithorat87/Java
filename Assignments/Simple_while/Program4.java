//Count the odd numbers in the given number

class Count{
        public static void main(String[] abhi){
		int N=253789365;
		int rem=0;
		int count=0;
		while(N!=0){
			rem=N%10;
			if(rem%2!=0)
				count++;
			N=N/10;
		}
		System.out.println("Count of odd numbers : "+count);
        }
}

