//Count the elements in given number

class Count{
        public static void main(String[] abhi){
		int N=45763;
		int count=0;
		while(N!=0){
			count++;
			N=N/10;
		}
		System.out.println("Count of elements : "+count);
        }
}

