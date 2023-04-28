//Write a program to  find the maximum between three numbers

class Demo{
        public static void main(String[] abhi){
		int a=30;
		int b=40;
		int c=30;
		if(a>b && a>c)
			System.out.println(a+" is the gretest number");
		else if(b>a && b>c)
			System.out.println(b+" is the gretest number");
		else if(c>a && c>b)
			System.out.println(c+" is the gretest number");
		else if(a==b && a>c)
			System.out.println(a+" is the gretest number");
		else if(b==c && b>a)
			System.out.println(b+" is the gretest number");
		else if(c==a && c>b)
			System.out.println(c+" is the gretest number");
		else
			System.out.println("Invalid input");
        }
}

