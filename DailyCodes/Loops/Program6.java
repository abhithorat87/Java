//Given an integer N
//Print sum of its digits

class Demo{
	public static void main(String[] abhi){
		int N=8473;
		int sum=0;
		while(N!=0){
			sum=sum+(N%10);
			N=N/10;
		}
		System.out.println("Sum is "+sum);
	}
}
