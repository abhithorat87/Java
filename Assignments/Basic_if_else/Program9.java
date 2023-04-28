//Write a program in java to accept three number and check whether they are pythagorean triplets or not.

class Demo{
        public static void main(String[] abhi){
		int a=3;
		int b=4;
		int c=5;
		if(((a*a)+(b*b)==c*c) || ((b*b)+(c*c)==a*a) || ((a*a)+(c*c)==b*b)){
			System.out.println("It is a pythagorean triplet");
		}else
			System.out.println("It is not a pythagorean triplet");
        }
}

