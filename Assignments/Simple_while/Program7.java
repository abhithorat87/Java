//WAP take an input N if the number is even print reverse it by difference of 1
//and if the number is odd print it by difference 2

class Difference{
        public static void main(String[] abhi){
		int N=7;
		while(N!=0){
			if(N%2==0){
				while(N>0){
					System.out.println(N);
					N--;
				}
			}else{
				while(N>=1){
					System.out.println(N);
					N=N-2;
				}
			}
		}
        }
}

