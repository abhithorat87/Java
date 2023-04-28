//Square of even digits

class Square{
        public static void main(String[] abhi){
		int N=73658;
		int rem=1;
		while(N!=0){
			rem=N%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			N=N/10;
		}
        }
}

